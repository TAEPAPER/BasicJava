package Chap04;

public class Ch04_practice {

	public static void main(String[] args) {

		/*
		 * int x >10 && int x <20 char ch != ' ' || ch != '\t' char ch == 'x' || 'X'
		 * char ch == (int)(Math.random()*10) 'A' <= ch || ch <= 'z' int year%400 ==0 ||
		 * (year%4 ==0 && year%100 ==0 ) boolean powerOn != true str.equals("yes")
		 * 
		 */

		// 04-2;
//		int sum = 0;
//		int i =0;
//		for( i =1; i<=20; i++) {
//			if(i%2 ==0 || i%3==0) {
//				continue;
//			}else {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		method(4);
	}

//	static void method(int n) {
//		if (n == 0) {
//			return;
//		}
//		System.out.println(n);
//		method(--n);
//	}

	static void method(int n) {
		while(n!=0) { 
			System.out.println(n--);
		}
	}
	
	
	
}
