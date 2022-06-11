<%@page import="java.sql.SQLException"%>
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
    
    String query =  "select * from emp";
%>

<%
	try{
		Class.forName(driver); // 객체생성
		con = DriverManager.getConnection(url,uid,upw);
		statement = con.createStatement();
		resultSet = statement.executeQuery(query);
		
		while(resultSet.next()){
			String ename = resultSet.getString("ename");
			String job = resultSet.getString("job");
			int empno = resultSet.getInt("empno");
			Date hiredate = resultSet.getDate("hiredate");
			int sal = resultSet.getInt("sal");
			int comm = resultSet.getInt("comm");
			
			
			out.print( " comm : " +  comm + " hiredate : " + hiredate + " sal : " + sal + " empno : " + empno + " name" + ename + " job" + job + "<br>");
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
	      try{
	          if(resultSet != null) resultSet.close();         
	          if(statement != null) statement.close();         
	          if(con != null) con.close();
	          
	       } catch(Exception e){}
	       
	    }

	
%>

</body>
</html>