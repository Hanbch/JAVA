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

	DeptDao dao = new DeptDao();

	ArrayList<DeptDto> dtos = dao.deptSelect();
	
	for(int i=0; i<dtos.size(); i++){
		DeptDto dto = dtos.get(i);
		
		out.print("부서번호 : " + dto.getDeptno() +
				  "직종이름 : " + dto.getDname() +
				  "지역 : " + dto.getLoc() + "<br>" 
				);
	}
%>
</body>
</html>