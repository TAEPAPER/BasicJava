package b_operator;


import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
//		비트연산자
//		|,&,^,~,<<,>>
//		-비트단위로 연산한다
//		
//		기타연산자
//		.(참조연산자): 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다 //클래스 안에 있는 메써드 참조할때
//		?:(삼항연산자): 조건식? 조건식이 참일 경우 수행할 문장 --트루이면
//					  :조건식이 거짓일 경우 수행할 문장----펄스이면
		
		
		//1byte : 01010101 (8bit) ---2진수
		System.out.println(10 | 15);
		//or연산은 둘다 비트가 0인 경우에는 0 그외는 1인 결과를 얻는다
		//10 : 00001010
		//15 : 00001111
		//     00001111 ---결과는 15
		
	
		
		//삼항연산자
		int x = 10;
		int y = 20;
		int result = x < y ? x :y; //세문장   트루가 나오면 두번째 문장 펄스가 나오면 세번째문장 실행
		// int result = x;
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		
		int regNo =1;  //오류: 어떤 숫자가 와도 여자가된다 그래서 2인지도 확인해야해
		String gender = regNo ==1 ? "남자" : "여자";
		System.out.println(gender);
		
		
		gender = regNo == 1? "남자" : (regNo==2? "여자": "확인불가");
		System.out.println(gender);
		
		
		
		//2개의 숫자를 입력받고, 둘중 더 큰 숫자를 출력해주세요
		
		Scanner sc = new Scanner(System.in);
		
	

		
		
		System.out.println("숫자 a를 입력해주세요>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("숫자 b를 입력해주세요>");
		int b =Integer.parseInt(sc.nextLine());
		int _bigger = a >b ? a : b;
		System.out.println(_bigger);
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를// 2나 4면 여자를 출력해주세요.
		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
		

		System.out.println("숫자>");
		int num = Integer.parseInt(sc.nextLine());
		gender = num ==1|| num== 3? "남자" :
			(num == 2 || num ==4 ? "여자": "확인불가");
		System.out.println(gender);
			
		
	
		
		
	}

}
