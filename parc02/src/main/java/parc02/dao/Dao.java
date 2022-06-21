package parc02.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.*;
import javax.sql.DataSource;

import parc02.dto.Dto;

public class Dao {
	 DataSource dataSource;
	
	public Dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Dto> list(){
		ArrayList<Dto> dtos = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String query = "select * from mvc_board order by bgroup desc,bstep";
			
			con = dataSource.getConnection();
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				 int bid = rs.getInt("bid");
				 String btitle = rs.getString("btitle"); 
				 String bname = rs.getString("bname"); 
				 String bcontent = rs.getString("bcontent"); 
				 Timestamp bdate = rs.getTimestamp("bdate");
				 int bhit = rs.getInt("bhit");
				 int bgroup = rs.getInt("bgroup");
				 int bstep = rs.getInt("bstep");
				 int bindent = rs.getInt("bindent");
				 
				 Dto dto = new Dto(bid, btitle, bname, bcontent,bdate , bhit,bgroup ,bstep,bindent );
				 dtos.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dtos;
	}
}
