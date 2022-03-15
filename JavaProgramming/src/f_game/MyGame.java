package f_game;

import e_oop.ScanUtil;

public class MyGame {

	Character c;
	Item[] items;

	MyGame() { // 생성자
		c = new Character("가렌", 100, 50, 20, 10);
		items = new Item[10];
		items[0] = new Item("무한의대검", 0, 0, 10, 0);
		items[1] = new Item("가시갑옷", 0, 0, 0, 10);

	}

	public static void main(String[] args) {
		// rpg게임 만들기
		// 캐릭터 몬스터 사냥 아이템 경험치 레벨업 몬스터가 드랍하는 아이템
		// 메인메서드에서 변수들을 사용하려면 객체생성을 다 해줘야해
		//System.out.println(new MyGame().c); // 이렇게 해줘야만 사용할 수 있어

		new MyGame().start();
	}

	void start() {
		while (true) {
			System.out.println("1.내정보 2.사냥 0.종료>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				c.status();
				break;
			case 2:
				hunt();
				break;
			case 0:
				System.out.println("종료되었습니다");
				System.exit(0); // 프로그램 강제 종료 메서드
			}
		}

	}

	void hunt() {
		Monster m = new Monster("고블린", 20, 10, 15, 10,1,150, new Item[] { items[0], items[1] });
		System.out.println(m.name + "를 만났습니다.. 전투를 시작합니다.");

		int input = 0;
		battle: while (true) {
			System.out.println("1.공격 2.도망>");
			input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				c.attack(m);
				if (m.hp <= 0) {
					System.out.println(m.name + "을 처치하였습니다");
					c.getExp(m.exp);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다");
				break battle;
			}
		}
	}

}
