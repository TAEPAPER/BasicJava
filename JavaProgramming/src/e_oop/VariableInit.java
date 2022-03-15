package e_oop;

public class VariableInit {
	// 명시적 초기화
	int var = 10; // 변수를 만들면서 초기화하기
	static int classVar = 20;

	// 초기화 블럭

	{ // 인스턴스 초기화할때
		var = 20;
	}

	static {
//클래스 초기화할 때 //초기화하는데 여러절이 필요할 때 사용

		classVar = 40;
	}

	// ******생성자*******
	/*
	 * new Scanner(); - Scanner라는 클래스 이름과 같은 매서드 --생성자!! -클래스와 같은 이름의 메서드 -인스턴스 변수를
	 * 초기화 하기 위해 사용한다--static 이 붙지 않은 애들만 초기화한다 -클래스에 생성자는 반드시 하나 이상 존재해야한다 -직접
	 * 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다 -생성자는 리턴타입이 없다 그러나 파라미터는 만들 수 있다
	 * 
	 */
	// 생성자 생성
	VariableInit() {
		var = 50;
		// 생성자를 사용하는 이유는 파라미터를 사용할 수 있기 때문이다.
	}

	public static void main(String[] args) {
		Init i1 = new Init();// 객체생성
		// 초기화 할 때
		i1.a = 10;
		i1.b = 20;
		i1.c = 30;

		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;

		// ----------

		Init i3  = new Init(70,80,90); 
		System.out.println(i3.a);
		System.out.println(i3.b);
		System.out.println(i3.c);
		
		
	}

}

class Init {
	int a;
	int b;
	int c;

	// 생성자
	Init(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		// this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다
		//this : 객체의 주소가 저장되어 있는 변수 라고 보면된다
	}

	Init(){
		//파라미터가 없는 생성자 
		this(10, 20, 30);
		//this() : 생성자에서 다른 생성자를 호출할 때 사용
		
		//메써드는 이름이 중복될 수 있다
		//오버로딩: 같은 이름의 메서드를 여러개 정의하는 것 (조건 : 이름으로 구분 할 수 없으니 파라미터로 구분(개수or타입이 달라야한다)
		
		
	}
	
	
	
	
}