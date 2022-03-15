package EndOfTheEarth;

import java.util.Arrays;
import java.util.Random;

import e_oop.ScanUtil;

public class GameControl {

	public static void main(String[] args) {
	
	new GameControl().start();
	}

	void start() {
		Avengers[] ag = new Avengers[] {   //Avengers 타입으로 배열 생성 
				new DrStrange(), new CapA(), new IronMan(), new Hulk(), new Thor(),
				new HawkEye(), new Wanda(), new AntMan(), new KindNeighborhood(), new Falcon()
				};
		Meteor[] m = new Meteor[] {     //Metoer 타입으로 배열 생성
				new Meteor1(), new Meteor2(), new Meteor3(), new Meteor4(), new Meteor5()
				};
		int num[] = new int[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			num[i] = r.nextInt(10);         //히어로 뽑을 시 중복되는 값 나오지 않게하기
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		
		Thread randh= new RandomThread();
		
										//게임 출력
		System.out.println("☄운석이 다가오고 있습니다!\n마블 히어로를 이용해 지구를 지키는 게임입니다");
		System.out.println();
		int Dsum =0;
		for (int i = 0, j = 5; i < 5; i++, j--) {
			System.out.println("히어로를 뽑아주세요! :Enter /"  + "남은 기회 : " + j + "번");
			String hEnt = ScanUtil.nextLine();		
			if(hEnt.equals(null))continue;
			randh.run();
			System.out.println();
			System.out.println(ag[num[i]] + "가 나왔습니다");
			ag[num[i]].status();
			Dsum += ag[num[i]].damage;                            //히어로 데미지 누적 값
			System.out.println("Ⓐ현재 어벤져스 총 데미지: "+ Dsum);
			System.out.println();
			System.out.println("1.게임 계속 진행  2.종료");
			int hEnt2 = ScanUtil.nextInt();
			if(hEnt2==1) {
			System.out.println("=================================");
			System.out.println("☄운석 " + m[i] + "가 다가오고 있습니다");
			m[i].status();
			System.out.println();                               
		    System.out.println("1.히어로 스킬 발동  2.종료");
			int input = ScanUtil.nextInt();
			switch(input) {
			case 1 : ag[num[i]].att(m[i], Dsum); break;         //누적 값보다 운석의 힘이 크면 운석 일부부만 파괴
			case 2 : System.exit(0); break;	
			}			
		}else System.exit(0);

	}
		if(Dsum < 510) {                 //가장 마지막 운석의 데미지와 히어로 누적 데미지를 비교              
			System.out.println();
			System.out.println("운석 충돌로 인해 지구가 멸망했습니다");      
		}else if(Dsum >= 510) {
			System.out.println();
			System.out.println("Ⓐ 어벤져스가 지구를 지켰습니다!!");
		}
		
		
}
}