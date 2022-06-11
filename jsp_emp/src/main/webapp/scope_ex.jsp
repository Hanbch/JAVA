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
<form action="scope_check.jsp" method="get">
	<input type="submit" value="전송">
</form>
<%
	pageContext.setAttribute("page_scope","페이지영역"); //범위 : 해당 페이지에서만 사용가능
	request.setAttribute("request_scope","리퀘스트영역");//포워딩 까지
	session.setAttribute("session_scope","세션영역");//tomcat서버에설정된 시간 내에서만 유효
	application.setAttribute("app_scope","어플리케이션영역");//project가 끝날때까지 
	
	String page_scope = (String)pageContext.getAttribute("page_scope");
	String request_scope = (String)request.getAttribute("request_scope");
	String session_scope = (String)session.getAttribute("session_scope");
	String app_scope = (String)application.getAttribute("app_scope");
	
	out.print(page_scope + "<br>");
	out.print(request_scope + "<br>");
	out.print(session_scope + "<br>");
	out.print(app_scope + "<br>");
	
%>
<jsp:forward page="scope_check.jsp" />
</body>
</html>