import java.util.Random;
import java.util.Scanner;

public class Chap04 {

	public static void main(String[] args) {
//		System.out.println("숫자 맞추기 게임 시작! \n10부터 99사이의 숫자를 맞추세요\n어떤 숫자일까?");
//		Random r = new Random();
//		int input;
//		int num = r.nextInt(90)+10;
//		
//		do {
		Scanner sc = new Scanner(System.in);
//		input = sc.nextInt();
//		if(input<num) {
//			System.out.println("더 큰 숫자입니다");
//		}else if(input >num) {
//			System.out.println("더 작은 숫자입니다");
//		}
//		}while(input!=num);
//		System.out.println("정답입니다");

//		System.out.println("정수A>");
//		int a = sc.nextInt();
//		System.out.println("정수B>");
//		int b = sc.nextInt();
//		while (a != b) {
//			if (a < b) {
//				for (int i = a; i <= b; i++) {
//					System.out.print(i+" "); 
//				}break;
//			}if (a > b) {
//				for (int i = b; i <= a; i++) {
//					System.out.print(i+" ");
//				}break;
//			}
//		}
//
//		System.out.println("카운트다운 합니다");
//		int input;
//		do {
//			System.out.print("양의 정숫값 : ");
//			input = sc.nextInt();
//		} while (input <= 0); // 양의 정수값 받기

//		for(int i = input; i>=0; i--) {
//			System.out.println(i);
//				input=i-1;
//		}
//		System.out.println("input의 값이 "+input+"이 되었습니다");

//		while(input>=0) {
//			System.out.println(input--);
//		
//		}	System.out.println("input값이"+input+"이 되었습니다");
//		
//		while(input>=0) {
//			System.out.println(--input);
//		
//		}	System.out.println("input값이"+input+"이 되었습니다");
//
//		System.out.print("몇 개의 *를 표시할까요?>");
//		int input = sc.nextInt();
//		while(input>0) {
//			System.out.print("*");
//			input--;
//		}

//		int i =1;
//		while(i<=n) {
//			if(i%2==0) { //i가 짝수이면 *을 출력
//			System.out.print('*');
//			}else { //i가 홀수이면 +을 출력
//				System.out.print('+');
//			}
//			i++;
//		}
//	
//	 		if(n>0) {
//	 			int i = 0;
//	 			while(i<n/2) {
//	 				System.out.print("*+");
//	 				i++;
//	 			}
//	 			
//	 		}
//		

//	int count =0;
//	 while(n>0) {
//		 count++;
//		 n = n/10; //마지막 자리수 버리기
//	 }
//		System.out.println(count);
//		

//	 int multi=1;
//	 for(int i =1; i<=n; i++) {
//		 multi *= i;
//	 }
//	 System.out.println("1부터"+n+"까지의 곱은"+multi+"입니다");
//	 
		// for문을 while로 바꾸기
//	 
//	 int multi =1;
//	 int i =1;
//	 while(i<=n) {
//		 multi *= i;
//		 i++;
//	 }
//	 System.out.println("1부터"+n+"까지의 곱은"+multi+"입니다");
//for문으로 작성하라

//	 for(int i =n; i>=0; i--) {
//		 System.out.println(i);
//	 }

		// 카운트업!!
//	 for(int i =0; i<=n; i++) {
//		 System.out.println(i);
//	 }

//1부터 n까지 합을 구하는 프로그램 for로 작성하기
//	 int sum = 0;
//	 for(int i =1; i<=n; i++) {
//		 sum += i;
//	 }
//	 System.out.println(sum);
//	 

//		int n;
//		do {
//			System.out.print("양의 정수값?>");
//			n = sc.nextInt();
//		} while (n <= 0); // n값을 저장
//
//		int sum = 0;
//		for (int i = 1; i < n; i++) {
//			System.out.print(i + "+");
//			sum += i;
//		} // sum 구하고
//
//		System.out.print(n + "= ");
//
//		sum += n;
//		System.out.print(sum);
//		
//		
//		System.out.print("몇 cm부터 :");
//		int min = sc.nextInt();
//		System.out.print("몇 cm까지 :");
//		int max = sc.nextInt();
//		System.out.print("몇 cm단위 :");
//		int v = sc.nextInt();
//	
//		//출력
//	System.out.println("신장 표준 체중");
//	System.out.println("------------");
//	
//	while(min <=max) {
//		System.out.print(min+" ");
//		System.out.print(Math.round((min-100)*0.9*10)/10.0);
//		System.out.println();
//		min += v;
//		
//	}

		// for문으로 풀어보자
//	for(int i =min; i<=max; i+=v) {
//		System.out.print(i+" ");
//		System.out.println((i-100)*0.9);
//	}
		////////////////////////////////
//	System.out.println("계절을 찾습니다");
//	int input;
//	int y_n;
//	do {
//		do {System.out.println("몇 월입니까?");
//			input = sc.nextInt();
//		}while(input<0 || input>12);
//		
//		if(input>=3 && input<=5)System.out.println("봄입니다");
//		else if(input>=6&& input<=8)System.out.println("여름입니다");
//		else if(input>=9&& input<=11)System.out.println("가을입니다");
//		else System.out.println("겨울입니다");
//		System.out.println("다시 하겠습니까? 1.yes  2.no");
//		y_n = sc.nextInt();
//	}while(y_n ==1);

		//System.out.println("정방형을 표시합니다");
//		int square = sc.nextInt();

//	for(int i = 0; i<square; i++) {
//		for(int j =0; j<square; j++ ) {
//			System.out.print("*");
//		}System.out.println();
//	}
//	
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		int square = sc.nextInt();
		for (int i = 0; i < square; i++) {
			for (int j = 0; j < square; j++) {
				if (i <= j) {
					System.out.print("*");
				}
			}System.out.println();

		}
	
		System.out.println();
		
		for (int i = 0; i < square; i++) {
			for (int j =0; j<square; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}System.out.println();
		}

		
	System.out.println();
	System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		int down = sc.nextInt();
		for(int i =0; i<down; i++) {
			for(int j =0; j<=i-1; j++) {
				System.out.print("");
				for(int k =0; k  ;  k++) {
					
				}
			}
		}
		
		
	} 

}
