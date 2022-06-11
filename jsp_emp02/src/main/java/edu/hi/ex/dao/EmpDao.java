package edu.hi.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import edu.hi.ex.dto.DeptDto;
import edu.hi.ex.dto.EmpDto;

public class EmpDao {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 사용하므로 oracle드라이버를 넣어서 초기화
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// DB에 접근하기 위해 id와 pw를 입력한다.
	private String uid = "scott";
	private String upw = "tiger";

	public EmpDao() {
		try {
			// driver를 객체생성하여 메모리에 올린다 = 동적생성
			// 이때 driver는 클래스상단에 초기화한 값
			Class.forName(driver);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<EmpDto> empSelect(){
		ArrayList<EmpDto> dtos = new ArrayList<EmpDto>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			String query = "select * from emp";
			
			con = DriverManager.getConnection(url,uid,upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				
				EmpDto dto = new EmpDto(empno,ename,job);
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
	
	public int empInsert() {

	      // Connection, Statement, ResultSet 3종세트를 순서대로 객체생성한다.
	      // 이때 import할시 java.sql에 있는 인터페이스를 가져와야한다!!(※주의)

	      Connection con = null;
	      //Statement stmt = null;
	      PreparedStatement stmt = null;
	      int result = -100;

	      try {
	         String query = "insert into emp(empno,ename,sal) values(?,?,?)";

	         con = DriverManager.getConnection(url, uid, upw);
	         stmt = con.prepareStatement(query);
	         
	         stmt.setInt(1, 2000);
	         stmt.setString(2, "kim");
	         stmt.setInt(3, 1000);
	         

	         result = stmt.executeUpdate();


	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         // ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
	         // 열었으므로 거꾸로 닫아준다.
	         try {
	            
	            if (stmt != null)
	               stmt.close();
	            if (con != null)
	               con.close();

	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	      }

	      return result;

	   }

}
