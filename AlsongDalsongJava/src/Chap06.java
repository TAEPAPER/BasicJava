
public class Chap06 {

	public static void main(String[] args) {
	
		Tv[] tvArr = new Tv[3];  //참조변수 배열(객체 배열)을 생성
		for(int i = 0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		for(int i = 0; i<tvArr.length; i++) {
			tvArr[i].channelUp(); //매써드 호출
			System.out.printf("tvArr[%d].channel = %d%n" ,i,tvArr[i].channel);
			
		}
		
		
		
		System.out.println("Card.width ="+ Card.width);
		System.out.println("Card.height=" + Card.height);
		
		Card c1 = new Card(); //참조변수 생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		System.out.println("c1은"+c1.kind+ "" + c2.number+"");
		
		
	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class Card{
	String kind;
	int number;
	static int width =100;
	static int height = 250;
}

