package e_oop;

public class Static {

	/*
	 * - static을 붙이면 프로그램 실행시 메모리에 올라간다 -객체생성을 하지 않아도 사용할 수 있다 
	 * -static을 붙인 변수는 객체간에 변수의 값을 공유한다 -모두에게 적용되는 것은 static을 붙인다!
	 *  -static이 붙은 멤버의 명칭: 클래스 변수, 클래스 메서드
	 * -static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 */
	// 변수의 위치 : 메서드 안에 있으면 지역변수, 밖에 있으면 전역변수
	// static 여부 : 전역변수 중에 static이 붙으면 클래스 변수, 붙지 않으면 인스턴스 변수
	// ***변수에 static을 붙이는 이유는 값을 공유하기 위함이다
	// 자주 사용되는 것들은 static을 붙여서 객체생성 노 필요 . 메모리에 한번만 올라가니까 메모리 낭비도 없음

	public static void main(String[] args) {

		Marine m1 = new Marine();
		Marine m2 = new Marine();

		System.out.println("m1 HP:" + m1.hp);
		System.out.println("m2 HP:" + m2.hp);

		m1.hp = 10;
		m2.hp = 20;
		System.out.println("m1 HP:" + m1.hp);
		System.out.println("m2 HP:" + m2.hp);

		System.out.println("m1 ATT:" + m1.attack);
		System.out.println("m1 DEF:" + m1.defence);
		System.out.println("m2 ATT:" + m2.attack);
		System.out.println("m2 DEF:" + m2.defence);

		m1.attack += 1;
		m2.defence += 1;

		System.out.println("m1 ATT:" + m1.attack);
		System.out.println("m1 DEF:" + m1.defence);
		System.out.println("m2 ATT:" + m2.attack);
		System.out.println("m2 DEF:" + m2.defence);

		System.out.println();
		// system이라는 클래스에 out 클래스에 println이라는 메서드
//		Math.random() 마찬가지로 static이 붙어 있는 것과 같다
// 		클래스.메써드

		System.out.print("문자열 입력.>");
		String str = ScanUtil.nextLine();
		System.out.println("입력받은 문자열:" + str);
		System.out.print("숫자입력>");
		int num = ScanUtil.nextInt();
		System.out.println("입력받은 숫자 :" + num);

	}

}

class Marine {

	int hp = 40;// 체력 -각자에게 적용
	static int attack = 5;// 공격력--업그레이드 하면 모두에게 적용
	static int defence = 0;// 방어력

}