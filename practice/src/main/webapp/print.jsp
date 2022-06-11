<%@page import="com.prac.db.dto.empDto"%>
<%@page import="com.prac.db.dao.empDao"%>
<%@page import="java.util.ArrayList"%>
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
	empDao dao = new empDao();

	ArrayList<empDto> dtos = dao.empSelect();
	
	for(int i=0; i<dtos.size(); i++){
		empDto dto = dtos.get(i);
		out.print(dto.getDeptno() +"<br>"+ dto.getEname()+"<br>" + dto.getJob()+"<br>");
	}
	
%>
</body>
</html>