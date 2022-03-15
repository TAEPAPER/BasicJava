package f_game;

public class Monster {
	String name;
	int maxHp ;
	int maxMp;
	int hp;
	int mp;
	int att;
	int def;
	int level;
	int exp;
	Item[] items; 
	
	Monster(String name , int hp, int mp, int att, int def,int level,int exp, Item[] items){
		this.name = name;
		this.maxHp =hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att  = att;
		this.def = def;
		this.level = level;
		this.exp = exp;
		this.items = items;  //생성자를 통해서 초기화함	
	}
	
	void attack(Character c) {
		int damage = att - c.def;
		damage = damage <= 0? 1: damage; //최소한 1이라도 데미지를 주게 됨
		c.hp -= damage <= c.hp? damage : c.hp; 
		System.out.println(name + "가 공격으로"+ c.name +"에게"+damage +"만큼 데미지를 주었습니다.");
		System.out.println(c.name +"의 남은 체력: "+ c.hp);  //한번에 바꾸기 : ctrl + 1;
	}	
	
	//아이템 드랍 메서드
	Item itemDrop() {
		return items[(int)(Math.random()* items.length)]; //인덱스를 랜덤으로 결정 ! 
	}
	
	
	
}
