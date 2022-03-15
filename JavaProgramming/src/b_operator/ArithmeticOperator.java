package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		/*
		 * 산술 연산자 
		 * -사칙연산 : +,-,*,/,%(나머지) 
		 * -복합연산 : += ,-= ,*= , /=, %= 
		 * -증감연산 : ++, --
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;   
		
		result = 10/3;
		System.out.println(result); //산술연산자는 피연산자(이항연산자)는 양쪽에 있는 타입이 같아야만 연산이 된다!  
		//소수점을 얻기 위해서는 실수 타입을 사용해야한다 
		
		result = 10%3;    
		System.out.println(result);
		//홀수는 2로 나눠서 나머지가 1인것 . 짝수는 나머지 0
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력해주세요.
		int a1= 20*5;
		int b1 = 100/70;
		int c1 = 70+1000;
		int d1 = 70%8;
		int e1 = 80-65;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		
		//복합연산자
		result = result +3;
		result += 3;
		result -= 5;
		result *= 2;
		result /= 3+2;     // 오른쪽의 연산이 다 끝난 다음에 복합연산이 된다
		
		//아래의 문장을 복합연산자를 사용한 문장으로 바꿔주세요
		//result = result + 10;
		result +=10;
		//result = result % 5;
		result %= 5;
		//result = result -2*3;
		result -= 2*3;
		
		//증감연산
		//증감연산자(++) : 변수의 값을 1 증가시킨다
		//감소연산자(--) : 변수의 값을 1 감소시킨다
		
		int i  = 0;
		++i;//전위형 : 변수의 값을 읽어오기 전에 1 증가된다 1을 읽어옴
		i++;//후위형 : 변수의 값을 읽어온 후에 1 증가된다 i값인 0을 읽어옴
		--i;
		i--;
		
		i = 0;
		System.out.println("++i="+ ++i);
		i =0;
		System.out.println("i++="+ i++);
		System.out.println(i); //값이 바뀔 수 있다
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = (double)_int + _double;//자동형변환, int가 더 작은애 그래서 자동으로 int가 double로 형변환된다 (double)이 숨어있다
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; //최소 4바이트가 되어야 컴퓨터가 연산을한다 ! int는 4바이트! 둘다 int 타입으로 변환이되서 연산이 된다
		
		char _char = 'a';  //실제로는a와 짝지어진 숫자가 저장된다 //유니코드
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int);       //char 타입은 2바이트  역시 4바이트 안되서 컴퓨터가 연산 x int로 변환이 되서 연산
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127; //byte가 가질 수 있는 최대의 수        
		b++; //128로 범위를 벗어남 --> 가장 작은 값이 된다 --->그래서 -128    ~~오버플로우~~
		System.out.println(b);
		b--;     //가장 작은 값에서 -1을 하니까 범위를 벗어나서 가장 큰값이 된다 그래서 127! ~~언더플로우~~
		System.out.println(b);
		
		
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		//1. 123456  + 654321
		long result1 = 123456 + 654321;
		//2.1번의 결과값 *123456
		result1 *= 123456;
		//3.2번의 결과값 /123456
		result1 /= 123456;
		//4.3번의 결과값 -654321
		result1 -= 654321;
		//5.4번의 결과값 %123456
		result1 %= 123456;
		System.out.println(result1); //오버플로우 
		
		//3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int x;
		int y;
		int z;
		
		x=10;
		y=25;
		z=55;
		
		int sum = x+y+z; 
		double avg = (sum)/3.0;  //소수점이 나올수 있으니까 더블이 좋아요! 소수점을 얻고 싶으면 최소한 둘 중하나는 소수점이여야해!
		System.out.println(sum);
		System.out.println(avg);
		
		/*
		 * 반올림하는 방법 avg = Math.round(avg);
		 */
		
		avg = Math.round(avg*10)/10.0;
		System.out.println(avg);    //소수점 첫째짜리 까지 보고 싶은 경우에는 소수점을 *10을 해서 옮긴다음에 반올림하고
		//다시 소주점을 돌려놓는다.
		
		//랜덤한 값을 발생시키는 방법  : Math.random() - 0.0~ 1.0 미만
		int random = (int)(Math.random()*100)+1; //1~100사이를 원할 때 --random 해서 0.0 나오면 최종적으로 0이 나올 수 있으니까 +1을 해줘서 1~  가능하게해준다
		System.out.println(random); //자주 사용할 것
		
		
		
		
		
		
		
		
		
		
		
	}

}
