package EndOfTheEarth;

import java.util.Random;

public class Avengers {
	String name;
	String skill;
	int damage;
	
	
	void att(Meteor m, int Dsum) {
		System.out.println();
		System.out.println(name + "가 \""+ skill+ "\" 을 사용했습니다");
		System.out.println();
		damage += damage;
	if (Dsum >=m.damage) {
		System.out.println( "어벤져스가 " + m.name +"을 \"전부\" 파괴했습니다");
		System.out.println("=================================");
		System.out.println();
	} else {
		System.out.println("어벤져스가 " +m.name +"을 \"일부분\" 파괴했습니다");	
		System.out.println("=================================");
		System.out.println();
		}
	}
	void status(){
		System.out.println("============= 정보 ===============");
		System.out.println("이름 : " + name);
		System.out.println("스킬 :" +skill);
		System.out.println("데미지:" +damage);
		System.out.println("=================================");
	}
	public String toString() {
		return name;
	}
}
		/////    자식 클래스  /////

class DrStrange extends Avengers {
	DrStrange() {
		name = "۞ 닥터스트레인지 ۞";
		skill = "타임스톤으로 운석 속력 0.5배하기";
		damage = 200;
	}
}
class CapA extends Avengers {
	CapA() {
		name = "⍟ 캡틴아메리카 ⍟";
		skill = "어벤져스 어셈블!";
		damage = 50;
	}
}
class IronMan extends Avengers {
	IronMan() {
		name = "⎊ 아이언맨 ⎊";
		skill = "아이언슈트로 미사일 날리기";
		damage = 150;
	}	
}
class Hulk extends Avengers {
	Hulk() {
		name = " ✇ 헐크 ✇";
		skill = "날아서 운석 공격";
		damage = 100;
	}
}
class Thor extends Avengers {
	Thor() {
		name = " ϟ  토르  ϟ ";
		skill = "묠니르 타고 날아서  ϟ 번개공격";
		damage = 150;
	}		
}
class HawkEye extends Avengers {
	HawkEye() {
		name = "➳ 호크아이 ➳";
		skill = "멀티 보우 ➳";
		damage = 50;
	}
}
class Wanda extends Avengers {
	Wanda() {
		name = "ᗢ 완다 ᗢ";
		skill = "염동력";
		damage = 70;
	}
}
class AntMan extends Avengers {
	AntMan() {
		name = " ‎꘩ 앤트맨 ‎꘩ ";
		skill = "운석 0.8배로 줄이기";
		damage = 50;
	}
}
class KindNeighborhood extends Avengers {
	KindNeighborhood() {
		name = "🕸️ 친절한 이웃 스파이더맨 🕸️";
		skill = "거미줄로 시민들 구하기";
		damage = 10;
	}
	@Override
	void att(Meteor m, int Dsum) {
		
		System.out.println(name + "이 \"" + this.skill + "\" 을 사용했습니다");
		System.out.println();
		damage += damage;
		System.out.println(name + "이 시민들을 구했습니다");
		System.out.println();
		if (Dsum >=m.damage) {
			System.out.println( "어벤져스가 " +m.name+ "을 \"전부\" 파괴했습니다");
			System.out.println("=================================");
		} else {
			System.out.println("어벤져스가 " + m.name+ "을\"일부분\" 파괴했습니다");	
			System.out.println("=================================");
		}
	}
}
class Falcon extends Avengers {
	Falcon() {
		name = "⩔ 팔콘 ⩔ ";
		skill = "워머신으로 공격";
		damage = 20;
	}	
}
