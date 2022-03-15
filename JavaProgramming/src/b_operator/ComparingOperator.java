package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자 -<, >, <=, >=, ==, != 
		 * 문자열 비교 : equals() //문자열 서로 같은지 다른지
		 * 
		 */
		
		int x = 10;
		int y = 20;
		boolean b = x < y;
		System.out.println(b);
		b = x <= y -15;   //y-15보다 작거나 같다 . 산술연산이 비교연산 보다 우선순위가 높다
		
		String str1 = "basic";
		String str2 = "ABC"; //문자열은 참조형 타입 ---주소를 비교한다 //내용이 같아도 주소가 다를 수 있기 때문에 equals()를 사용하는게 좋다

		
		b = str1 == str2; //내용을 비교한게아니라 주소를 비교한것이다
		System.out.println(b);  
		
		b = str1.equals(str2);  //주소가 아니라 내용을 비교!
		System.out.println(b);
		
		b = !str1.equals(str2);
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		
		//x는  y보다 작거나 같다
     b = x <=y;  
		//x + 5 와 y는 같다
	  b = x+5 == y;
		//y는 홀수이다
	b = y%2 ==1;
	   //"기본형"과 "참조형"은 다르다.
	  b =! "기본형".equals("참조형");		
		
		
		
	}

}
