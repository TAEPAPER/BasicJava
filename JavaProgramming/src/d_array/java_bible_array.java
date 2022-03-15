package d_array;

import java.util.Arrays;

public class java_bible_array {

	public static void main(String[] args) {
//		
//		int arr[] = {10,20,30,40,50};
//		int sum =0;
//		for( int i =0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(sum);

		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float) total / (arr[0].length + arr[1].length + arr[2].length + arr[3].length);
		System.out.println(total);
		System.out.println(average);

		
		
		
		
		
		
		
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, 
						{ '*', '*', ' ', ' ', ' ' }, 
						{ '*', '*', '*', '*', '*' },
						{ '*', '*', '*', '*', '*' } };

		char[][] result = new char[star[0].length][star.length];

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

//		for (int i = 0; i < star[i].length; i++) {
//			for (int j = 0; j < star.length; j++) {
//				result[i][j] = star[j][i];
//				if (result[i][j] == ' ') {
//					result[i][j] = '*';
//				}else {
//					result[i][j] = ' ';
//				}
//			}
//		}
		for (int i = 0; i < star[0].length; i++) {
			for (int j = 0; j < star.length; j++) {
				result[i][j] = star[j][i];
			}

		}
//		for (int i = 2; i < star[i].length; i++) {
//			for (int j = 0; j < star.length; j++) {
//				result[i][j] = star[j][i];
//				if (result[i][j] == ' ') {
//					result[i][j] = '*';
//				} else {
//					result[i][j] = ' ';
//				}
//			}
//		}

	
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
	}
}