package Chap04;

class Data {int x;}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
		
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : x ="+ x); //기본형 매개변수는 변수에 저장된 값만 읽을수 있고 변경 불가능함
	}
}
