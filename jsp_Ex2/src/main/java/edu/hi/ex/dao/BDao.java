package edu.hi.ex.dao;

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

import edu.hi.ex.dto.BDto;

public class BDao {
	// 커넥션풀을 사용하기 위한 소스코드 (DataSource를 import할 시 java.sql로 해야한다.
	private DataSource dataSource;

	public BDao() {

		// 기존에driver를 설정하고 Class.forName(driver)를 넣는 방식과는 달리 context.xml에
		// 리소스를 설정해주었다. context.xml에 있는 소스를 읽기 위해 context객체 생성한다.
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
			// jdbc/oracle : context.xml에 들어간 Resource에서 name에 해당하는 부분
			// 위의 식은 context.xml에서 name을 lookup 찾으라는 뜻이다.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<BDto>();

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {

			// query문 작성시 댓글을 순서대로 가져오는것이 중요하다. 순서대로 가지고 오려면
			// bgroup으로 내림차순 정렬해주고, bstep은 오름차순으로 정렬해준다.
			// => select * from mvc_board order by bgroup desc, bstep asc;
			String query = "select * from mvc_board order by bgroup desc, bstep asc";
			connection = dataSource.getConnection();
			stmt = connection.prepareStatement(query);
			rs = stmt.executeQuery();

			while (rs.next()) {

				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				BDto dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return dtos;

	}

}
