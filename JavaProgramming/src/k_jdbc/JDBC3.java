package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC3 {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PTJ94";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			//select문
			String sql = "select *" + " from GOODS " // 공백 필수 : 없으면 쿼리 붙어있는거야
					+ " where PROD_LGU = ?" // 물음표(값을 물음표로 대신하고 나중에 이 물음표를 채워넣기)
					+ " and PROD_PRICE <?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "P201");
			ps.setInt(2, 100000);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) { // 컬럼의 인덱스는 1부터 시작하기 때문에 i=1부터 시작

					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
			
			
			//업데이트문
			String sql2 = "UPDATE SAL_GRADE SET MAX_SAL = 5999 WHERE GRADE =2";
			ps = con.prepareStatement(sql2);
			ps.executeUpdate();
			//업데이트 확인
			String sql3 = "select * from sal_grade";
			ps = con.prepareStatement(sql3); 
			rs = ps.executeQuery();
			ResultSetMetaData metaData2 = rs.getMetaData();
			int columnCount2 = metaData2.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount2; i++) { // 컬럼의 인덱스는 1부터 시작하기 때문에 i=1부터 시작
					
					System.out.print(rs.getObject(i) +"\t");
				}
				System.out.println();
			}
					//insert문 
			String sql4 = "insert into sal_grade(grade,low_sal,max_sal) values (7,35000,67000)";
			ps = con.prepareStatement(sql4);
			ps.executeUpdate();
			
			
			System.out.println();
			String sql5 = "select * from sal_grade";
			ps = con.prepareStatement(sql5); 
			rs = ps.executeQuery();
			ResultSetMetaData metaData3 = rs.getMetaData(); //데이터에 대한 데이터
			int columnCount3 = metaData3.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount3; i++) { // 컬럼의 인덱스는 1부터 시작하기 때문에 i=1부터 시작
					
					System.out.print(rs.getObject(i) +"\t");
				}
				System.out.println();
			}
			//delete문 
		String sql6 = " DELETE FROM sal_grade where grade = 7";
			ps = con.prepareStatement(sql6);
			ps.executeUpdate();
		
		} catch (SQLException e) {

			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e){}
		} 

	}

}
