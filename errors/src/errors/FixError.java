package errors;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class FixError extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String requestUrl = (String) request.getAttribute("javax.servlet.error.request_uri");
	    response.setContentType("text/html");
	    response.getWriter().write("<html><head><title>Error"
	    + "</title></head><body>"
	    + "<h3>Error!</h3>"
	    + "Status Code:"+statusCode+"<br>"
	    + "Requested URI:"+requestUrl     
	    + "<br><br>"
	    +"</body></html>");
	}
}