package pl.openpkw.poc.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PdfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handle(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handle(request, response);
	}

	private void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("pdfMethod");
		if (method.equals("1")) {
			generate_v1(request, response);
		} else {
			generate_v2(request, response);
		}
	}

	private void generate_v1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PdfGenerator generator = new PdfGenerator();
		byte[] pdfDocument = generator.generatePdf();
		response.getOutputStream().write(pdfDocument);
	}

	private void generate_v2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PdfGenerator generator = new PdfGenerator();
		Formularz f = new Formularz();
		f.setKodTerytorialnyGminy(request.getParameter("kodGminy"));
		f.setNumerObwoduGlosowania(request.getParameter("nrObwodu"));
		f.setSiedzibaObwodowejKomisjiWyborczej(request.getParameter("adresOKW"));
		f.setGminaDzielnica(request.getParameter("gmina"));
		f.setPowiat(request.getParameter("powiat"));
		f.setWojewodztwo(request.getParameter("wojewodztwo"));
		f.setDataGlosowania("15 marca 2015 r.");
		f.setDzienMiesiacGlosowania("15 marca");
		f.setRokGlosowania("15");
		f.setGodzinaGlosowaniaOd("7:00");
		f.setGodzinaGlosowaniaDo("21:00");
		f.setPole_I_1("pole_I_1");
		f.setPole_I_2("pole_I_2");
		f.setPole_I_3("pole_I_3");
		f.setPole_I_4("pole_I_4");
		f.setPole_I_5("pole_I_5");
		f.setPole_I_6("pole_I_6");
		f.setPole_I_7("pole_I_7");
		f.setPole_I_8("pole_I_8");
		f.setPole_I_8a("pole_I_8a");
		f.setPole_I_8b("pole_I_8b");
		f.setPole_I_8c("pole_I_8c");
		f.setPole_I_8d("pole_I_8d");
		f.setPole_I_8e("pole_I_8e");
		byte[] pdfDocument = generator.stamp(f);
		response.getOutputStream().write(pdfDocument);
	}
}