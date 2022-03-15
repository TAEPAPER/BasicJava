package Chap04;

public class MemberCall {

	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv;
	static int cv2 = new MemberCall().iv; //이처럼 객체를 생성해야 사용가능 !클래식 변수는 인스턴스 변수를 사용할수 업성
	
	static void staticMethod() {
		System.out.println(cv);
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		
		
	}
	void instanceMethod2() {
		
	}
}