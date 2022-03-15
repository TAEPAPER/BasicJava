package MakeABoard;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import homework.sudoku.ScanUtil;

public class Board {

	public static void main(String[] args) {

		new Board().start();

	}
    //HashMap은 키값
	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
	SimpleDateFormat format = new SimpleDateFormat("MM-dd");//원하는 포맷을 위한!(날짜 깔끔하게 받기 위해서)

	void start() {
		while (true) {
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			for (int i = boardTable.size()-1; i >= 0; i--) { // 가장 최근에 작성한 것이 위로 간다
				System.out.println("---------------------------------");
				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO") + "\t" + board.get("TITLE") + "\t" + board.get("USER_NAME")
						+ "\t" + format.format(board.get("REG_DATE"))); // 원하는 포맷으로 리턴이 된다
			}
			System.out.println("=================================");
			System.out.println("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				read();//조회
				break;
			case 2:
				insert(); //등록
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다");
				System.exit(0);
			}
		}

	}

	private void insert() { // 등록
		HashMap<String, Object> board = new HashMap<String, Object>();
		// 최대값을 찾아줄거야(번호)--최근에 등록한 글이 최대 번호를 갖게 된다
		int max = 0;
		for (int i = 0; i < boardTable.size(); i++) {
			if (max < (int) boardTable.get(i).get("BOARD_NO")) {
				max = (int) boardTable.get(i).get("BOARD_NO");
			}
		}

		board.put("BOARD_NO", max + 1);  //해쉬맵 키,값

		System.out.println("제목>");
		board.put("TITLE", ScanUtil.nextLine());

		System.out.println("내용");
		board.put("CONTENT", ScanUtil.nextLine());

		System.out.println("작성자>");
		board.put("USER_NAME", ScanUtil.nextLine());

		board.put("REG_DATE", new Date());
		boardTable.add(board);
		System.out.println("게시글이 등록되었습니다");

	}

	private void read() {// 조회 //수정//삭제//목록
		System.out.println("조회할 게시물 번호>");
		int boardNO = ScanUtil.nextInt();
		HashMap<String, Object> board = null;
		for (int i = 0; i < boardTable.size(); i++) {
			if (boardNO == (int) (boardTable.get(i).get("BOARD_NO"))) {
				board = boardTable.get(i);
				break;
			}
		}
		System.out.println("==========================");
		System.out.println("번호:\t" + board.get("BOARD_NO"));
		System.out.println("--------------------------");
		System.out.println("작성자:\t" + board.get("USER_NAME"));
		System.out.println("--------------------------");
		System.out.println("작성일:\t" + format.format(board.get("REG_DATE")));
		System.out.println("--------------------------");
		System.out.println("제목\t:" + board.get("TITLE"));
		System.out.println("-------------------------");
		System.out.println("내용:\t" + board.get("CONTENT"));

		System.out.println("1.수정  2.삭제  0.목록");
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

	private void delete(HashMap<String, Object> board) { // 그 주소가 안에 들어있는거기 때문에 결국에 테이블이 변경이된다
		// 삭제할 내용을 테이블에서 찾아서 삭제
		System.out.println("정말 삭제 하시겠습니까?(Y|N)");
		String input = ScanUtil.nextLine();
		if (input.equals("Y")) { // 보드테이블 돌면서 파라미터로 받은 글번호랑 비교하면서 같은 번호의 내용 삭제
			for (int i = 0; i < boardTable.size(); i++) {
				if (board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")) {
					boardTable.remove(i);
					System.out.println("게시글이 삭제되었습니다");
					break;
				}
			}
		}
	}
	private void update(HashMap<String, Object> board) { // 그 주소가 안에 들어있는거기 때문에 결국에 테이블이 변경이된다
		System.out.println("제목>");
		board.put("TITLE", ScanUtil.nextLine());
		System.out.println("내용>");
		board.put("CONTENT", ScanUtil.nextLine());
		System.out.println("게시글이 수정되었습니다");

		// 다음주 목요일 금요일 프로젝트 시작!

	}	
	
}
