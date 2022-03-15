package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * 다차원배열 
		 * -배열안에 배열이 저장되어 있는 형태이다
		 */		
		
		//2차원 배열 
		int[][] array2;
		
		//3차원 배열
		int[][][] array3;
		
		int[][] arr = new int[2][3];
		
//		변수 = 100번지 (주소)
		
//				100번지
//				{200번지, 300번지}
//		  		
//				200번지
//		  		{0,0,0}
//		  		
//		  		300번지
//		  		{0,0,0}
//		
		int arr2[][] = new int[][] {{1,2,3},{4,5,6}};
		int[] arr3[] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][]arr4 = new int[3][]; //가변 배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];   
		
		
		
//		arr[0] = 10; 값을 저장할 수 없음 
		
		arr[0] = new int[5]; //1차원은 배열을 저장하는 곳이다
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr[0][1]);  
		
		System.out.println(arr.length);  //1차원의 길이
		System.out.println(arr[0].length); //2차원의 길이
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//				System.out.println(i+","+j+":"+arr[i][j]);
//				
//			}
//		}
//		

		
		int[][] scores = new int[3][5];         //int[학생수][과목수]
 		int[] sum = new int[scores.length];        //각 학생의 합계와
		double[] avg =  new double[scores.length]; //각학생의 평균
		
		//0-100점 사이

		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<scores.length;i++) {
			for(int j =0; j<scores[i].length; j++) {
				int ran_score = (int)(Math.random()*100);
				scores[i][j] = ran_score;	
			}		
		}
		for( int i =0; i< sum.length; i++) {
			for(int j =0; j<scores.length; j++) {
				sum[i] += scores[i][j];
				
					}
				}
		
		System.out.println(Arrays.toString(sum));
		
		
		for( int i =0; i< sum.length; i++) {
			avg[i] = (double)sum[i]/sum.length;
   }
			
				System.out.println(Arrays.toString(avg));
		
		//avg[i] = (double)sum[i] /scores[i].length;
//				System.out.println("합계: " + sum[i] + "/평균:" +avg[i]);
				
				
				
				
				
				
				
				
				
				
	}			
}