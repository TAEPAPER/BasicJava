package e_oop.restaurant;

import java.util.Arrays;

public class Alba {
		//주문 받는 메써드 만들기 -- 사장님이 알바한테 일 시키기(파라미터 제공)
		//주문 받기 위해 필요한 것? 없음 (벽에 붙어있음)- 파라미터 필요없음
		//주문받은 후 보스에게 줄 것?return 타입은 주문서 --주문서라는 클래스 만들어서 하기(나중에)
	  String[] order() {
		  System.out.println("주문하시겠습니까?");
		  return new String[] {"짜장면","탕수육"};
				  
	  }
		//서빙하는 메서드
	  	//서빙하기위해 필요한것? 음식 
	  //서빙 후 보스에게 줄 것? 없음
	   void serving(String[] foods ) {
		   System.out.println(Arrays.toString(foods)+ "나왔습니다. 맛있게 드세요.");
	   }
	  
	  //계산하는 메서드
	  //계산하기 위해 필요한 것? 주문서 필요
	  //계산 후 보스에게 줄 것? 없음
	  void pay(String[] order) {
		  System.out.println("2만원입니다.안녕히가세요.");
	  }

} 