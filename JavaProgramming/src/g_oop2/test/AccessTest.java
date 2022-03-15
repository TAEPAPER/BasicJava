package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();

//		System.out.println(am.protectedVar);
//		am.protectedMethod();        //나를 통해서 해야해 그래서 요렇게는 접근 불가

//		System.out.println(am.defaultVar);
//		am.defauleMehtod();

//		System.out.println(am.privateVar);
//		am.privateMethod();
		
		AccessTest at = new AccessTest(); //자식클래스만의 것을 생성해줘야해(상속 받아서 사용가능한것이 이런것!-protected)
		System.out.println(at.protectedVar);   
		at.protectedMethod();  //접근제어자 사용이유
		
		/*
		 * 접근제어자를 사용하는 이유
		 * -데이터를 보호하기 위해 
		 * -사용하는데 불필요한 멤버를 숨기기 위해
		 * 
		 */
		
		
		
		
		
		
	}

}
