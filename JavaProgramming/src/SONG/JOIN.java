package SONG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework.sudoku.ScanUtil;
import k_jdbc.JDBCUtil;

public class JOIN {

	public static void main(String[] args) {
		new JOIN().start();

	}

	private void start() {
		while (true) {
			
			System.out.println("--------------------------------------");
			System.out.println("1.회원가입   2.로그인  3.공지사항  0.종료");
			System.out.println("--------------------------------------");
			int input = ScanUtil.nextInt();
			switch(input) {
			case 1: insert();break; // 등록
			case 2: login(); break; //로그인
			case 3: notice();break; //공지사항
			case 0: System.out.println("종료");
					System.exit(0);
			}

		}
	}

	private void notice() { //공지사항
		String sql = "SELECT A.NO_NUM, A.NO_TITLE, A.NO_WRITER , A.NO_DATE "
				+ " FROM TB_NOTICE AS A ORDER BY A.NO_NUM DESC";
		List<Map<String, Object>> noticeList =	JDBCUtil.selectList(sql);
		System.out.println("----------------------------------");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("----------------------------------");
		for(Map<String, Object> notice : noticeList) {
			System.out.println(notice.get("NO_NUM")
					+ "\t" + notice.get("NO_TITLE")
					+ "\t" + notice.get("NO_WRITER")
					+ "\t" + notice.get("NO_DATE"));
		}
		System.out.println("----------------------------------");
		System.out.print("1.조회  2.등록  0.종료>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			noread(); //read 들어가서 수정 및 삭제하기
			break;
		case 2:
			noinsert();
			break;
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}
	}

	private void noinsert() {  
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("작성자>"); //아우터 조인해서 ID 대신 이름이 나오게 한다
		String memId = ScanUtil.nextLine();
		
		String sql = "INSERT INTO TB_JDBC_BOARD"
				+ "	VALUES ("
				+ "		(SELECT NVL(MAX(BOARD_NO), 0) + 1 FROM TB_JDBC_BOARD)"
				+ "		, ?, ?, ?"
				+ "		, SYSDATE"
				+ "	)";
		
		
		List<Object> param = new ArrayList<Object>();
		param.add(title);
		param.add(content);
		param.add(memId);
		
		if(0 < JDBCUtil.update(sql, param)) {
			System.out.println("게시글 등록이 완료되었습니다.");
		}else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
		
	}
	private void noread() {
	}

	private void login() {
		while(true) {
		System.out.println("ID>");
		String id = ScanUtil.nextLine();
		System.out.println("PW");
		String pw = ScanUtil.nextLine();
		String sql = "SELECT MEM_PW FROM TB_MEMBER WHERE MEM_ID = ?";
		List<Object> param = new ArrayList<Object>();
		param.add(id);
		 Map<String, Object > map =JDBCUtil.selectOne(sql, param);  
		 
		if(pw.equals((String)map.get("MEM_PW"))) {
			System.out.println("로그인 완료");
			
			sql = "SELECT * FROM TB_MEMBER WHERE MEM_ID = ?";
			param = new ArrayList<Object>();
			param.add(id);
			map =JDBCUtil.selectOne(sql, param);
			System.out.println("1.회원정보 수정   2.회원정보 삭제  3.내정보 보기 4.돌아가기  0.종료");
			int input = ScanUtil.nextInt();
			switch(input) {
			case 1 : update(map); break;
			case 2 : delete(map); break;
			case 3 : read(map); break;
			case 4 : break;
			case 0 : System.out.println("종료합니다");
					 System.exit(0);
			}	
			break;
		}else {
			System.out.println("입력정보가 올바르지 않습니다\n로그인 실패");
			}
		}
	}

	private void read(Map<String, Object > map) {//내정보 조회
		 String sql = "SELECT MEM_NAME, MEM_ID, MEM_MAIL, MEM_JOIND, MEM_BIRD FROM TB_MEMBER"
		 		+ " WHERE MEM_ID = ? ";
		 List<Object> param = new ArrayList<Object>();
		 param.add(map.get("MEM_ID"));
		 Map<String, Object> board = JDBCUtil.selectOne(sql, param);
		     	System.out.println("----------------------------------");
				System.out.println("이름:\t " + board.get("MEM_NAME"));
				System.out.println("ID:\t " + board.get("MEM_ID"));
				System.out.println("E-MAIL:\t " + board.get("MEM_MAIL"));
				System.out.println("가입날짜:\t " + board.get("MEM_JOIND"));
				System.out.println("생년월일:\t " + board.get("MEM_BIRD"));
				System.out.println("----------------------------------");
	}

	private void delete(Map<String, Object > map) {
		System.out.println("정말 삭제하시겠습니까?(Y|N)");
		String yn = ScanUtil.nextLine();
		if(yn.equals("Y")) {
			
		String sql = "DELETE FROM TB_MEMBER WHERE MEM_ID = ?";
		List<Object> param = new ArrayList<Object>(); 
		param.add(map.get("MEM_ID"));
		JDBCUtil.selectOne(sql, param);
		}
	}

