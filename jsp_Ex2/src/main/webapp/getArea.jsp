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
	String width,height;

	width = request.getParameter("width");//parameter받아올때는 String타입으로 받는다
	height = request.getParameter("height");
	
	int w = Integer.parseInt(width); // 정수형으로 변환
	int h = Integer.parseInt(height);
%>
<%= h*w %>
</body>
</html>