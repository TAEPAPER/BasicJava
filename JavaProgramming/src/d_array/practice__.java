package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class practice__ {

	public static void main(String[] args) {

//		int[] shuffle = new int[10];
//		for (int i = 0; i < shuffle.length; i++) {
//			shuffle[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(shuffle));
//		
//		//	Q)배열의 값을 섞어주세요.
//		
//		//[gor 랜덤한 인덱스와 0번 인덱스의 자리를 여러번 바꾼다
//		// 랜덤한 수 9까지 낸다음 0번 째 인덱스의 값과 자리를 바꿔
//		
//		for(int i =0; i<shuffle.length; i++) {
//			int random = (int)(Math.random()*shuffle.length);  //0-9까지의 숫자
//			int temp = shuffle[random];
//			shuffle[random] = shuffle[0];
//			shuffle[0]= temp; //random은 array가 아니였어!!!!!!
//		}
		// System.out.println(Arrays.toString(shuffle));

		// Q)1~10 사이의 랜덤값을 500번 생성하고 , 각 숫자가 생성된 횟수를 출력해주세요.

		// 랜덤값을 500번 생성하기

//		int[] counts;
//		counts = new int[10];  ///ex)counts[0] 은 숫자 1의 생성된 횟수
//		
//		for(int i=0; i<500; i++) {
//			int random = (int)(Math.random()*10)+1;
//			for(int j=0; j<10; j++) {
//				if(random == j+1) 
//					++counts[j];
//			}
//		}
		// System.out.println(Arrays.toString(counts));

//		int[] array1 = new int[5];
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = (i + 1) * 10;
//		}
//		System.out.println(Arrays.toString(array1));
//
//		int[] array2 = new int[10];
//		for (int i = 0; i < array2.length; i++) {
//			array2[i] = (int) (Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(array2));
//		Arrays.sort(array2);
//		System.out.println(Arrays.toString(array2));
//
//		int sum = 0;
//		double average = 0;
//		for (int i = 0; i < array2.length; i++) {
//			sum += array2[i];
//			average = (double) sum / array2.length;
//		}
//		System.out.println(sum);
//		System.out.println(average);
//
//		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요 (array2의)
//		int min = array2[0];
//		for (int i = 0; i < array2.length; i++) {
//			if (min > array2[i]) {
//				min = array2[i];
//			}
//		}
//		System.out.println(min);

		// 최대값
//		int max = array2[0];
//		for (int i = 0; i < array2.length; i++) {
//			if (max < array2[i]) {
//				max = array2[i];
//			}
//		}
//		System.out.println(max);
//		// 배열의 값을 섞어주세요 --- 0부터 9까지
//
//		int[] shuffle = new int[10];
//		for (int i = 0; i < shuffle.length; i++) {
//			shuffle[i] = i + 1;
//		} // 1부터 9까지의 수를 담은 배열 shuffle 완성
//		System.out.println(Arrays.toString(shuffle));
//
//		for (int i = 0; i < shuffle.length; i++) {
//			int random = (int) (Math.random() * shuffle.length);//
//			int temp = shuffle[random];
//			shuffle[random] = shuffle[0];
//			shuffle[0] = temp;
//		}
//		System.out.println(Arrays.toString(shuffle));
//
//		// 1~10 사이의 랜덤값을 500번 생성하고 , 각 숫자가 생성된 횟수를 출력해주세요
//		int[] counts = new int[10];
//		for (int i = 0; i < 500; i++) {
//			int random2 = (int) (Math.random() * 10) + 1;
//			if (random2 == 1)
//				counts[0]++;
//			if (random2 == 2)
//				counts[1]++;
//			if (random2 == 3)
//				counts[2]++;
//			if (random2 == 4)
//				counts[3]++;
//			if (random2 == 5)
//				counts[4]++;
//			if (random2 == 6)
//				counts[5]++;
//			if (random2 == 7)
//				counts[6]++;
//			if (random2 == 8)
//				counts[7]++;
//			if (random2 == 9)
//				counts[8]++;
//			if (random2 == 10)
//				counts[9]++;
//
//		}
//		System.out.println(Arrays.toString(counts));
//
//		for (int i = 0; i < 500; i++) {
//			int random2 = (int) (Math.random() * 10) + 1;
//			for (int j = 0; j < counts.length; j++) {
//				if (random2 == j + 1) {
//					counts[j]++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(counts));
		
		String[] studs = {"강동주","강정인","강현수","곽성상","김기웅","김민지","김형돈","노혜지","박태정","서난희","예현의","오지현","오혜지","유정민","이병진",
				"이수민","이슬기","이유정","이의찬","이정규","이종민","장문석","정다영","최민규","최혁진"};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("몇명을 뽑으시겠습니까?");
		int count = Integer.parseInt(sc.nextLine());
		String[] pick = new String[count]; //뽑는 사람의 수 만큼의 갯수의 배열이 만들어진다
		int pick_count = 0; //지금까지 몇명 뽑혔는지
		do {
			int random = (int)(Math.random()*studs.length);
			boolean flag = true;
			for(int i =0; i<pick.length; i++) {
				if(studs[random].equals(pick[i])) {
					flag = false;
				}
			}
			if (flag) {
				pick[pick_count++] = studs[random];
			}			
		}while(pick_count < count);
		
		System.out.println(Arrays.toString(pick));
		
//		for(int i =0; i<shuffle.length; i++) {
//			int ra25ndom = (int)(Math.random()*shuffle.length);  //0-9까지의 숫자
//			int temp = shuffle[random];
//			shuffle[random] = shuffle[0];
//			shuffle[0]= temp; //random은 array가 아니였어!!!!!!
		
		
		
		
		

	}

}
