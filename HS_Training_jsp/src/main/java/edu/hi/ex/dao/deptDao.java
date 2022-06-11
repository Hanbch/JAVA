package edu.hi.ex.dao;

import java.sql.*;
import java.util.ArrayList;

import edu.hi.ex.dto.deptDto;

public class deptDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	
	public deptDao() {
		
		try {
			Class.forName(driver);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<deptDto> deptSelect(){
		
		ArrayList<deptDto> dtos = new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from dept";
			
			con = DriverManager.getConnection(url,uid,upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String dname = rs.getString("dname");
				int deptno = rs.getInt("dname");
				String loc = rs.getString("Loc");
				
				deptDto dto = new deptDto(dname,deptno,loc);
				
				dtos.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
	
}
