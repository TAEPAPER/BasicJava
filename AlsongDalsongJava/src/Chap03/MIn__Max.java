package Chap03;

import java.util.Scanner;

public class MIn__Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값a");
		int a = sc.nextInt();
		System.out.print("정수값b");
		int b = sc.nextInt();
		
		System.out.print("정수값c"); 
		int c = sc.nextInt();
		
	
		 		
		/*
		 * if(a==b) { System.out.println("a와 b는 같습니다"); }else { int min; int max;
		 * 
		 * if(a<b) { min = a; max =b; }else { min = b; max =a; }
		 * System.out.println("작은 값은"+ min +"입니다");
		 * System.out.println("큰 값은 "+max+"입니다"); }
		 */
		
//		if (a==b) {
//			System.out.println("두 수는 같습니다");
//		}else {
//			int temp = 0;
//			if(a<b) {
//			temp = a;
//			a = b;
//			b = temp;
//			}
//			System.out.println("변수 a는 "+ a+ "입니다");
//			System.out.println("변수 a는 "+ b+ "입니다");
//		}
	      int temp;
		if(a>b) {
			
			temp =a;
			a = b;
			b =temp;
		}else if(b>c) {
			temp = b;
			b = c;
			c= temp;
			
		}else if(a>c) {
			temp =a;
			a = c;
			c =temp;
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
