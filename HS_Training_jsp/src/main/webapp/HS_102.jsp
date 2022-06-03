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
	int f = Integer.parseInt(request.getParameter("floor"));
	for(int i=0; i <=f; i++ ){
		out.print("<br>");
		for(int j=0; j<=i; j++){
			out.print("*");
		}
	}
	
%>	
</body>
</html>