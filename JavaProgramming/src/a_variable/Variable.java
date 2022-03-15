package a_variable; //패키지: 클래스의 위치를 알려줌 반드시 가장 첫줄에 존재해야함 //class : 데이터와 기능을 모아놓은 것 //메써드: 관련 명령문들을 모아놓은 것

import java.util.Scanner;
//import 단축키 : ctrl+shift+o --자동으로 import해준다

public class Variable { // 클래스 : 자바 프로그램의 구성요소 (데이터)

	public static void main(String[] args) { //메써드:명령문의 집합 / main이라는 이름을 가진 메써드/프로그램을 실행시키는 역할
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
		
//		한줄 주석 : ctrl_+ shift _c  (커서가 위차한 라인이 주석처리가 된다) - 다시한번 누르면 주석이 취소된다
		
//		 범위 주석 : ctrl+ shift + / (해제 :\ )  ---드래그범위 지정
		
		/* integer 정수 */		
		int x;
		x = 10;     //오른쪽에 있는 값을 왼쪽에 저장하겠다는 의미
		
		int y = 10;
		
		/* 외워두면 좋습니다
		 * *기본형 타입*  공간을 만들어서 공간에 저장
		 * -정수 : byte(1), short(2), *int(4/약 20억), long(8)  8바이트
		 * -실수 :float(4/7자리),*double(8/15자리) 
		 * -문자 : char(2)  2바이트---한글자만 표현할수 있다
		 * -논리 : boolean(1)  True or False
		 * 
		 * 1비트에느 두개의 숫자가 들어간다
		   2비트에는 4개의 숫자가들어간다
			3비트에는 8개의 숫자가 들어간다
			2^n 이다

		1byte = 8bit이므로 2^8 인 256개의 숫자가 들어간다
		즉, 음수 128개와 0 그리고 127개의 양수가 들어간다 
		즉, 표현범위는 -128~127 

		short는 2바이트이다 즉, 16bit 이다  65,536개의 숫자를 지정할 수 있다.
		둘로 나누면 32768개의 음수와 0 그리고 32767개의 양수
		표현범위는 -32769 ~ 32767까지의 정수

		 * 
		 * 
		 * 
		 * 
	
		 * 
		 * *참조형 타입* 공간을 만들어서 또 공간을 만들어서 저장하고 다른 곳에 주소를 참조한다 (주소를 저장한다)
		 * -문자열 :String(4)---여러글자를 문자열이라고 한다
		 * 
		 * 명명규칙 
		 * -영문자 대소문자,한글 숫자, 특수문자(_,$)를 사용할 수 있다. 그러나 한글은 사용하지 않는다.
		 * -숫자로 시작할 수 없다 
		 * -예약어는 사용할 수 없다--- 진하게 표시된게 예약어 
		 * -[낙타식 표기법을 사용한다.(mySampleVariable)]  ---맨 앞글자는 소문자로
		 * -[클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
		 */
		
		/*long a1 = 30;
		double a = 30.5; //각타입에 맞는 걸 저장해줘야해
		long b = 30L; //접미사 L을 붙여야 long 타입이 된다.
		long c = 300000000000000000L; //int인 경우 범위를 벗어나서 long을 써줘야한다
		float d = 3.14f; //접미사를 붙여줘야해
		char e = '가'; //작은 따옴표에 한글자가 들어가야해
		boolean f = true; //true,false
		String g = "가나다라"; //변수이름이 중복되서는 안된다
		*/
		//9가지 타입을 모두 사용해 9개의 변수를 선언 및 초기화 해주세요.
		
		
		/*byte a = 3;
		short a2= 26;
		int a3= 500;
		long a4=600000000L;
		float  b = 3.14f;
		char c = '박';
		boolean d = false;
		String e = "박태정자바수업듣는중";	
		*/
		//형변환(데이터의 타입을 다른 타입으로 변경하는 것) - 다른 타입의 값을 저장해야할 때 타입을 바꿔서 저장해야해
		
		int _int = 10;
		long _long = 20L;
		
		_int = (int)_long; //큰애를 작은애로 담는 것이기 때문에 데이터 변환이 필요하다
		
		_long = _int;     //작은 타입에서 큰타입으로 형변환하는 경우에는 자동으로 형변환이 된다--데이터가 손실 or not?
		
		//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
		

		float _float = 3.14f;
		_long = (long)_float;
		
		char _char = ' '; //우리 눈에는 빈공간 이지만컴퓨터는 0,1로 인식해서 숫자로 인식
		_int = _char;
		_char= (char)_int;
		
		
		
		//출력(콘솔)
		
		System.out.print("출력"); //괄호 안에 있는 것을 출력해줌
		System.out.println("출력 후 줄바꿈"); //줄바꿈 해줌
		System.out.printf("출력 포멧 지정"); //출력 방식 조금 복잡
		//실행 단축키 : ctrl + f11

		//탈출 문자
		System.out.println();
		System.out.println("탭은\t4칸에 맞춰 띄워줍니다."); //tab는 4칸을 띄워줌
		System.out.println("줄바꿈을\n해줍니다.");
		System.out.println("\"쌍따옴표를 넣어줍니다\"");
		System.out.println("\\역슬래시를 넣어줍니다.");
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스//어디에 있는 클래스 인지 몰라서 컴파일 오류가 뜬다
		                                     //그래서 import 해줘야한다 맨위에 확인할것 (ctrl +shift +o 는 자동으로 import 해준다)
		/*
		 * System.out.println("아무문자열이나 입력해주세요>"); 
		 * String str =sc.nextLine(); // 사용자에게 입력을 받을 수 있음 ,입력받은 내용을 str이라는 변수에 저장 //클래스의 메써드
		 * System.out.println("입력받은 내용 :"+str); //문자열은 +를 사용해서 이어붙일 수 있다 //println인 경우에는 커서가 줄바꿈된다 , 그냥 print인경우에는 바로 옆에 커서
		 * 
		 	
		 * System.out.print("숫자를 입력해주세요>"); 
		 * int nextInt = sc.nextInt();   nextInt라는 변수에 저장해줌 
		 * System.out.println("입력받은 숫자 :" +nextInt); 
		 * System.out.println("문자열 입력>");
		 * String str = sc.nextLine(); 
		 * System.out.println("입력받은 문자열 : " +str);
		 * System.out.print("입력끝!"); //버그가 있으니 nextInt 말고 nextLine()을 사용하자 그러고 나서    Integer.parseInt(sc.nextLine());   를 사용하자(밑에 코드)
		 */
		
		
		/*
		 * System.out.println("숫자 입력>"); 
		 * //기본형과 참조형 간에 형변환 안된다 int num =
		 * Integer.parseInt(sc.nextLine()); System.out.println("입력받은 숫자 :"+num);
		 */
		
	
		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 변수에 이름을 저장해주세요
		
		
			System.out.print("나의 이름을 입력해주세요>");
	        String _name = sc.nextLine();
	        System.out.println("나의 이름은:" +_name);
	        
	        //자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 변수에 나이를 저장해주세요.
	        
	        System.out.print("나의 나이를 입력해주세요>");
	        int _age = Integer.parseInt(sc.nextLine());
          System.out.println("나의 나이는:"+_age);
	        
		
	        //입력받은 이름과 나이를 출력해 주세요
		System.out.println("이름:" +_name + "나이:" +_age);
		//변수 이름을 지을 때는 앞글자는 소문자로 해주기
		
		
		

	        
	       
	        
	        
	        
	        
	        
	        
	        
	        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		 
		
		
		
		
		
		
		
	}

}
