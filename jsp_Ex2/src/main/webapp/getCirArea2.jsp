<%@page import="dedu.hi.ex.Circle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	double r = Double.parseDouble(request.getParameter("radius")); 
	Circle c =new Circle(r);
%>
<%= c.getArea() %>
</body>
</html>