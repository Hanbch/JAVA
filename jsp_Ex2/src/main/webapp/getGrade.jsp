<%@page import="dedu.hi.ex.Grade"%>
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
	String grade;
	int kor,eng,math;
	
	kor = Integer.parseInt(request.getParameter("kor"));
	eng = Integer.parseInt(request.getParameter("eng"));
	math = Integer.parseInt(request.getParameter("math"));

	Grade g1 = new Grade();
	g1.setGrade(kor,eng,math);
	
%>
<%= g1.getGrade()%>
</body>
</html>