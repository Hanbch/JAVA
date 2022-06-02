<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <%@ page isErrorPage="true" %><!-- 에러가났을떄 -->
 <% response.setStatus(200); //정상처리 %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	에러발생 <br>
	<%= exception.getMessage() %>

	
</body>
</html>