package pl.openpkw.poc.webapp.velocityengine;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import junit.framework.Assert;

import org.apache.velocity.VelocityContext;
import org.junit.Test;

import pl.openpkw.poc.webapp.VelocityEngine;

public class When_processing_template {

	private VelocityEngine cut = new VelocityEngine();

	@Test
	public void should_preserve_character_encoding_UTF_8_with_BOM() {
		tryFile("velocity/pdf_template_UTF-8_with_BOM.html");
	}

	@Test
	public void should_preserve_character_encoding_UTF_8_without_BOM() {
		tryFile("velocity/pdf_template_UTF-8_without_BOM.html");
	}
	
	@Test
	public void should_preserve_character_encoding_in_real_HTML_template() {
		tryFile("velocity/pdf_template.html");
	}

	private void tryFile(String templateFile) {
		cut.initialize();
		String expectedOutput = loadFile("/"+templateFile);
		String actualOutput = cut.process(templateFile, new VelocityContext());
		System.out.println("Expected output: "+expectedOutput);
		System.out.println("Actual output: "+actualOutput);
		Assert.assertEquals(expectedOutput, actualOutput);
	}

	private String loadFile(String fileName) {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			InputStream in = this.getClass().getResourceAsStream(fileName);
			byte[] buffer = new byte[1024];
			int readBytes = 0;
			do {
				readBytes = in.read(buffer);
				if (readBytes > 0) {
					out.write(buffer, 0, readBytes);
				}
			} while (readBytes > 0);
			in.close();
			out.close();
			String result = new String(out.toByteArray(), "UTF-8");
			System.out.println("Input file: "+result);
			return result;

		} catch (Exception ex) {
			throw new RuntimeException("Failed to load file " + fileName + ": " + ex.getMessage(), ex);
		}
	}
}