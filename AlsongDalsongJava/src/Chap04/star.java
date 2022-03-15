package Chap04;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= 1; j--) {
//				if (j > i % 5 && i % 5 != 0) {
//					System.out.print(" ");
//				} else if (j <= i % 5 || i % 5 == 0) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//
//		// 다르게 해보쟈!!엥 for문이 세개네?
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(' ');
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		// 피라미드를 표시합니다
//
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2 * i - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단수는?");
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j < n - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= 2 * i - 1; j++) {
//				System.out.print(i % 10);
//			}
//			System.out.println();
//		}
//
		 Scanner sc = new Scanner(System.in);
//		 int n ;
//		 do {
//			 System.out.println("2이상의 정숫값");
//			 n = sc.nextInt();
//		 }while(n<2);//~하는 동안에//안의 조건이 참인 동안에!!
//
//		 
//		 int i;
//		 for( i=2; i<n; i++) {
//			 if(n%i==0)break;
//		 }if(i ==n) {
//			 System.out.println("소수입니다");
//		 }else {
//			 System.out.println("소수가 아닙니다");
//		 }
//			 
//		 int sum=0;
//		 int count =0;
//			 System.out.println("정수를 더합니다");
//			 System.out.println("몇개를 더할까요?");
//			int o = sc.nextInt();
//			 do {
//			 System.out.println("정수입력>" +"0으로 종료");
//			 int a = sc.nextInt();
//			 if(a==0) break;
//			sum += a; 
//			 count++;
//		 }while(count < o);
//		 
//		 System.out.println("합계는"+ sum +"입니다");
//		 System.out.println("평균은"+ (double)sum/count);
//		 
//		System.out.println("정수를 더합니다");
//		System.out.println("몇개를 더할까요?");
//		int n = sc.nextInt();
//		int count=0;
//		int sum =0;
//		do {
//			System.out.print("정수:");
//			int a = sc.nextInt();
//			sum+= a;
//			count++;
//			if(sum >1000) {
//				System.out.println("합계가 1000을 넘었습니다\n마지막 값은 무시합니다");
//				sum -= a;
//				count--;
//				break;
//			}
//	
//		}while(count<n);
//		 
//		System.out.println("합계는"+sum+"입니다");
//		System.out.println("평균은"+(double)sum/count);

//		 System.out.println("정수를 더합니다");
//		 int sum =0;
//		 int i;
//		 for(i =0; i<5; i++) {
//			 System.out.println("정수>");
//			 int a = sc.nextInt();
//			 if(sum +a >1000) {
//				 System.out.println("합계가 1000을 넘었습니다\n마지막 값은 무시합니다");
//				 break;
//			 }
//			 sum += a;
//		 }
//		 System.out.println("합계는"+sum+"입니다");	
//		 if(i!=0)
//		 System.out.println("평균은"+(double)sum/i);
//		
		 //정수값을 연달아 읽어서 음수가 아닌 값의 합계와 평균을 구하자! 음수의 개수는 평균을 구할 때 분모에서 제외할 것!
		 System.out.println("정수를 더합니다");
		 System.out.println("몇 개를 더할까요?");
		 int n = sc.nextInt();
		 int i;
		 int sum =0;
		 int count =0;
		 for(i =0; i<n; i++) {
			 System.out.println("정수>");
			 int a = sc.nextInt();
			 sum += a;
			 if(a<0) {
				 System.out.println("음수는 더하지 않습니다");
				 sum -=a;
				 count++;
			 }
		 }
		 System.out.println("합계는"+sum+"입니다");
		 System.out.println("평균은"+(double)sum/(i-count));
		 
		 
		 
		 
		 
		 
	}
}
