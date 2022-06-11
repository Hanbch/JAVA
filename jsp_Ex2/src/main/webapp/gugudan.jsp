<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{border:1px solid #000}
</style>
</head>
<body>
	
	<table>
		<tr>
			<%for(int i=2; i<=9;i++){%>
					<th><% out.print(i + "단"); %></th>
			<% } %>
		</tr>
		
		<% for(int i=1; i<=9;i++){%>
			<tr>
				<% for(int j=2; j<=9; j++){ %>
					<td><%out.print(j + "x" + i + "=" + i*j); %></td>
				<% } %>
			</tr>
		<% } %>
		
	</table>
</body>
</html>