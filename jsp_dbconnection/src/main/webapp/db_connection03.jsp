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
	Statement st = null;
	ResultSet rs = null;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String uid = "scott";
    String upw = "tiger";
    
    String query = "select * from emp";
    
    try{
    	Class.forName(driver);
	    con = DriverManager.getConnection(url, uid, upw);
	    st = con.createStatement();
	    rs = st.executeQuery(query);
	    
	    while(rs.next()){
	    	String ename = rs.getString("ename");
	    	int empno =rs.getInt("empno");
			Date hiredate = rs.getDate("hiredate");
			
			out.print(ename + " " + empno + " " + hiredate + "<br>");
	    }
	    
    } catch(Exception e){
    	
    	
    	
    }
    
	
	
%>
</body>
</html>