package prac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import prac.dto.Bdto;

public class Bdao {
	
	 DataSource dataSource;
	
	public Bdao() {
		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Bdto> list(){
		ArrayList<Bdto> dtos = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			String query = "select * from mvc_board order by bgroup desc, bstep asc";
			
			con = dataSource.getConnection();
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			
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
				 
				 Bdto dto = new Bdto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
				 dtos.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dtos;
	}
	
}
