package pl.openpkw.poc.webapp.pdf;

import java.io.FileOutputStream;

import org.junit.Test;

import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

public class PDF_modification_test {

	@Test
	public void modify_existing_PDF_document() throws Exception {
		PdfReader pdfReader = new PdfReader(this.getClass().getResource("/prezydent_2015.pdf"));
		PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("HelloWorld-Stamped.pdf"));

		print(pdfStamper, "Elemele-dutki", 1, 10, 10);
		
		pdfStamper.close();
	}

	private void print(PdfStamper stamper, String text, int page, int x, int y) {
		PdfContentByte content = stamper.getUnderContent(page);
		ColumnText.showTextAligned(content, Element.ALIGN_LEFT, new Phrase(text), x, y, 0);
	}
}
