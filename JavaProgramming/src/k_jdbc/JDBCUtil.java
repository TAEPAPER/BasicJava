package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "PTJ94";
	private static String password = "java";

	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql) --조회결과는 한 줄일 때(파라미터는 쿼리)--해쉬맵
	 * Map<String, Object> selectOne(String sql, List<Object> param) (쿼리,물음표에 들어갈 값)-쿼리안에 물음표 있을 때
	 * 리스트에 담겨있는 형태로
	 * List<Map<String, Object>> selecList(String sql) --조회결과가 여러줄일 경우에
	 * List<Map<String, Object>> selecList(String sql,List<Object>param) --어레이리스트에 담아서 
	 * int update(String sql) --select를 제외한 나머지
	 * int update(String sql,List<Object>param)
	 * 
	 */
	//
	public static Map<String, Object> selectOne(String sql, List<Object> param){
			Map<String , Object> map = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			ps =con.prepareStatement(sql);
			for(int i=0; i<param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
				rs = ps.executeQuery();
				ResultSetMetaData metaData =rs.getMetaData();
					int columnCount = metaData.getColumnCount();
					if(rs.next()) { //행이 존재할 때만 실행할 수 있게 if문에 넣어줌
						map = new HashMap<String, Object>();
						for(int i =1 ; i<=columnCount; i++) {
							map.put(metaData.getColumnName(i), rs.getObject(i));
						}
					}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e){}
		} 
		return map;		
	}
	
	public static Map<String, Object> selectOne(String sql){
		Map<String , Object> map = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			ps =con.prepareStatement(sql);		
				rs = ps.executeQuery();
				ResultSetMetaData metaData =rs.getMetaData();
					int columnCount = metaData.getColumnCount();
					if(rs.next()) { //행이 존재할 때만 실행할 수 있게 if문에 넣어줌
						map = new HashMap<String, Object>();
						for(int i =1 ; i<=columnCount; i++) {
							map.put(metaData.getColumnName(i), rs.getObject(i));
						}
					}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e){}
		} 
		return map;		
	}

	public static List<Map<String, Object>> selectList (String sql,List<Object> param){
		//실행결과를 어레이리스트 담아서 리턴
		List<Map<String, Object>> list = new ArrayList <Map<String, Object>>(); 
		//비어있어도 비어있는 어레리스트를 리턴 받고 싶기 때문에 new~
		try {
			con =DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			for(int i =0; i<param.size(); i++) {
				ps.setObject(i+1, param.get(i)); //물음표의 인덱스는 1부터 시작하니까 i+1	
			}
			rs = ps.executeQuery();
			ResultSetMetaData metaData =rs.getMetaData();
			int colunmCount = metaData.getColumnCount();
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String,Object>();
				for(int i =1; i<=colunmCount; i++) {
					//한줄에 들어있는 내요을 해쉬맵에 놓고 그 해쉬맵을 어레이 리스트에 넣기
					map.put(metaData.getColumnName(i),rs.getObject(i)); //컬럼명과 컬럼값이 해쉬맵에 들어감
				}
			list.add(map);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e){}
		} 
		return list;
	}
	
	public static List<Map<String, Object>> selectList (String sql){
		//실행결과를 어레이리스트 담아서 리턴
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		try {
			con =DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData =rs.getMetaData();
			int colunmCount = metaData.getColumnCount();
			while(rs.next()) {
				Map<String, Object> map = new HashMap<String,Object>();
				for(int i =1; i<=colunmCount; i++) {
					//한줄에 들어있는 내요을 해쉬맵에 놓고 그 해쉬맵을 어레이 리스트에 넣기
					map.put(metaData.getColumnName(i),rs.getObject(i)); //컬럼명과 컬럼값이 해쉬맵에 들어감
				}
			list.add(map);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs != null)try {rs.close();} catch (Exception e) {} //닫아서 반납을 해줌
			if (ps != null)try {ps.close();} catch (Exception e) {}
			if (con != null)try {con.close();} catch (Exception e){}
		} 
		return list;
	}
	
	//select외에~
	public static int update(String sql, List<Object> param) {
		int result =0 ;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // 물음표의 인덱스는 1부터 시작하니까 i+1
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				} // 닫아서 반납을 해줌
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
		return result;
	}
	
	public static int update(String sql) {
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();   //업데이트 진행
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				} // 닫아서 반납을 해줌
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
		return result;
	}	
		
	
	
	
	
	
	
	
	
	
	
	
	}
	

	


