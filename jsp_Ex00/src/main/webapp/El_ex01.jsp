<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${10}
${10 + 10}
${10 * 10}
${10 / 5}
${10 > 20}
${10 gt 11}

${10 <= 11}
${10 le 11}

<%
	EmpDao dao = new EmpDao();
%>
</body>
</html>