package Chap03;

import java.util.Random;
import java.util.Scanner;


public class order_by {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("정수a를 입력해주세요>");
//		int a = sc.nextInt();
//		System.out.println("정수a를 입력해주세요>");
//		int b = sc.nextInt();
//		System.out.println("정수a를 입력해주세요>");
//		int c = sc.nextInt();
//		
//		if(a>b) {
//			int temp = 0;
//			temp= a;
//			a = b;
//			b = temp;
//		}else if(b>c) {
//			int temp;
//			temp = b;
//			b= c;
//			c = temp;
//		}else if(a > b) {
//			int temp;
//			temp = a;
//			a = b;
//			b = temp;
//			
//		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		Random rand = new Random();
		int zt = rand.nextInt(3);
//	if(zt ==1) {
//		System.out.println("바위");
//	}else if(zt ==0) {
//		System.out.println("가위");
//	}else {
//		System.out.println("보");
//	}
//	System.out.println(zt);	
		
		
	switch(zt) {
	
	case 0 : System.out.println("가위"); break;
	case 1 : System.out.println("바위"); break;
	case 2 : System.out.println("보");  break;
	}
	
	System.out.println("몇 월입니까?");
	int seasonName = sc.nextInt();

	
	switch(seasonName) {
		
	case 3 :
	case 4 :
	case 5 : System.out.println("봄입니다"); break;
	case 6 :
	case 7 :
	case 8 : System.out.println("여름입니다"); break;
	case 9 :
	case 10 :
	case 11 : System.out.println("가을입니다"); break;
	case 12 :
	case 01 :
	case 02 : System.out.println("겨울입니다"); break;
	
	}
		
		
		
		
		
		
		
		
		
		
	}

}
