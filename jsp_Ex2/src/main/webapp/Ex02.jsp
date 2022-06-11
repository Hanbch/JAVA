<%@page import="dedu.hi.ex.Circle"%>
<%@page import="java.util.Arrays"%>
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
	int[] iArr =  {10,20,30};

	Circle c = new Circle(100);

%>

<%= Arrays.toString(iArr) %>
<%= c.getArea()%>

	
</body>
</html>