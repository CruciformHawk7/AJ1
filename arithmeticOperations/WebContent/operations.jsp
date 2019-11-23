<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<% int num1=Integer.parseInt(request.getParameter("inp1"));
	   int num2=Integer.parseInt(request.getParameter("inp2")); %>
	Sum is <% out.println((num1+num2)); %> <br>
	Difference is <% out.println((num1-num2)); %> <br>
	Product is <% out.println((num1*num2)); %> <br>
	Quotient is <% out.println((num1/num2)); %> <br>
</body>
</html>