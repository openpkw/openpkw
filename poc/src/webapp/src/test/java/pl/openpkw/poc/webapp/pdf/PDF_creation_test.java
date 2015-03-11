package pl.openpkw.poc.webapp.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.junit.Test;

import pl.openpkw.poc.webapp.Formularz;
import pl.openpkw.poc.webapp.PdfGenerator;

public class PDF_creation_test {
	
	@Test
	public void hopsa() throws Exception {
		PdfGenerator generator = new PdfGenerator();
		Formularz formularz = new Formularz();
		byte[] pdf = generator.generatePdf(formularz);
		File output = new File("output"+Calendar.getInstance().getTimeInMillis()+".pdf");
		FileOutputStream out = new FileOutputStream(output);
		out.write(pdf);
		out.flush();
		out.close();
	}
}
