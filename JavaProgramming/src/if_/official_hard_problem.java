package if_;

public class official_hard_problem {

	public static void main(String[] args) {
		//1_100사이의 랜덤한 수를 세개 발생시키고 오름차순으로 출력해주세요. Math.random();
		
	// 값을 발생시키는 방법  : Math.random() - 0.0~ 1.0 미만
//				int random = (int)(Math.random()*100)+1; //1~100사이를 원할 때 --random 해서 0.0 나오면 최종적으로 0이 나올 수 있으니까 +1을 해줘서 1~  가능하게해준다
//				System.out.println(random); //자주 사용할 것
//				
//		int ran1 =(int)(Math.random()*100)+1;
//		int ran2 =(int)(Math.random()*100)+1;
//		int ran3 =(int)(Math.random()*100)+1;
//		int temp;
	
		
		//3개의 정수값을 오름차순으로 정렬
		
		int ran1 = (int)(Math.random()*100)+1;
		int ran2 = (int)(Math.random()*100)+1;
		int ran3 = (int)(Math.random()*100)+1;
		int temp;

		if (ran1>ran2) {
			temp = ran1;
			ran1 = ran2;
			ran2 = temp;
		}
		
		if (ran2>ran3) {
			temp = ran2;
			ran2 = ran3;
			ran3 = temp;
		}
		
		if (ran1>ran3) {
			temp = ran1;
			ran1 = ran3;
			ran3 = temp;
		}
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		
		
		
	 
	}

}
