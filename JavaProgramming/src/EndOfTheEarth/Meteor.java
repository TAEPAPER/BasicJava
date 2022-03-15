package EndOfTheEarth;

public class Meteor {
	String name;
	String size;
	int damage;


	void status() {
		
		System.out.println("크기: " + size);
		System.out.println("데미지 :" + damage);
		System.out.println("=================================");
	}
	public String toString() {
		return name;
	}
}
///////////////////////////////////////////////////////
class Meteor1 extends Meteor {
	Meteor1() {
		name = "데이오피아"; // 1987년 2월 28일 태정
		size = "0.5km";
		damage = 100;
	}
}

class Meteor2 extends Meteor {
	Meteor2() {
		name = "베르지니아";
		size = "0.6km";
		damage = 250;
	}
}

class Meteor3 extends Meteor {
	Meteor3() {
		name = "알케스테";
		size = "0.7km";
		damage = 350;
	}
}

class Meteor4 extends Meteor {
	Meteor4() {
		name = "프로메타리아";
		size = "0.8km";
		damage = 450;
	}
}

class Meteor5 extends Meteor {
	Meteor5() {
		name = "칼리스토"; //
		size = "1km";
		damage = 510;
	}
}