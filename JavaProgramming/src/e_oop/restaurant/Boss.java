package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba();// 객체생성후 변수에 저장
		
		String[] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는 중... 완성!!");
		String[] foods = {"완성된 짜장면","완성된 탕수육"};
		
		alba.serving(foods);
		
		alba.pay(order);
	}
	
	
	

}
