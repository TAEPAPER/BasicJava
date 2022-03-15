package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomStudent {

	public static void main(String[] args) {
		//25칸 짜리 문자열을 저장할 수 있는 배열을 만든 후 이름을 저장한다
		//그 중에 랜덤으로 몇명을 뽑아 . 몇 명을 뽑을 지는 사용자에게 입력을 받아//중복이 되면 안된다!!
		
		
		//25명의 사람을 섞어 (shuffle 해서 앞에서 부터 몇명을 뽑아) //이미 뽑은 사람과 다음에 뽑은 사람을 비교하기 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		String[] students ={"강동주","강정인","강현수","곽성상","김기웅","김민지","김형돈","노혜지","박태정","서난희","예현의","오지현","오혜지","유정민","이병진",
				"이수민","이슬기","이유정","이의찬","이정규","이종민","장문석","정다영","최민규","최혁진"}; 
		Scanner s = new Scanner(System.in);
		System.out.println("몇명?");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0; //지금까지 몇명 뽑혔는지
		do {
			int random = (int)(Math.random()*students.length);
			boolean flag = true;
			for(int i = 0; i<pick.length; i++) {
				if(students[random].equals(pick[i])) {
					flag = false;
					
				}
			}
			if(flag) {  //true 일 때 랜덤으로 뽑은 사람을 추가해줌
				pick[pickCount++] = students[random];			}
		}while(pickCount <count);
		
		
		System.out.println(Arrays.toString(pick));
		
		
			
					

		
			
			
			
	
		
		
		
	
		
		
		


	}

}
