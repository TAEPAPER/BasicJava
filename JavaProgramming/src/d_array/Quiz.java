package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
//		System.out.println("거스름돈 :" +money);
		
//		-거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요
//		
//		예)
//		거스름돈 : 2860원
		
//		500원: 5개
//		100원 : 3개
//		50원 :1개
//		10원 : 1개
		

//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500,100,50,10};
//		int count =0;
//		money/coin[0] 나누면 500의 갯수
//		money%coin[0] 나눈값의 나머지가 100원의 갯수
// 		money/coin[2] 몫이 50원의 갯수
//		money%coin[2]	 나머지가 10원의 갯수
		
		
//		for(int i =0; i<coin.length; i++) {
//			coin[i]=money/coin[i]; 
//			money = coin[i];
//			coin[i+1]=money%coin[i];
//		}
//		
//		
//		for(int i =0; i<coin.length; i++) {
//			System.out.println(coin[i]+"원:"+money/coin[i]+"개");
//			money %= coin[i];
//		}
//		System.out.println("거스름돈 :" +money);
		
		
		
		// 문제 1~5사이의 숫자가 발생된 횟수 만큼 *을 사용해 그래프를 그려주세요

//		int[] num_count = new int[5];
//		
//		for(int i=0; i<num_count.length; i++) { //5번돌고 
//			for(int j=0; j<arr.length; j++) {   //20번 돌고
//				if(arr[i] == arr[j]) {
//					num_count[i]++;
//					
//					
//				}
//						
//			}
//			
//		}
//		
		
//		int[] arr= new int[20];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*5)+1;}
//		
//		
//System.out.println(Arrays.toString(arr));
//		
//		int[] count = new int[5];
//		for(int i =0; i<arr.length; i++) {
//			count[arr[i]-1]++;
//		}
//		
//		for( int i =0; i<count.length; i++) {
//			System.out.println(i+1+":");
//			for(int j =0; j< count[i]; j++) {
//				System.out.println("*");
//			}
//			System.out.println(" " + count[i]);
//		}
//	System.out.println(Arrays.toString(count));
//	
	
		// 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요 //값이 들어있는 순서를 변경하면안된다// 때로는
				// 발생되지 않은 수가 있을 수 있다
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

		
	int[] temp = new int[5];
	int count = 0; //현재 몇개 저장했는가   //배열에 저장된 것과 temp와 비교 .. 같은 값이 없을 때 temp에 추가
	for (int i = 0; i < arr.length; i++) {    
		boolean flag = true;
		for(int j = 0; j<temp.length; j++) {
			if(arr[i]== temp[j]) {
				flag = false;
				
			}
		}
	
		if(flag) {
			temp[count++] = arr[i];
		}
	}

	System.out.println(Arrays.toString(temp));
	
	//0이 있으니까 없애고 싶어 배열을 새로 만들거야
	
	int[] result = new int[count];
	for(int i =0; i<result.length; i++) {
		result[i]  = temp[i];
	}
System.out.println(Arrays.toString(result));
	
		
		
		
		
		
		
	
	
	
	
	}

}
