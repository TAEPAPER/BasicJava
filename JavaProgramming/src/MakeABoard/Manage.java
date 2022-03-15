package MakeABoard;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Manage {

	Scanner sc = new Scanner(System.in);
	
	// 추가하는 메서드 //제목,작성자,작성일
	void add(HashMap<String, Object> hang, ArrayList<HashMap<String, Object>> board) {
		hang = new HashMap<String, Object>();
		System.out.println("제목");
		String line = sc.nextLine();
		System.out.println("작성자");
		String writer = sc.nextLine();
		
		System.out.println("내용");
		String lines = sc.nextLine();
		hang.put("제목", line);
		hang.put("작성자", writer);
		hang.put("작성일", new Date());
		hang.put("내용", lines);
		board.add(hang);
	}

	// 글 상세 조회하기 메서드 //수정 및 삭제
	void plus(ArrayList<HashMap<String, Object>> board) {
		System.out.println("몇번 조회?");
		int input = sc.nextInt();
		System.out.println(((HashMap<String, Object>) board.get(input)).get("내용"));
		System.out.println("1.수정하기 2.삭제하기 3.게시판으로 돌아가기");
		int num = sc.nextInt();
		if (num == 1) {
			sc.nextLine();
			System.out.println("수정할 내용을 입력해주세요>");
			String editput = sc.nextLine();
			((HashMap<String, Object>) board.get(input)).put("내용", editput);
			System.out.println("수정되었습니다");
		} else if (num == 2) {
			board.remove(input);
			System.out.println("삭제되었습니다");
		
		} else if (num == 3) {	//아무것도 실행X
		}
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> board = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> hang = new HashMap<String, Object>();
		Manage m = new Manage();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 .등록하기 2.게시판 전체보기");
			int input = sc.nextInt();
			if (input == 1) { // 등록하기
				m.add(hang, board); // hang은 해쉬맵 성질
				System.out.println(board);
			} else if (input == 2) { // 게시판 전체보기
				System.out.println("번호\t제목\t작성자\t작성일\t\t\t\t 0:상세보기\t1:돌아가기");
				for (int i = 0; i < board.size(); i++) {
					hang = board.get(i);
					System.out.print(i + "\t");
					System.out.print(hang.get("제목") + "\t");
					System.out.print(hang.get("작성자") + "\t");
					System.out.println(hang.get("작성일") + "\t");	
				}
				input = sc.nextInt();
				if (input == 0) {
					m.plus(board);
				}else if(input==1) {}
			}
		}
	
	
		
		
	}
	
}