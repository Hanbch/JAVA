<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	Connection con = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "scott";
    String upw = "tiger";
    
    String query =  "select * from dept";
%>

<%
	
		Class.forName(driver); // 객체생성
		con = DriverManager.getConnection(url,uid,upw);
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		while(resultSet.next()){
			int deptno = resultSet.getInt("deptno");
			String dname = resultSet.getString("dname");
			String loc = resultSet.getString("loc");

	
		
			}
%>
	</tr>
</table>		
	
	


</body>
</html>