package pl.openpkw.poc.webapp;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

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
		Formularz f = getDaneFormularza(request);
		byte[] pdfDocument = generator.generatePdf(f);
		response.getOutputStream().write(pdfDocument);
	}

	private void generate_v2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PdfGenerator generator = new PdfGenerator();
		Formularz f = getDaneFormularza(request);
		byte[] pdfDocument = generator.stamp(f);
		response.getOutputStream().write(pdfDocument);
	}

	private Formularz getDaneFormularza(HttpServletRequest request) {
		Formularz formularz = new Formularz();

		Field[] fields = Formularz.class.getDeclaredFields();
		for (Field f : fields) {
			try {
				f.setAccessible(true);
				Annotation a = f.getAnnotation(RequestParameter.class);
				if (a != null) {
					String parameterName = ((RequestParameter) a).value();
					if (parameterName.equals("")) {
						parameterName = f.getName();
					}
					String parameterValue = request.getParameter(parameterName);
					if (parameterValue != null) {
						parameterValue = new String(parameterValue.getBytes("iso-8859-1"), "UTF-8");
					}
					f.set(formularz, parameterValue);
				}
			} catch (Exception ex) {
				throw new RuntimeException("Failed to set field " + f.getName() + ": " + ex.getMessage(), ex);
			}
		}

		return formularz;
	}

}