package Chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomInteger {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double x= rand.nextDouble(); 
		double y =10*rand.nextDouble();
System.out.println(x);
System.out.println(y);

Scanner sc = new Scanner (System.in);
//System.out.print("성을 입력해주세요");
//String a = sc.nextLine();
//System.out.print("이름을 입력해주세요");
//String b = sc.nextLine();
//
//System.out.println("안녕하세요."+a +b+"씨." );
//
//System.out.println("주소를 입력해주세요");
//String _add = sc.nextLine();
//System.out.println("주소는 "+_add+"입니다");
//
//System.out.println("입력해주시오");
//String ab = sc.next();
//System.out.println("입력해주시오2");
//String bc = sc.nextLine();

String s1 = "ABC";
String s2 = "XYZ";
System.out.println("문자열 s1은 "+s1+"입니다");
System.out.println("문자열 s2은 "+s2+"입니다");

s1 = "FBI";

System.out.println("문자열 s1은 "+s1+"입니다");
System.out.println("문자열 s2은 "+s2+"입니다");











	}

}
