package MakeABoard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import homework.sudoku.ScanUtil;

public class Practice {

	public static void main(String[] args) {

		new Practice().start();

	}

	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("MM-dd");

	void start() {
		while (true) {
			System.out.println("================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			for (int i = boardTable.size() - 1; i >= 0; i--) {
				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("REG_NO") + "\t" + board.get("TITLE") + "\t" + board.get("USER_NAME")
						+ "\t" + format.format(board.get("REG_DATE")));
			}
			System.out.println("================================");
			System.out.println("1.조회 2.등록 0.종료");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("종료되었습니다");
				System.exit(0);
				break;

			}

		}

	}
	
	private void read() {// 조회테이블
		System.out.println("몇번조회?");
		int boardNo = ScanUtil.nextInt();
		HashMap<String, Object> board = null;
		for (int i = 0; i < boardTable.size(); i++) { //보드테이블을 돌면서 찾는다!
			if (boardNo == (int) boardTable.get(i).get("REG_NO")) {
				board = boardTable.get(i);
			}
		}
		System.out.println("==============================");
		System.out.println("번호 :\t" + board.get("REG_NO"));
		System.out.println("------------------------------");
		System.out.println("제목 :\t" + board.get("TITLE"));
		System.out.println("------------------------------");
		System.out.println("작성자 :\t" + board.get("USER_NAME"));
		System.out.println("------------------------------");
		System.out.println("작성일 :\t" + format.format(board.get("REG_DATE")));
		System.out.println("================================");

		System.out.println("1.수정 2.삭제 0.목록");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(board);
			break;
		case 0:
			break;
		}

	}

	private void delete(HashMap<String, Object> board) { // 삭제하기
		System.out.println("정말 삭제하시겠습니까?(Y|N)");
		String input = ScanUtil.nextLine();
		if (input.equals("Y")) {
			for (int i = 0; i < boardTable.size(); i++) {
				if (board.get("REG_NO") == boardTable.get(i).get("REG_NO")) {
					boardTable.remove(i); // boardTable.remove(board); 할 수 있는데 이경우는 인덱스가 아니라 객체를 받은 것!
					System.out.println("게시글이 삭제되었습니다");
					break;
				}
			}
		}

	}

	private void update(HashMap<String, Object> board) {
		System.out.println("제목");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.println("내용");
		board.put("CONTENT", ScanUtil.nextLine());
		System.out.println("게시글이 수정되었습니다");
	}

	private void insert() { // 등록
		HashMap<String, Object> board = new HashMap<String,Object>();
		int max = 0;
		for (int i = 0; i < boardTable.size(); i++) {
			if (max < (int) boardTable.get(i).get("REG_NO")) {
				max = (int) boardTable.get(i).get("REG_NO");
			}
		}
		board.put("REG_NO", max + 1);
		System.out.println("제목");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.println("작성자");
		board.put("USER_NAME", ScanUtil.nextLine());
		System.out.println("내용");
		board.put("CONTENT", ScanUtil.nextLine());
		board.put("REG_DATE", new Date());
		boardTable.add(board);
		System.out.println("등록되었습니다");

	}

}
