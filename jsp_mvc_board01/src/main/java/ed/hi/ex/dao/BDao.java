package ed.hi.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import ed.hi.ex.dto.BDto;

public class BDao {
	//Ŀ�ؼ�Ǯ�� ����ϱ� ���� �ҽ��ڵ� (DataSource�� import�� �� java.sql�� �ؾ��Ѵ�.
	private DataSource dataSource;

	public BDao() {
	   
	   //������driver�� �����ϰ� Class.forName(driver)�� �ִ� ��İ��� �޸� context.xml�� 
	     //���ҽ��� �������־���. context.xml�� �ִ� �ҽ��� �б� ���� context��ü �����Ѵ�.
	   try {
	      Context context = new InitialContext();
	      dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
	         //jdbc/oracle : context.xml�� �� Resource���� name�� �ش��ϴ� �κ� 
	         //���� ���� context.xml���� name�� lookup ã����� ���̴�. 
	   } catch (Exception e) {
	      e.printStackTrace();
	   }   
	}
	
	public ArrayList<BDto> list(){
		
		ArrayList<BDto> dtos = new ArrayList<>();
		
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

				BDto dto = new BDto(bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent);
				dtos.add(dto);
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(con != null)
					con.close();
			}catch(Exception e2) {
				
			}
		}
		
		return dtos;
	}

}

