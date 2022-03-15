package Chap02;
import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수값:");
//		int x = sc.nextInt();
//		
//	System.out.println("마지막 자릿수를 제외한 값은"+(x/10)+"입니다");  //10으로 나누고 int 값이니까 소수점 버림
//	System.out.println("마지막 자릿수는"+(x%10)+"입니다");  
//	
//	System.out.println("----------------------------------");
//		System.out.println("실수a를 입력하시오>");
//		double a = sc.nextDouble();
//		System.out.println("실수b를 입력하시오>");
//		double b =  sc.nextDouble();
//		double sum = a+b;
//		System.out.println("a값은:"+a);
//		System.out.println("b값은:"+b);
//		System.out.println("합계는 :"+ sum);
//		System.out.println("평균은 :"+ sum/2);
//		
//		System.out.println("삼각형의 넓이를 구합니다");
//		System.out.println("삼각형의 밑변을 입력해주세요");
//		double bottom = sc.nextDouble();
//		System.out.println("삼각형의 높이를 입력해주세요");
//		double height = sc.nextDouble();
//		
//		System.out.println("밑변:"+ bottom);
//		System.out.println("높이:"+ height);
//		System.out.println("넓이:"+ (bottom*height/2)+"입니다");
		
		System.out.println("구의 겉넓이와 부피를 구합니다");
		System.out.print("반지름을 입력해주세요");
		double r = sc.nextDouble();
		final double PI = 3.1416;
		System.out.println("겉널이는"+(4*PI*r*r));
		System.out.println("부피는"+(4/3.0*PI*r*r*r));
		
		
		     
		
		
	}

}
