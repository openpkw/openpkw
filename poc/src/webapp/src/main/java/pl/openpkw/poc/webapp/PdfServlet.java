package pl.openpkw.poc.webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PdfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PdfServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int version = 1;

		if (request.getQueryString() != null && request.getQueryString().contains("version_1")) {
			version = 1;
		}

		if (request.getQueryString() != null && request.getQueryString().contains("version_2")) {
			version = 2;
		}
		
		if (version == 1) {
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
	
	private void generate_v2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		PdfGenerator generator = new PdfGenerator();
		Formularz f = new Formularz();
		f.setKodTerytorialnyGminy("180801");
		f.setNumerObwoduGlosowania("5");
		f.setSiedzibaObwodowejKomisjiWyborczej("Gimnazjum Miejskie im. W³adys³awa Jagie³³y, Le¿ajsk ul. Sk³odowskiej 8, 37-300 Le¿ajsk");
		f.setGminaDzielnica("m. Le¿ajsk");
		f.setPowiat("le¿ajski");
		f.setWojewodztwo("podkarpackie");
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}