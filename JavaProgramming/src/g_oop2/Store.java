package g_oop2;

public class Store {

	public static void main(String[] args) {
		// store //판매할 물건들 /이름/가격/(공통된 것들)을 부모클래스로 만들것이다
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG 컴퓨터", 1500000);

		AirCon ac1 = new AirCon("삼성 에어컨", 2000000);

		AirCon ac2 = new AirCon("LG 에어컨", 2500000);

		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3500000);

		Customer c = new Customer();
		c.buy(d1);
		c.buy(ac2); // 상속을 받아서 다형성 형성
		c.buy(tv2);

		System.out.println(c.money);
		((Desktop) c.items[0]).programming(); // 형변환

	}

}

class Product { // 부모클래스
	String name;
	int price; // 가격

	Product(String name, int price) {
		this.name = name; // 생성자
		this.price = price;
	}

	// 상품의 정보를 반환하는 메서드
	String getInfo() {
		return name + "(" + price + "원)";
	}
}

class Desktop extends Product {
	Desktop(String name, int price) {// 생성자
		super(name, price);
	}

	void programming() {
		System.out.println("프로그램을 만듭니다");
	}
}

class AirCon extends Product {
	AirCon(String name, int price) {
		super(name, price); // 생성자
	}

	void setTemperature() {
		System.out.println("온도를 설정합니다");
	}
}

class TV extends Product {
	TV(String name, int price) {
		super(name, price);
	}

	void setChannel() {
		System.out.println("채널을 변경합니다");
	}
}

class Customer {
	int money = 100000000;

	Product[] items = new Product[10]; // 속성

	void buy(Product p) {// 구매하는 메서드 //product 타입의 파란미터로 하면 tv 에어컨 다 받을 수 있어
		if (money < p.price) {
			System.out.println("잔돈이 부족합니다");
			return;
		}

		money -= p.price;
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = p;
				break; // 배열에 물건을 저장
			}

		}
		System.out.println(p.getInfo() + "를 구매하였습니다");
	}

}