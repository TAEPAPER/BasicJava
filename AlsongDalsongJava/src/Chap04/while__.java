package Chap04;

import java.util.Scanner;

public class while__ {

	public static void main(String[] args) {
//		int num;
//		int sum = 0;
//		boolean flag = true;
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("합계를 구할 숫자를 입력하세요");
//		
//		while(flag) {
//			System.out.print(">>");
//			num = Integer.parseInt(sc.nextLine());
//			if(num !=0) {
//				sum += num;
//			}else {
//				flag = false;
//			}
//		}
//		System.out.println("합계: " + sum);
//	
//
//		int i = 0;
//		int answer = 0;
//		answer = (int) (Math.random() * 100) + 1;
//		int num = 0;
//
//		do {
//			System.out.println("1과 100사이의 정수를 입력하세요");
//			num = sc.nextInt();
//			if (answer > num) {
//				System.out.println("더 큰 값으로 입력하세요");
//			} else if(answer <num) {
//				System.out.println("더 작은 값으로 입력하세요");
//			}
//
//		} while (answer != num);
//
//		System.out.println("정답입니다");

//		int sum = 0;
//		int i = 0;
//		while (true) {
//			if (sum > 100) {
//				break;
//			} else {
//				++i;
//				sum += i;
//			}
//
//		}
//		System.out.println("i = " + i);
//		System.out.println("sum =" + sum);
//		

		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;

			} else {
				System.out.println(i);
			}

		}

		int menu = 0;
		int num = 0;
	while(true) {
		System.out.println("(1) square");
		System.out.println("(2) square root");
		System.out.println("(3) log");
		System.out.println("원하는 메뉴를 선택하세요(종료 : 0)");
		
		menu = Integer.parseInt(sc.nextLine());
		if(!(1 <= menu && menu <=3)) {
			System.out.println("메뉴를 잘못 선택하셨습니다(종료는 0번)");
			continue;
		}else if(menu ==0) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		
		System.out.println("선택하신 메뉴는" +  menu +"번입니다");
		break;
	}
	
	
		
		
		
		
		
		
		
	}
}
