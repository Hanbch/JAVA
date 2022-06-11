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

	EmpDao dao = new EmpDao();

	ArrayList<EmpDto> dtos = dao.empSelect();
	
	
	EmpDto dto = dtos.get(0);
		
	pageContext.setAttribute("dto", dto);
	pageContext.setAttribute("scott", dtos.get(1));
%>

<br>

${dto.ename}<br>
${dto.job}<br>
${scott.job}<br>
${scott.ename}<br>

</body>
</html>