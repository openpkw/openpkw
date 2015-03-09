package pl.openpkw.poc.webapp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

@Singleton
public class VelocityEngine {

	@PostConstruct
	public void initialize() {
		Properties velocityProperties = new Properties();
		velocityProperties.setProperty("resource.loader", "classpath");
		velocityProperties.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		velocityProperties.setProperty("input.encoding", "UTF-8");
//		velocityProperties.setProperty("output.encoding", "UTF-8");
		Velocity.init(velocityProperties);
	}

	public String process(String templateName, VelocityContext context) {
		try {
			Template template = Velocity.getTemplate(templateName);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");
			template.merge(context, outWriter);
			outWriter.close();
			String result = new String(out.toByteArray(), "UTF-8");
			return result;
		} catch (Exception ex) {
			throw new RuntimeException("Failed to process a Velocity template: " + ex.getMessage(), ex);
		}
	}
}