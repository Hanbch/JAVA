<%@page import="edu.hi.ex02.dto.DeptDto"%>
<%@page import="edu.hi.ex02.dao.DeptDao"%>
<%@page import="edu.hi.ex02.dto.Dto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.hi.ex02.dao.Dao"%>
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
	DeptDao dao = new DeptDao();
	ArrayList<DeptDto> dtos = dao.deptSelect();
	
	for(int i=0; i<dtos.size(); i++){
		DeptDto dto = dtos.get(i);
		
		out.print(dto.getDname() + "<br>" + dto.getDeptno()  + "<br>"  +  dto.getLoc() + " succes");
	}
%>
</body>
</html>