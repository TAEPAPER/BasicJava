package Chap04;

public class ReturnTest {

	public static void main(String[] args) {
	
		ReturnTest r = new ReturnTest(); //객체 생성 후 변수에 저장해줌
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5, result2);
		System.out.println(result2[0]);
		

	}
	int add(int a,int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {  //가로안에 것들은 매개변수야
		result[0] = a+b;
	}
	
}
