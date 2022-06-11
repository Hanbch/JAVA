<%@page import="edu.hi.ex.dto.deptDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.hi.ex.dao.deptDao"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	deptDao dao = new deptDao();
	ArrayList<deptDto> dtos = dao.deptSelect();
	
	for(int i=0; i<dtos.size();i++){
		deptDto dto = dtos.get(i);
		
		out.print(dto.getDname() + "<br>" + dto.getDeptno()  + "<br>"  +  dto.getLoc() + " succes");
	}
%>

</body>
</html>