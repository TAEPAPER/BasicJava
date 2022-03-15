package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열 -여러개의 값을 하나의 변수에 저장해서 사용하는 것이다 참조형 타입이다 인덱스로 값을 구분한다 길이를 변경할 수 없다
		 */

		// 배열은 값을 여러개 묶어서 변수에 저장
		// 다른 곳에 저장해서 그 주소를 변수에 저장
		// 배열도 참조형 타입
		// 배열의 주소를 저장할 공간이 만들어진다 타입뒤에 []붙혀서 사용한다
		// array = new int[5]; //배열이 생성되고 그 주소가 저장된다. int 5개를 저장할 수 있는 공간
		// 기본값이 저장된다.--default값 즉, 0 5개가 만들어진 상태로 저장된다

		/*
		 * 변수 = 100번지(주소) --정확하게는 첫번째 값의 주소!
		 * 
		 * 100번지 {0,0,0,0,0}
		 *
		 *
		 */
		
	  
		int[]array = new int[] { 1, 2, 3, 4, 5 }; 
		// int[] array2 = {1,2,3,4,5};//반드시 선언과 초기화를 동시에 해줘야해

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		System.out.println(array); // 배열의 주소가 출력이 된다
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		for (int i = 0; i < array.length; i++) { // 배열.length 배열의 길이

			array[i] = (i + 1) * 10;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요
		int[] array3;
		array3 = new int[10];
		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println(Arrays.toString(array3));
		System.out.println();

		// 배열에 저장된 모든 값의 합계와 평균을 출력해주세요
		int sum = 0;
		for (int i = 0; i < array3.length; i++) {
			sum += array3[i];
		}

		double avr = (double) sum / array3.length; // 둘다 인트라서 소수점을 얻을 수 없으니까 둘 중하나는 형변환을 해줘야해
		System.out.println(sum);
		System.out.println(avr);

		// 문법을 안다는 전제하에 //문제에 대해서 해결방식을 생각해내는 것, 생각해낸것을 코드로 옮기는 두가지 프로세스;
		// 내 생각을 코드로 표현해 내는 것; 계속 반복; 답을 안보고 (백지로)반복해서 풀어보기;

		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int v_max = array3[0];
		int v_min = array3[0]; // 기준을 잡고 계속해서 비교하기

		for (int i = 0; i < array3.length; i++) {
			if (v_max < array3[i]) {
				v_max = array3[i];
			}
			if (v_min > array3[i]) {
				v_min = array3[i];
			}
		}
		System.out.println(v_max);
		System.out.println(v_min);

		// 최대값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다
		// 변수에 저장된 값과 배열의 모든 인덱스의 값을 비교하기 위한 for문을 만든다
		// 최소값이 저장된 변수와 배열의 값을 비교해서 더 작은 값을 찾으면 변수에 저장한다
		// 최대값이 저장된 변수와 배열의 값을 비교해서 더 큰 값을 찾으면 변수에 저장한다.

		// 내용을 잘 이해하고 백지로 써보기

		System.out.println("-----------------------------");
		
		int[] shuffle = new int[10];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		// 배열의 값을 섞어주세요.
		
		//[해결방법]
		// 랜덤한 인덱스와 0번 인덱스의 자리를 여러번 바꾼다
		// 랜덤한 수 9까지 낸다음 0번 째 인덱스의 값과 자리를 바꿔

		for (int i = 0; i < shuffle.length; i++) {
			int random = (int) (Math.random() * shuffle.length);
			int temp = shuffle[random];
			shuffle[random] = shuffle[0];
			shuffle[0] = temp;
		}
		System.out.println(Arrays.toString(shuffle));

		// 1~10 사이의 랜덤값을 500번 생성하고 , 각 숫자가 생성된 횟수를 출력해주세요.
		
		int[] counts = new int[10];  //배열로 묶어!!!  0이 10개가 배열로 저장된 상태
		
		for (int i = 0; i < 500; i++) {
			int ran = (int) (Math.random() * 10) + 1;
			for(int j=0; j<10; j++) {
			if (ran == j+1)
				++counts[j];
			//counts[ran-1]++;
			
	/*		
	 * 		if (ran ==1)
	 * 			++counts[0]
	 * 		if (ran == 2)
				++counts[1];
			if (ran == 3)
				++counts[2];
			if (ran == 4)
				++counts[3];
			if (ran == 5)
				++counts[4];
			if (ran == 6)
				++counts[5];
			if (ran == 7)
				++counts[6];
			if (ran == 8)
				++counts[7];
			if (ran == 9)
				++counts[8];
			if (ran == 10)
				++counts[9];*/
			
			
			
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(counts[i]);
		}
System.out.println(Arrays.toString(counts));




	}

}
