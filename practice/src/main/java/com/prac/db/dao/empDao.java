package com.prac.db.dao;

import java.sql.*;
import java.util.ArrayList;

import com.prac.db.dto.empDto;

public class empDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	
	public empDao() {
		try {
			
			Class.forName(driver);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<empDto> empSelect(){
		ArrayList<empDto> dtos = new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			String query = "select * from emp";
			
			con = DriverManager.getConnection(url,uid,upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String ename = rs.getString("ename");
				int deptno = rs.getInt("deptno");
				String job = rs.getString("job");
				
				empDto dto = new empDto(ename,deptno,job);
				dtos.add(dto);
			} 	
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null ) rs.close();
				if( stmt != null ) stmt.close();
				if( con != null ) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
	
	
}
