package b_operator;

import java.util.Scanner;

public class 연습용 {

	public static void main(String[] args) {
	
//		
////		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.\
////	Scanner sc = new Scanner(System.in);
////		int x;
////		int y;
////		String _op;
////		System.out.println("첫번째 숫자를 입력해주세요");
////		x = Integer.parseInt(sc.nextLine());
////		System.out.println("두번째 숫자를 입력해주세요");
////		y = Integer.parseInt(sc.nextLine());
////		System.out.println("연산자를 입력해주세요");
////		_op = sc.nextLine();
////		
////		int cal = _op.equals("+")?x + y :(_op.equals("-")? x-y :(_op.equals("*")? x*y :( _op.equals("/")? x/y : 0000)));
////		System.out.println(cal);
////		
//		
//		
//		int result;
//		result = 10/3;
//		System.out.println(result);
//		result = 10%3;
//		System.out.println(result);
//		
//		double result2;
//		result2 = 10.0 /3;
//		System.out.println(result2);    //둘중 하나만 소수여도 결과값 소수다
//	
//		
////		result += 10;
////		result %= 5;
////		result -=2*3
//				
//		int i;
//		i =0;
//		System.out.println(--i);
//		System.out.println(i);
//		System.out.println(i--);
//		System.out.println(i);
//		
//		int _int = 10;
//		double _double = 3.14;
//		double result3 = _int + _double;
//		System.out.println(result3);
//		
//		byte _byte = 5;
//		short _short = 10;
//		_int = _byte + _short;
//	
//		
//		
//		
//		int x;
//		int y;
//		int z;
//		
//		x=22;
//		y=27;
//		z=58;
//		
//		int sum = x+y+z; 
//		double avg = (sum)/3.0;  //소수점이 나올수 있으니까 더블이 좋아요! 소수점을 얻고 싶으면 최소한 둘 중하나는 소수점이여야해!
//		System.out.println(sum);
//		System.out.println(avg);
//		
//	//반올림
//	avg = Math.round(avg*10)/10.0;
//	System.out.println(avg);
//	
//	System.out.println(Math.round(avg*10));
//		
// //random()
//	
//	int random;
//
//      random = (int)(Math.random()*100);
//		System.out.println(random);
//	
      
      
 int x;
 int y;
 boolean b;
 x =56;
 y = 29;
 b = x <= y;
 System.out.println(b);

 
 String str1;
 String str2;
 
 str1 = "안녕하세요";
 str2 = "안녕하세요";
 
 b = str1 ==str2;
 System.out.println(b);
 b = str1.equals(str2);
 System.out.println(b);

 b =! "기본형".equals("참조형");
 System.out.println(b);

 
 //비트 연산자
// //삼항 연산자
// INT NUM1 = 10;
// INT NUM2 = 20;
////


//삼항연산자 
 //주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자	
//		
//int regNo = 1;
// String gender = regNo ==1? "남자": "여자";
// System.out.println(gender);
//		
//     gender = regNo ==1?"남자" : ( regNo ==2? "여자":"확인없음");
//      System.out.println(gender);
//     
//      	
//      
     Scanner sc = new Scanner(System.in); //입력받게 해주는 클래스
//   //2개의 숫자를 입력받고, 둘중 더 큰 숫자를 출력해주세요
//     System.out.println("첫번째숫자를 입력해주세요>");
//    int first  = Integer.parseInt(sc.nextLine());
//     System.out.println("두번째 숫자를 입력해주세요>");
//     int second = Integer.parseInt(sc.nextLine());
//     int _bigger = first  >second? first : second;
//    System.out.println(_bigger);
    
  //숫자를 입력받고, 그 숫자가 1이나 3이면 남자를// 2나 4면 여자를 출력해주세요.
  		//그외의 숫자를 입력하면 확인불가를 출력해주세요.
   System.out.println("숫자를 입력해주세요");
   int numer = Integer.parseInt(sc.nextLine());
   String gender = numer==1 || numer==3? "남자":(gender = numer==2 || numer==4? "여자": "확인불가");
      
      System.out.println(gender);
      
    
    
    
    
    
    
	}

}
