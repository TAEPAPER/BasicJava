package Joon;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a= sc.nextInt();
		int  b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		
		String c = sc.next();
		System.out.println(a*(c.charAt(2)-'0'));
		System.out.println(a*(c.charAt(1)-'0'));
		System.out.println(a*(c.charAt(0)-'0'));
		System.out.println(a*Integer.parseInt(c));
		
			sc.close();
		
	}

}
