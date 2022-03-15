package Chap08;

public class HumanTester {

	public static void main(String[] args) {
		
		Human gildong = new Human("홍길동",155,60);
		Human chulsu = new Human("김철수",185,66);
		gildong.gainWeight(10);
		chulsu.reduceWeight(5);
		System.out.println("길동 몸무게:"+gildong.getWeight());
		System.out.println("철수 몸무게:"+chulsu.getWeight());
		
		
		

	}

}

class Human{
	
	private String name; //동일클래스
	private int height; 
	private int weight; 
	
	Human(String n, int h , int w){ //생성자
		name = n; 
		height = h;
		weight = w;
	}
	
	//메서드
	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gainWeight(int w) { //void는 리턴타입이 없다
		weight += w;
	}
	void reduceWeight(int w) {weight -= w;}
}
