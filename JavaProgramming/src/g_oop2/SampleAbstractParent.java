package g_oop2;
//추상클래스
public abstract class SampleAbstractParent {  //추상 클래스//객체 생성을 할 수 없다//부모로만 사용을 한다(다른 클래스가 상속받기 위해서 존재)
	
	//추상메서드-구체적인 이야기 (내용이 없는 메서드)
	void method() {} //내용 있는겅
	
	abstract void abstractMethod();//블럭 자체가 없어 //제어자 abstract가 붙는다 //호출이 안된다!!
	//이 클래스도 객체 생성을 못한다 -하나라도 가지고 있으면 추상클래스가 된다
	//자식 클래스의 내용이 다 다를 때 사용	
}

class SampleAbstractChild extends SampleAbstractParent{
	
	@Override //추상클래스의 부모는 오버라이드 메서드를 생성을 강제하는 역할을 한다(안할 경우 컴파일 오류가 뜬다)
	void abstractMethod() {
		
	}
	
	
}
