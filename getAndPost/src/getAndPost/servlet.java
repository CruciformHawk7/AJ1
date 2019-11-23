package getAndPost;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html = "<html>"
				+ "<head><title>Login</title></head>"
				+ "<body>"
				+ "<h3>Login</h3>"
				+ "<form method=\"post\">"
				+ "Username: <input type=\"text\" name=\"uname\"><br>"
				+ "Password: <input type=\"password\" name=\"pwd\""
				+ ">"
				+ "<input type=\"submit\">"
				+ "</form></body></html>";
		response.setContentType("text/html");
		response.getWriter().println(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		response.setContentType("text/html");
		if (userName.equals("nikhil") && password.equals("hello")) {
			response.getWriter().print("<html><head><title>Welcome, " + userName + "</title>"
					+ "</head><body><h3>Welcome, this is a servlet</h3></bodY></html>");
		} else {
			response.getWriter().print("<html><head><title>LOGIN FAILED</title>"
					+ "</head><body><h3>Invalid username or password!</h3></bodY></html>");
			doGet(request, response);
		}
	}

}
