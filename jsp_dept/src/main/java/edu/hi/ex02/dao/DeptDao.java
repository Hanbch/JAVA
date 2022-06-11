package edu.hi.ex02.dao;

import java.sql.*;
import java.util.ArrayList;

import edu.hi.ex02.dto.DeptDto;
import edu.hi.ex02.dto.Dto;

public class DeptDao {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	
	public DeptDao() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DeptDto> deptSelect(){
		ArrayList<DeptDto> dtos = new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs= null;
		
		try {
			
			String query = "select * from dept";
			
			
			con = DriverManager.getConnection(url,uid,upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				
				String dname = rs.getString("dname");
				int deptno = rs.getInt("deptno");
				String loc = rs.getString("Loc");
				
				DeptDto dto = new DeptDto(dname,deptno,loc);
				
				dtos.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( rs != null) rs.close();
				if( stmt != null) stmt.close();
				if( con != null) con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
}
