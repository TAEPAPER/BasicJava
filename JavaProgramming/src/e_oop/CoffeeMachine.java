package e_oop;

public class CoffeeMachine {

	boolean power = false;
	int espresso;
	int lungo;
	int americano;
	int countEs = 10;
	int water = 1200;
	int MIN_WATER = 30; // ml

//메써드 만들기
	// 전원 메서드
	void power() {
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}

	// 메뉴 선택 메서드
	void choice() {
		if (power) {
			System.out.println("메뉴를 선택해주세요>>>\n 1.에스프레소 2.룽고 3.아메리카노 ");
			int sc = ScanUtil.nextInt();
			if (sc == 1) {
				if (countEs > 1 && water>MIN_WATER) {
					System.out.println("에스프레소 한잔 추출 중...");
					--countEs;
					water -= 30;
					System.out.println("남은 물 :" + water + "ml");
					System.out.println("에스프레소 캡슐 잔여:" + countEs + "개");
				} else {
					System.out.println("에스프레소 소진");
					System.exit(0);
				
				}
			} else if (sc == 2) {
				if (countEs > 1 && water>MIN_WATER) {
					System.out.println("룽고 한잔 추출 중...");
					--countEs;
					water -= 50;
					System.out.println("남은 물 :" + water + "ml");
					System.out.println("에스프레소 캡슐 잔여:" + countEs + "개");
				} else {
					System.out.println("에스프레소 소진");
					System.exit(0);
					
				}
			} else if (sc == 3) {
				if (countEs > 1 && water>MIN_WATER) {
					System.out.println("아메리카노 한잔 추출 중...");
					--countEs;
					water -= 200;
					System.out.println("남은 물 :" + water + "ml");
					System.out.println("에스프레소 캡슐 잔여:" + countEs + "개");
				} else {
					System.out.println("에스프레소 소진");
					System.exit(0);
				
				}
			}
			if (water < MIN_WATER) {
				System.out.println("물이 부족합니다");
				System.exit(0);
			}
		}
	}

	// 커피머신 청소 메서드
	void clean() {
		if (power) {
			if (water < 500) {
				System.out.println("물이 부족해서 청소할 수 없습니다");
				System.exit(0);
				boolean flag = false;
			} else {
				System.out.println("커피 머신을 청소하겠습니다");
				water -= 500;
				System.out.println("머신 청소 중...");
				System.out.println("남은 물 :" + water + "ml");
			}

		}
	}

	public static void main(String[] args) {

		CoffeeMachine cm = new CoffeeMachine();
		boolean flag = true;// 객체 생성 후 변수에 저장
		while (flag) {
			System.out.println("1.전원 2.메뉴선택 3.내부청소 0.종료");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				cm.power();
				break;
			case 2:
				cm.choice();
				break;
			case 3:
				cm.clean();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}

		}

	}

}
