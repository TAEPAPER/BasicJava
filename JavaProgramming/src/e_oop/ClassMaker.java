package e_oop;

public class ClassMaker {
//전역변수 하나를 선언 및 초기화 해주세요
	int x = 10; // 매써드 안에서 만드는 변수는 지역변수 매써드 밖은 전역변수

//리턴 타입과 파라미터가 없는 매써드 하나를 만들어주세요
	// 매써드 안에서 전역변수를 출력해주세요
	void method5() {
		System.out.println(x);
		return; //메써드 종료시키는 역할
		// 전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
		// 메서드 안에서 전역변수를 리턴해주세요

	}

	int method6() {
		return x;
	}

	// 리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요
	// 메서드 안에서 파리미터를 출력해주세요
	void method7(String parameter) {
		if(parameter.equals("")) {
			return; //메써드를 중간에 종료시킴
		}
		System.out.println(parameter);
	}

	// int 타입의 리턴타입과 int 타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	// 메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요
	int method8(int parameter1, int parameter2) {
		return parameter1 * parameter2;
	} // return의 기능 : 결과 돌려주기,메써드 종료하기
	
	
}
