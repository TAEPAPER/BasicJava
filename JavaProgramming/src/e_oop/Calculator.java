package e_oop;

public class Calculator {
	// 산술연산자 +-*/% 다섯개의 메써드를 만들어라
	// 파라미터와 리턴 타입을 어떻게 할 것인가

	// 더하기
	double plus(double a, double b) {
		return a + b;
	}

	// 빼기
	double minus(double a, double b) {
		return a - b;
	}

	// 곱하기
	double multi(double a, double b) {
		return a * b;
	}
	//나누기 연산
	double div(double a, double b) {
		return a/b;
	}
	//나머지 계산
	double rest(double a, double b) {
		return a%b;
	}

}