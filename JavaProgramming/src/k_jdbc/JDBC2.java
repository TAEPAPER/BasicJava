package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		// 데이터베이스 접속 정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "PTJ94";
				String password = "java";

				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select *"
					+ " from cart" //공백 필수 : 없으면 쿼리 붙어있는거야
					+ " where cart_member = ?" //물음표(값을 물음표로 대신하고 나중에 이 물음표를 채워넣기) 
					+ " and cart_qty >?";
			
			ps = con.prepareStatement(sql); //오라클에 보낼 수 있는 형태로 만드는 것
			ps.setString(1,"a001");  //첫번째 물음표에 (물음표의 인덱스)
			ps.setInt(2, 5);		//두번째 물음표에
//			ps.setObject(0, sql);  //물음표에는 값만 들어갈 수 있음 (컬럼 못들어가)
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			//메타데이터 : 데이터에 대한 데이터
			
			int columnCount = metaData.getColumnCount();//조회된 컬럼의 갯수를 알 수 있음
			
			while(rs.next()) {
				//한줄한줄보기
				for(int i = 1; i<= columnCount; i++) { //컬럼의 인덱스는 1부터 시작하기 때문에 i=1부터 시작
					
					System.out.print(rs.getObject(i)+"\t");
				}
				System.out.println();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e) {}
		} 
		
		
		
		
		
		

	}

}
