package f_game;

public class Character {

	String name;
	int maxHp ;
	int maxMp;
	int hp;
	int mp;
	int att;
	int def;
	int level;
	int exp;
	Item[] items; //보유아이템 //몬스터 사냥할 때 얻은 전리품
	//게임내에 캐릭터 여러개 존재 (직업마다 능력치가 달라야함)
	
	
	Character(String name, int hp, int mp,  int att, int def){
		this.name = name;
		this.maxHp =hp;                  //생성자
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att  = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];	
	}
	
	void status(){
		System.out.println("=========== 상태 =============");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level+"("+exp+"/100)");  //최대값은 100
		System.out.println("체력 : "+ hp +"/"+maxHp);
		System.out.println("마나 : "+mp +"/"+maxMp);
		System.out.println("공격력: "+ att);
		System.out.println("방어력: "+ def);
		System.out.println("============= 아이템 ===============");
		for(int i =0; i<items.length; i++) {
			if(items[i] != null) {
				System.out.println(items[i]);
			}
		}
		System.out.println("====================================");
		
	}
	
	void attack(Monster m) {
		int damage = att - m.def;
		damage = damage <= 0? 1: damage; //최소한 1이라도 데미지를 주게 됨
		m.hp -= damage <= m.hp? damage : m.hp; 
		System.out.println(name + "가 공격으로"+ m.name +"에게"+damage +"만큼 데미지를 주었습니다.");
		System.out.println(m.name +"의 남은 체력: "+ m.hp);
		
	}
	
	void getExp(int exp) { //몬스터에 따라서 얻는 경험치가 달라야하니까 외부에서 파라미터를 받음
		this.exp += exp;
		System.out.println(exp + "의 경험치를 획득하였습니다");
		while(100<= this.exp) {
			levelUp();
			this.exp -=100;
				
		}
	}
	
	void levelUp() {
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("레벨업!");
	}
	void getItem(Item item) {
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i<items.length; i++) {
			if(items[i]== null) {
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def; //아이템을 가지고만 있어도 능력치가 증가되는!!	
	}
	
	
	
}