	private void update(Map<String, Object > map) {
		String sql = "UPDATE TB_MEMBER SET MEM_NAME =?, MEM_PW =? ,MEM_MAIL =? ,MEM_BIRD =? , MEM_AGE = ? "
				+ " WHERE MEM_ID = ?";
		List<Object> param = new ArrayList<Object>(); 
		while(true) { //이름 등록
			System.out.println("이름>");
			String name = ScanUtil.nextLine();
			String regex = "^[가-힣]*$";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(name);
			if(m.matches()) { //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음	
				param.add(name);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("ID 형식이 올바르지 않습니다");
				}
			}
		while(true) { //비밀번호 등록
			System.out.println("PW>");
			String pw = ScanUtil.nextLine();
			String regex = "[a-z0-9_-]{1,10}";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(pw);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(pw);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("PW 형식이 올바르지 않습니다");
				}
			}
		while(true) { //이메일 등록
			System.out.println("E-MAIL>");
			String email = ScanUtil.nextLine();
			String regex = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(email);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(email);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("E-MAIL 형식이 올바르지 않습니다");
				}
			}
		while(true) { //생년월일 등록
			System.out.println("생년월일> (YYYYMMDD)");
			String bir = ScanUtil.nextLine();
			String regex = "^((19|20)\\d\\d)?([-/.])?(0[1-9]|1[012])([-/.])?(0[1-9]|[12][0-9]|3[01])$";		
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(bir);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(bir);	
				//형식에 맞아야 param에 등록
				String sql4 = "SELECT EXTRACT(YEAR FROM SYSDATE)- EXTRACT(YEAR FROM ? ) AS B FROM DUAL";
				List<Object> param4 = new ArrayList<Object>();
					param4.add(bir);
					Map<String , Object> map4 =JDBCUtil.selectOne(sql4, param4);
					param.add(4, map4.get("B"));
			
				break;
				}else {
					System.out.println("형식이 올바르지 않습니다");
				}
			}
			
			param.add(map.get("MEM_ID"));		
			if(	0< JDBCUtil.update(sql, param)) {
				System.out.println("회원정보가 변경되었습니다");
			}else {
				System.out.println("회원정보 변경에 실패하였습니다");
			}
	}

	private void insert() { //회원가입 - tb에 등록
		
		String sql = "INSERT INTO TB_MEMBER "
				+ " VALUES("
				+ " ?, ?, ?, ?"
				+ " , SYSDATE"
				+ " , ? ,? ,?)";
		List<Object> param = new ArrayList<Object>();
		
		while(true) { //이름 등록
			System.out.println("이름>");
			String name = ScanUtil.nextLine();
			String regex = "^[가-힣]*$";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(name);
			if(m.matches()) { //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음	
				param.add(name);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("ID 형식이 올바르지 않습니다");
				}
			}
		
		Outer :
		while(true) { //아이디 등록
		System.out.println("ID> (영문소문자+숫자 5-20) ");
		String id = ScanUtil.nextLine();
		String regex = "[a-z0-9_-]{5,20}";
		Pattern p = Pattern.compile(regex);
		Matcher m =	p.matcher(id);
		if(m.matches()) {  //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
			//이미 있는 아이디
			String sql2 = "SELECT MEM_ID  FROM TB_MEMBER";
			List<Map<String, Object>> list =JDBCUtil.selectList(sql2); //실행결과 여러개 
			for(int i =0; i<list.size(); i++) {
				
				if(id.equals((String)list.get(i).get("MEM_ID"))) {
					System.out.println("같은 ID가 존재합니다");
					continue Outer;
				}	
			}
			param.add(id);
			break Outer;
			}else {
				System.out.println("ID 형식이 올바르지 않습니다");
			}
		}
		while(true) { //비밀번호 등록
			System.out.println("PW> (영문소문자+숫자 1-10)");
			String pw = ScanUtil.nextLine();
			String regex = "[a-z0-9_-]{1,10}";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(pw);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(pw);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("PW 형식이 올바르지 않습니다");
				}
			}
		while(true) { //이메일 등록
			System.out.println("E-MAIL>");
			String email = ScanUtil.nextLine();
			String regex = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(email);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(email);	//형식에 맞아야 param에 등록
				break;
				}else {
					System.out.println("E-MAIL 형식이 올바르지 않습니다");
				}
			}
		
		while(true) { //생년월일 등록
			System.out.println("생년월일> (YYYYMMDD)");
			String bir = ScanUtil.nextLine();
			String regex = "^((19|20)\\d\\d)?([-/.])?(0[1-9]|1[012])([-/.])?(0[1-9]|[12][0-9]|3[01])$";		
			Pattern p = Pattern.compile(regex);
			Matcher m =	p.matcher(bir);
			if(m.matches()) {    //m.matches()가 트루이면 (형식이 맞으면 id입력창 나가고 다음
				param.add(bir);   //형식에 맞아야 param에 등록
				//나이 넣기
				
					break;
				}else {
					System.out.println("형식이 올바르지 않습니다");
				}
			}
		
		if( 0 < JDBCUtil.update(sql, param)) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
	}
	
	
	
	}


