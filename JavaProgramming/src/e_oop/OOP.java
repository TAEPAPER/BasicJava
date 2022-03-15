package e_oop;

public class OOP {

	public static void main(String[] args) {
//	객체지향 프로그래밍(object oriented programming)
//  -프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
//  -코드의 재사용성-(같은내용이 여러번 중복될 때 따로 분리시켜서 사용하면 재사용가능)이 높고 유지보수가 용이하다

		SampleClass sc = new SampleClass(); // 객체생성 객체를 변수에 저장
		String returnValue = sc.method(5, "ABC"); // 리턴값을 변수에 저장
		System.out.println(returnValue);
		
		sc.method2();  //매개변수도 없고 리턴타입도 없음(void)	
		
		sc.flowTest1();
		
		
	}

}
