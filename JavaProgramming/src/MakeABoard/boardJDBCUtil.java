package MakeABoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import homework.sudoku.ScanUtil;
import k_jdbc.JDBCUtil;

public class boardJDBCUtil {

	public static void main(String[] args) {
		new boardJDBCUtil().start();
	}
	ArrayList<Map<String, Object>> boardTable = new ArrayList<Map<String, Object>>();

	void start() {
		while (true) {
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			String sql = "select * from tb_jdbc_board";
			boardTable = (ArrayList<Map<String, Object>>) JDBCUtil.selectList(sql);
			for (int i = boardTable.size() - 1; i >= 0; i--) {
				System.out.println("---------------------------------");
				Map<String, Object> board = new HashMap<String, Object>();
				board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" + board.get("TITLE") + "\t" + board.get("MEM_ID") + "\t"
						+ board.get("REG_DATE"));
			}
			System.out.println("=================================");
			System.out.println("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				read();// 조회
				break;
			case 2:
				insert(); // 등록
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다");
				System.exit(0);
			}
		}
	}
	private void insert() {// 등록
		// 결과는 한줄 물음표 있음
		String sql = "insert into tb_jdbc_board" + " values (" + " (select nvl(max(BOARD_NO),0)+1 FROM TB_JDBC_BOARD)"
				+ " ,?,?,?" + "  ,SYSDATE" + " )";
		List<Object> param = new ArrayList<Object>();
		System.out.println("제목>");
		param.add(ScanUtil.nextLine());
		System.out.println("내용");
		param.add(ScanUtil.nextLine());
		System.out.println("작성자");
		param.add(ScanUtil.nextLine());
		JDBCUtil.update(sql, param);
		System.out.println("등록되었습니다");
	}

	private void read() {// 조회 //조회 결과는 한줄이야 그리고 물음표
		System.out.println("조회할 게시물 번호>");
		int boardNO = ScanUtil.nextInt();
		String sql = "select *" + " from tb_jdbc_board" + " where BOARD_NO = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(boardNO);
		Map<String, Object> map = JDBCUtil.selectOne(sql, param); // 리턴 타입은 map
		System.out.println("==========================");
		System.out.println("번호:\t" + map.get("BOARD_NO"));
		System.out.println("--------------------------");
		System.out.println("작성자:\t" + map.get("TITLE"));
		System.out.println("--------------------------");
		System.out.println("작성일:\t" + map.get("CONTENT"));
		System.out.println("--------------------------");
		System.out.println("제목\t:" + map.get("MEM_ID"));
		System.out.println("-------------------------");
		System.out.println("내용:\t" + map.get("REG_DATE"));

		System.out.println("1.수정  2.삭제  0.목록");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			update(map);
			break;
		case 2:
			delete(map);
			break;
		case 0:
			break;
		}
	}
	private void delete(Map<String, Object> map) {
		System.out.println("정말 삭제 하시겠습니까?(Y|N)");
		String input = ScanUtil.nextLine();
		if (input.equals("Y")) {
			String sql = "delete from tb_jdbc_board where BOARD_NO =? ";
			List<Object> param = new ArrayList<Object>();
			param.add(map.get("BOARD_NO"));
			JDBCUtil.update(sql, param);
			System.out.println("삭제되었습니다");
		}
	}
	private void update(Map<String, Object> map) { // 수정
		String sql = "update tb_jdbc_board set TITLE =? , CONTENT=? " + " where BOARD_NO = ? ";
		List<Object> param = new ArrayList<Object>();
		System.out.println("제목>");
		param.add(ScanUtil.nextLine());
		System.out.println("내용");
		param.add(ScanUtil.nextLine());
		param.add(map.get("BOARD_NO"));
		JDBCUtil.update(sql, param);
		System.out.println("수정되었습니다");
		
	}
}
