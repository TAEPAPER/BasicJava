package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		/*
		 * JDBC(Java Database Connectivity) -자바와 데이터베이스를 연결해주는 라이브러리 -ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계 1.Connection 생성(DB 연결) 2.Statement 생성(쿼리 작성) 3.Query 실행
		 * 4.ResultSet에서 결과 추출(select인 경우) 5.ResultSet,Statement, Connection 닫기
		 *
		 */

		// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PTJ94";
		String password = "java";

		// try finally에서 사용하기 때문에 밖에 !
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		// DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
		// driver : 서로 다른 것들끼리 상호작용할 수 있게 도와주는애

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			// select(결과가 있을 때  ResultSet)
			rs = ps.executeQuery();

			// insert , update, delete
			// int result = ps.executeUpdate(); result:영향을 받은 행의 수 (몇줄이 영향을 받았는지)

			while (rs.next()) { // next라는 것은 다음줄에 접근을 하라라는 뜻 / next전에는 아무것도 바로보고 있지 않아
				// 다음행이 없을 때까지 반복
				// 행이 있으면 true 없으면 false
				String memId = rs.getString(1); // 인덱스 //타입에 따라 GET머시기~
				String memPass = rs.getString("MEM_PASS");// 컬럼명

				System.out.println("MEM_ID:" + memId + "MEM_PASS:" + memPass);

			}

		} catch (SQLException e) {
			e.printStackTrace(); // 연결은 되었당
		} finally {
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		}   //!=null 의 뜻은 객체가 생성되지 않았을 때 라는 뜻
		
		

		
		
	}

}
