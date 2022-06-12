package com.prac.db.dao;

import java.sql.*;
import java.util.ArrayList;

import com.prac.db.dto.BDto;

public class BDao {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";

	public BDao(){
		try {
			Class.forName(driver);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BDto> boardSelect(){
		ArrayList<BDto> dtos = new ArrayList<>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String query =  "select * from mvc_board order by bgroup desc, bstep asc";
			
			con = DriverManager.getConnection(url,uid,upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");
				
				BDto dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
				dtos.add(dto);
			}
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(con != null)
					con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	
	
}
