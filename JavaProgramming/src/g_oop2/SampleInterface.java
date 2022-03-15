package g_oop2;

public interface SampleInterface {//상수와 추상메서드만 가질 수 있는 //부모의 역할만 한다(상속 역할만 한다)
	
	
	//인터페이스의 모든 멤버 변수는 public static final제어자를 사용해야한다.
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
	
	
}
class SampleImplement implements SampleInterface , SampleInterface2 { //다중상속이 가능하다 //메서드의 내용이 없기 때문에 다중 상속이 가능하다

	@Override
	public void method1() {	
		
	}
	@Override
	public void method2() {	
		
	}
	@Override
	public void method3() {

	}
}
interface SampleInterface2{
	void method1();
	void method3();
}

