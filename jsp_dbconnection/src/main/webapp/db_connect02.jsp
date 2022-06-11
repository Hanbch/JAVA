<!DOCTYPE html>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
    
    String query = "select * from emp";
    try{
    	Class.forName(driver);
        con = DriverManager.getConnection(url, uid, upw);
        statement = con.createStatement();
        resultSet = statement.executeQuery(query);
        
        while(resultSet.next()){
        	String ename = resultSet.getString("ename");
        	int empno = resultSet.getInt("empno");
        	Date hiredate = resultSet.getDate("hiredate");
        	
        	out.print("ename : " + ename + " empno : " + empno + " hiredate : " + hiredate + "<br>");
        	
        }	
    } catch(Exception e){
		e.printStackTrace();
	} finally{
		try{
			if(statement!=null)
				statement.close();
		}catch(SQLException ex1){
			//
		}
				
		try{
			if(con!=null)
				con.close();
		}catch(SQLException ex1){
			//
		}
	}
%>
</body>
</html>