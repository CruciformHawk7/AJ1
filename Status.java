import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class showError extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      response.sendError(403, "Access Forbidden");
      response.sendRedirect("/login");
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request, response);
   }
}