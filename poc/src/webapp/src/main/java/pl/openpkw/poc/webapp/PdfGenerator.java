package pl.openpkw.poc.webapp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;

import org.apache.velocity.VelocityContext;
import org.jboss.vfs.VirtualFile;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;

public class PdfGenerator {

	private VelocityEngine velocity = new VelocityEngine();

	public byte[] generatePdf(Formularz formularz) {
		try {
			velocity.initialize();
			VelocityContext context = new VelocityContext();
			context.put("form", formularz);

			String html = velocity.process("/templates/pdf_template.html", context);
			File htmlFile = File.createTempFile("openpkw-" + Calendar.getInstance().getTimeInMillis(), ".html");
			String tempDirectory = htmlFile.getParent();
			FileOutputStream out = new FileOutputStream(htmlFile);
			out.write(html.getBytes("UTF-8"));
			out.close();

			try {
				Files.copy(this.getClass().getResourceAsStream("/templates/styles.css"), FileSystems.getDefault().getPath(tempDirectory + "/styles.css"), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception ex) {
				System.out.println("Warning: Could not overwrite styles.css. This file may be obsolete.");
			}

			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ITextRenderer renderer = new ITextRenderer();

			File fontsFolder = getFontsFolder();
			String fontsFolderPath = fontsFolder.getAbsolutePath() + File.separatorChar;
			String[] getFontFileNames = fontsFolder.list();

			for (String fontName : getFontFileNames) {
				String fontFullPath = fontsFolderPath + fontName;
				System.out.println("Loading font " + fontFullPath);
				renderer.getFontResolver().addFont(fontFullPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			}

			renderer.setDocument(htmlFile);
			renderer.layout();
			renderer.createPDF(os);
			os.close();
			byte[] result = os.toByteArray();

			try {
				Files.delete(FileSystems.getDefault().getPath(tempDirectory + "/styles.css"));
			} catch (Exception ex) {
				System.out.println("Warning: Could not delete styles.css");
			}

			return result;
		} catch (Exception ex) {
			throw new RuntimeException("Failed to generate a PDF document: " + ex.getMessage(), ex);
		}
	}

	private File getFontsFolder() {
		try {
			URL fontsFolderName = this.getClass().getResource("/fonts");
			File fontsFolder = null;
			if (fontsFolderName.getProtocol().equals("vfs")) {
				URLConnection conn = fontsFolderName.openConnection();
				VirtualFile vf = (VirtualFile) conn.getContent();
				fontsFolder = vf.getPhysicalFile();
			} else {
				fontsFolder = new File(fontsFolderName.toURI());
			}

			return fontsFolder;
		} catch (Exception ex) {
			throw new RuntimeException("Failed to get a list of font file names: " + ex.getMessage(), ex);
		}
	}

	public byte[] stamp(Formularz formularz) {
		try {
			PdfReader pdfReader = new PdfReader(this.getClass().getResource("/templates/prezydent_2015.pdf"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			PdfStamper pdfStamper = new PdfStamper(pdfReader, out);

			Field[] fields = Formularz.class.getDeclaredFields();
			for (Field f : fields) {
				f.setAccessible(true);
				Annotation a = f.getAnnotation(FormElement.class);
				if (a != null) {
					String text = (String) f.get(formularz);
					int page = ((FormElement) a).page();
					int x = ((FormElement) a).x();
					int y = ((FormElement) a).y();
					print(pdfStamper, text, page, x, y);
				}
			}

			for (int i = 1; i <= pdfReader.getNumberOfPages(); i++) {
				Image barcode = Image.getInstance(this.getClass().getResource("/barcode.jpeg"));
				barcode.setAbsolutePosition(45f, 10f);
				PdfContentByte content = pdfStamper.getUnderContent(i);
				content.addImage(barcode);
			}

			pdfStamper.close();
			out.close();
			return out.toByteArray();
		} catch (Exception ex) {
			throw new RuntimeException("Failed to stam the form: " + ex.getMessage(), ex);
		}

	}

	private void print(PdfStamper stamper, String text, int page, int x, int y) throws Exception {
		PdfContentByte content = stamper.getUnderContent(page);
		File fontsFolder = getFontsFolder();
		String timesFontPath = fontsFolder.getAbsolutePath() + File.separatorChar + "times.ttf";
		BaseFont bf = BaseFont.createFont(timesFontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		Font f = new Font(bf, 10);
		f.setColor(0, 0, 0);
		Phrase p = new Phrase(text, f);
		ColumnText.showTextAligned(content, Element.ALIGN_LEFT, p, x, y, 0);
	}
}