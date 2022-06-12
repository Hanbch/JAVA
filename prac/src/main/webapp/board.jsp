<%@page import="edu.hi.ex.dto.DeptDto"%>
<%@page import="edu.hi.ex.dao.DeptDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.prac.db.dto.BDto"%>
<%@page import="com.prac.db.dao.BDao"%>
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
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.boardSelect();
		
		pageContext.setAttribute("dtos",dtos);
		
	%>
	<table width="500" border="1">
		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>제목</td>
			<td>날짜</td>
			<td>히트</td>
		</tr>
	
        <!--이때 list는 BListCommand에서 메모리에 올린 list를 뜻함. 포워딩시까지 살아있으므로-->
        <!--forEach문을 이용해 데이터를 꺼낼 수 있다.-->
		<c:forEach var="dto" items="${dtos}">
			<tr>
				<td>${dto.bid}</td>
				<td>${dto.bname}</td>
				<td>
					<c:forEach begin="1" end="${dto.bindent}">[Re]</c:forEach>
					<a href="content_view.do?bid=${dto.bid}">${dto.btitle}</a>
                    <!--bindent : 가로 (댓글이 보이는 순서 때문에 들어간 것)-->
				</td>
				<td>${dto.bdate}</td>
				<td>${dto.bhit}</td>				
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="5"> <a href="write_view.do">글 작성</a></td>
		</tr>
	</table>
	
	
</body>
</html>