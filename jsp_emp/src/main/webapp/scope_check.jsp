<%@page import="edu.hi.ex.dto.EmpDto"%>
<%@page import="edu.hi.ex.dao.EmpDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.hi.ex.dto.DeptDto"%>
<%@page import="edu.hi.ex.dao.DeptDao"%>
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
	String page_scope = (String)pageContext.getAttribute("page_scope");
	String request_scope = (String)request.getAttribute("request_scope");
	String session_scope = (String)session.getAttribute("session_scope");
	String app_scope = (String)application.getAttribute("app_scope");
	
	out.print(page_scope + "<br>");
	out.print(request_scope + "<br>");
	out.print(session_scope + "<br>");
	out.print(app_scope + "<br>");
%>

applicationScope : ${ applicationScope.app_scope} <br />
sessionScope : $ {sessionScope.session_scope}<br/>
sessionScope : ${ sessionScope.session_scope }<br />
pageScope : $ {pageScope.page_scope}<br/>
requestScope : $ {requestScope.request_scope}<br/>

</body>
</html>