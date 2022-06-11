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
	
	for(int i=0; i<dtos.size(); i++){
		EmpDto dto = dtos.get(i);
		
		out.print("부서번호 : " + dto.getEmpno() +
				  "직종이름 : " + dto.getEname() +
				  "지역 : " + dto.getJob() + "<br>" 
				);
	}
%>
</body>
</html>