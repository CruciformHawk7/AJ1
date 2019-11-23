<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<% int num1 = Integer.parseInt(request.getParameter("inp1"));
	   int num2 = Integer.parseInt(request.getParameter("inp2")); %>
	Sum is <%= num1+num2 %> <br>
	Difference is <%= num1-num2 %> <br>
	Product is <%= num1*num2 %> <br>
	Quotient is <%= num1/num2 %> <br>
</body>
</html>