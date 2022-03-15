package Chap04;

class MyMath2{
	long a;
	long b;
	
	long add() {return a+b;}
	long substract() {return a-b;}
	long multiply() {
		return a*b;}
	double divide() {return a/b;}
	
	//인스턴스와 관계없이 매개변수만으로 작업이 가능
	static long add(long a, long b) {return a+b;}
	static long substract(long a, long b) {return a-b;}
	static double multiply(double a, double b) {return a*b;}
	static double divide(double a, double b) {return a/b; }
	}
	
public class MyMathTest2 {

	public static void main(String[] args) {
		
		//클래스 메서드 호출 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200l, 100l));
		System.out.println(MyMath2.substract(200l, 100l));
		System.out.println(MyMath2.multiply(200l,100l ));
		System.out.println(MyMath2.divide(100l, 200l));
		
		//인스턴스 생성
		MyMath2 my = new MyMath2();
			my.a = 200l; my.b =100l;
			System.out.println(my.add());
			System.out.println(my.substract());
			System.out.println(my.divide());
			System.out.println(my.multiply());
			
			
			
			
	}

}
