<%@page import="java.sql.*"%>
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
	Statement stmt = null;
	ResultSet rs= null;

	String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 사용하므로 oracle드라이버를 넣어서 초기화
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// DB에 접근하기 위해 id와 pw를 입력한다.
	String uid = "scott";
	String upw = "tiger";
	
	String query = "select * from emp";
	
	Class.forName(driver);
	con = DriverManager.getConnection(url, uid, upw);
	stmt = con.createStatement();
	rs = stmt.executeQuery(query);
	
	while(rs.next()){
		String ename = rs.getString("ename");
		int empno = rs.getInt("empno");
		Date hiredate = rs.getDate("hiredate");
		
		out.print(ename + " " + empno + " " + hiredate + "<br>" );
	}
	

%>
</body>
</html>