package d_array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
//		-석차 구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식  -점수 비교
//		-선택 정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
//		-버블 정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
//		-삽입 정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
//
		
		//석차를 저장할 배열 1을 다 저장해 for문을 두개 만들어서 전체를 다 비교해 비교를 하면서 더 작은 점수의 등수를 증가시켜
//		int[] arr = new int[10];
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//				}
//	System.out.println(Arrays.toString(arr));
//		
//		//석차 구하기
//	int[] rank = new int[arr.length];
//	for(int i = 0; i<rank.length; i++) {
//		rank[i]=1;   //등수
//	}
//	
//	for(int i = 0; i< arr.length; i++) {    //i가 기준;
//		for(int j =0; j<arr.length; j++) {
//		if(arr[i]<arr[j]) {
//			rank[i]++;
//			}
//		}
//	}
//		
//		System.out.println(Arrays.toString(rank));
//		System.out.println("-------------------");
		
		//선택정렬 -가장 작은 숫자를  찾고 맨앞로 보내 0번인덱스로 가고 0번에 있던 것들은  -- 위에서 만들었던 배열을 정렬해준다(최솟값)/	
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
				}
	System.out.println(Arrays.toString(arr));	
	 //arr배열 생성 //tip 최솟값을 찾는데 최소값의 위치가 어딘가(인덱스)를 찾고 첫번째로 옮기기

	//최소값 위치 찾기
//for(int i=0; i<arr.length -1; i++) {      //불필요한 비교를 하지 않겠다는 (-1)  
//	int min =i;
//	for(int j = i+1; j<arr.length; j++) { //i가 0이면 1부터 비교하면 되니까 (+1)
//		if(arr[j] <arr[min]) {
//			min = j;
//			}//최소값 위치 찾기
//		}
//		int temp = arr[i];
//		arr[i] = arr[min];
//		arr[min] = temp; //자리 바꾸기
		
//	}
		
//	System.out.println(Arrays.toString(arr));
		
	//버블정렬 두개씩 비교해서 더 큰 숫자를 뒤로 보내기 결국 큰 수가 맨 뒤로 가기 
	
//	for(int i =0; i<arr.length; i++) {
//		int max =i;
//		for(int j= i+1; j<arr.length; j++) {
//			if(arr[j]<arr[max]) {
//				max =j;
//			}
//		}
//		
//		int temp = arr[i];
//		arr[i] = arr[max];
//		arr[max] = temp;
//		
//	}
//	System.out.println(Arrays.toString(arr));
		
//버블정렬 
	
	for(int i =0; i<arr.length-1; i++) {
		boolean flag =false;
		for(int j=0; j<arr.length -i -1; j++) {   //마지막것은 비교할 필요가 없기 때문에 -1을 해줌, 줄어들게 하기위해 i를 빼준다( i는 증가하기 때문에)
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =temp;
				flag = true;
			}
		}if(!flag) {
			break;
		}
	}
	System.out.println(Arrays.toString(arr));	
	
	
	
	
	for(int i =0; i<arr.length; i++) {
		for(int j=1; j<arr.length-i; j++) {
			if(arr[j-1]>arr[j]) {
				int temp =0;
				temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]= temp;	
			}	
		}
	}
	
	System.out.println(Arrays.toString(arr));
//12/23/34/45/56/78/89
//12/23/34/45/56/78/
//12/23/34/45/56
		
	//삽입정렬 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수를 뒤로 밀고 중간에 밀어! 크면 뒤에 넣고 작은면 빈칸에 넣는다
	//작은 걸 따로 변수에 저장해놓고 그 앞에 있는거랑 비교해    //https://st-lab.tistory.com/179 (삽입정렬 그림설명)
	

	
	for(int i=1; i<arr.length; i++) {
		int temp = arr[i];
		int j=0;
		for( j= i-1; j>=0;j--) {
			if(temp<arr[j]) {
				arr[j+1]=arr[j]; 
				
			}else {
				break; //break;로 for문을 빠져나온다
			}
		}
		arr[j+1] = temp;  //여기서도 j를 사용해야하니까 위에서 선언해줌
		
	}
		
	
	System.out.println(Arrays.toString(arr));
	
	Arrays.sort(arr);
	 	
		
		
		
		
		
	}

}
