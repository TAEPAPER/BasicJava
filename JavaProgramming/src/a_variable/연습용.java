package a_variable;

import java.util.Scanner;

public class 연습용 {
	public static void main(String[] args) {// 메써드는 명령문의 집합, main이라는 이름을 가진 메써드/프로그램을 실행시는 역할

		Scanner sc = new Scanner(System.in);

//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요. (계산기 만들어주세용)-산술연산 가능한
		System.out.print("첫번째 숫자를 입력해주세요");
		int x = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요");
		int y = sc.nextInt();
		System.out.println("연산자를 입력해주세요");
		String z = sc.nextLine();
		
		if( z== "+") {
		System.out.println(x + y);	
		}else if (z == "-") {
			System.out.println(x-y);
		}else if (z=="*") {
			System.out.println(x*y);
			
		}else if (z =="/") {
			System.out.println(x/y);
		}
		
		
		//double result = z.equals("+")? x+y : (z.equals("-")?x -y: (z.equals("*")? x*y: (z.equals("/")?x/y:)));
	
		
		
		
	}

}
