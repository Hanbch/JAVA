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
	
	int result = dao.empInsert();
	
	out.print("잘 되었나====" + result);
	
	ArrayList<EmpDto> dtos = dao.empSelect();
	
	for(EmpDto emp : dtos){
	   
	   out.print(" 직원번호 : " + emp.getEmpno() +
	           " 직원이름 : " + emp.getEname() + 
	           " 월급 : " + emp.getJob() + "<br>");
	   
	}
%>
</body>
</html>