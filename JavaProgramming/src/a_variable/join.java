package a_variable;

import java.util.Scanner;

public class join {

	public static void main(String[] args) {
		
		
		
		
		
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * =========회원가입========== 
		 * 아이디>admin 
		 * 비밀번호(4자리숫자)>1234 
		 * 이름>홍길동                                           //입력받기
		 * 나이>99 
		 * 키>185.5
		 * ======================== 
		 * 회원가입 완료!! 
		 * ==========내정보========== 
		 * 아이디 : admin 
		 * 비밀번호 :1234 
		 * 이름: 홍길동                                        //입력받은 내용들 출력
		 * 나이:99세 
		 * 키:185.5cm 
		 * ========================
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=========회원가입==========");
		System.out.print("아이디>");
		String id = sc.nextLine();
		System.out.print("비밀번호(4자리숫자)>");
		int pw = Integer.parseInt(sc.nextLine());
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("나이>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("키");
//		double height = sc.nextDouble();
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("========================");
		System.out.println("회원가입 완료!! ");
		System.out.println(" ==========내정보==========");
		System.out.println("아이디:"+id);
		System.out.println("비밀번호:"+pw);
		System.out.println("이름:"+name);
		System.out.println("나이:"+age+"세");
		System.out.println("키:" +height+"cm");
		System.out.println("========================");
		
		
		
		
		
		
		
	}

}

