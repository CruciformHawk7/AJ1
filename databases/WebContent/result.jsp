<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>

 <% int id = Integer.parseInt(request.getParameter("id"));
  Class.forName("org.mariadb.jdbc.Driver");
  java.sql.Connection connection = java.sql.DriverManager.getConnection
		  ("jdbc:mysql://localhost:3306/?user=nikhil&&password=123456"); 
  java.sql.Statement st = connection.createStatement();
  java.sql.ResultSet rs = st.executeQuery("SELECT * FROM mydb.students WHERE id='" + id + "';");
  %>
  ID: <%= id %>
  <% while (rs.next()) { %>
  AJ : <%= rs.getObject(2) %>
  ACA: <%= rs.getObject(3) %>
  ACN: <%= rs.getObject(4) %>
  <%} %>
  
  </body>
 </html>
  
  
  
  
  
</body>
</html>