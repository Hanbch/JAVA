
<%@page import="prac.dto.Bdto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="prac.dao.Bdao"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		//Bdao dao = new Bdao();
		//ArrayList<Bdto> dtos = dao.list();
		
		//pageContext.setAttribute("dtos",dtos);
	%>
	
	<table border="1">
		
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>조회수</td>
		</tr>
		
		<c:forEach var="dtos" items="${dtos}">
			<tr>
				<td>${dtos.bid} </td>
				<td>${dtos.bname} </td>
				<td>${dtos.btitle} </td>
				<td>${dtos.bdate} </td>
				<td>${dtos.bhit} </td>
			</tr>
		</c:forEach>
		
	
	</table>
</body>
</html>