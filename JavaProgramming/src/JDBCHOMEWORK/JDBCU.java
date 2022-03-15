package JDBCHOMEWORK;

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

public class JDBCU {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "ptj94";
	private static String password = "java";

	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	// selectOne // noQue //한줄조회,물음표 없음
	public static Map<String, Object> one(String sql) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int colunmCount = metaData.getColumnCount();
			while(rs.next()) {
			for (int i = 1; i <= colunmCount; i++) {
				map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
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
		return map;
	}
	// 조회 결과 한줄, 물음표 있을 때
	public static Map<String, Object> oneQue(String sql, List<Object> param) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i));
			}
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData(); // 쿼리문의 실행결과
			int colunmCount = metaData.getColumnCount();
			while(rs.next()) {
			for (int i = 1; i <= colunmCount; i++) {
				map.put(metaData.getColumnName(i), rs.getObject(i));
				}
			}
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
		return map;
	}
	// --조회결과가 여러줄, 물음표 있을 경우에
	public static List<Map<String, Object>> ListQue(String sql, List<Object> param) {

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();// 어레이 리스트 만들고
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) {
				ps.setObject(i + 1, param.get(i)); // 물음표의 인덱스는 1부터 시작하니까 i+1
			}
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData(); // 쿼리문의 실행결과
			int colunmCount = metaData.getColumnCount();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for (int i = 1; i <= colunmCount; i++) {
					// 한줄에 들어있는 내용을 해쉬맵에 놓고 그 해쉬맵을 어레이 리스트에 넣기
					map.put(metaData.getColumnName(i), rs.getObject(i)); // 컬럼명과 컬럼값이 해쉬맵에 들어감
				}
				list.add(map);
			}
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
		return list;
	}
	// --조회결과가 여러줄,물음표 없을 경우에
	public static List<Map<String, Object>> ListNoQue(String sql) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData(); // 쿼리문의 실행결과
			int colunmCount = metaData.getColumnCount();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<String, Object>();
				for (int i = 1; i <= colunmCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(map);
			}
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
		return list;
	}
	// int update(String sql) select문 제외한 나머지 인경우
	// 물음표 **없을 때**

	// insert , update, delete
	// int result = ps.executeUpdate();
	// result:영향을 받은 행의 수 (몇줄이 영향을 받았는지)
	public static int update(String sql) {
		int result = 0;
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate(); // 업데이트 진행
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
	// int update(String sql,List<Object> param) select문 제외한 나머지 인경우
	// 물음표 **있을 때**

	// insert , update, delete
	// int result = ps.executeUpdate();
	// result:영향을 받은 행의 수 (몇줄이 영향을 받았는지)
	public static int updateQue(String sql, List<Object> param) {
		int result = 0;
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
}
