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
	Dao dao = new Dao();

	ArrayList<Dto> dtos = dao.deptSelect();
	
	for(int i=0; i<dtos.size(); i++){
		Dto dto = dtos.get(i);
		
		out.print("부서번호 : " + dto.getDeptno() +
				  "직종이름 : " + dto.getDname() +
				  "지역 : " + dto.getLoc() + "<br>" 
				);
	}
%>
</body>
</html>