<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="edu.hi.ex.dto.DeptDto"%>
<%@page import="edu.hi.ex.dao.DeptDao"%>
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
<c:out value="hello world"/><br>
<c:out value="hello"/><br>
<c:out value="hello">world</c:out><br>
<c:out value="${'hello'}">world</c:out><br>

set태그 : 변수를 다룰때 사용한다.<br>
<c:set var="name" value="홍길동" />
<c:set var="name2"> 철수</c:set>
${name}<br>
${name2}

c:if 태그
<c:if test="${10 > 20}" var ="result"> <!-- true이면 태그안의 내용 실행 --> 
	10은 20 보다 작다.<br>
</c:if>
${ result }<br>

c:choose 태그 자바에서 -switch-case<br>
<% pageContext.setAttribute("id","admin");//밑에 코드랑 동일 %>
<c:set var="id" value="choi"/>

pgScope : ${pageScope.id}<br>

<c:choose>
	<c:when test="${id == 'adim'}">
		관리자 페이지
	</c:when>
	<c:when test="${id == 'aaa'}">
		${id}
	</c:when>
	<c:when test="${id == 'bbb'}">
		${id}
	</c:when>
	
	<c:otherwise>
		${id} 님 반갑습니다.
	</c:otherwise>
</c:choose>


c:foreach 문 <br>

<%
	pageContext.setAttribute("numList", new String[]{"1", "2", "3", "4", "5"}); 
	
	DeptDao dao = new DeptDao();
	
	ArrayList<DeptDto> dtos = dao.deptSelect();
	
	pageContext.setAttribute("dtos",dtos);
	
	List<String> fruits = new ArrayList<>();
	fruits.add("apple");
	fruits.add("kiwi");
	fruits.add("orange");
	
	pageContext.setAttribute("fruits",fruits);
%> 

<c:forEach items="${fruits}" var="fruit">
	${fruit}<br>
</c:forEach>

<c:forEach items="${dtos}" var="emp">
	${emp.dname}<br>
</c:forEach>

<c:forEach items="${numList}" var="num">
	${num} <br>
</c:forEach>
</body>
</html>