package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자 -&&(AND), ||(OR), !(NOT)  비교연산을 연결하는 역할
		 * -피연산자로 boolean만 허용한다 
		 * 
		 */

		int x = 10;
		int y = 20;
		boolean b =  0< x && x<10 || x<y; //비교연산이 논리연산보다 우선순위가 높음
		//산술연산 비교연산 논리연산 이순으로 우선순위! //&&가 먼저 실행된다
		
		
		b =!(x<y); //조건식의 결과를 반대로 저장한다.  //괄호가 없으면 컴파일 에러가 발생하니가 괄호해줭
		
		//효율적인 연산
		b = true && true ;//true
		b = true && false;//false
		b= false && true;//false
		b =false&&false;//false    //왼쪽 값을 먼저 보고 먼저 false가 나오면 무조건 false!-오른쪽을 보지 않는다
		
		b = true || true ;// true
		b = true || false;// true
		b=  false || true;// true
		b = false ||false; //false
		
		int a  = 10;
		b = a <5 && 0< a++; //false&& 오른쪽 확인안한다! 그래서 오른쪽이 작동하지 않는다
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1.x가 y보다 크고 x가 10보다 작다
		 b = x>y && x<10;
		 System.out.println(b);
		//2. x가 짝수이고 y보다 작거나 같다
		b = x%2==0 || x<=y;
		System.out.println(b);
		//3. x가 3의 배수이거나 5의 배수이다
		 b = x%3 ==0 || x%5==0;
		 System.out.println(b);
		 
		
		
		
		
		
		
		
		
		
		
	}

}
