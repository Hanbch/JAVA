<%@page import="java.util.ArrayList"%>
<%@page import="parc02.dao.Dao"%>
<%@page import="parc02.dto.Dto"%>
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
	//Dao dao = new Dao();
	//ArrayList<Dto> dtos = dao.list();
	//pageContext.setAttribute("list",dtos);
%>
<table border="1">
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>제목</td>
		<td>날찌</td>
		<td>조회수</td>
	</tr>
	
	<c:forEach items="${list}" var="list">
		<tr>
			<td>${list.bid}</td>
			<td>${list.btitle}</td>
			<td>${list.bname}</td>
			<td>${list.bdate}</td>
			<td>${list.bhit}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>