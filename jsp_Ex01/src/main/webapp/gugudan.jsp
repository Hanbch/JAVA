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
			<%
				for(int i =2; i<10; i++){
					
				
			%>
			<td> <% out.print(i + "단"); %> </td>
		
			<% } %>
		</tr>
		
		<% for(int i=2; i<10; i++){
			for(int j=2; j<10; j++){
				String a = i +"x" + j + "=" + i*j;
		%>
		<tr>
			<td>1</td>
			<td><%out.print(a); %></td>
		</tr>
		
		<tr>
			<td>2</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		
		<tr>
			<td>3</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<%
			}
		}
		%>
	</table>
</body>
</html>