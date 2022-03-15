package d_array;

import java.util.Arrays;


public class Score {

	public static void main(String[] args) {

//		-우리반 모두의 국어,영어,수학,사회,과학,oracle,java 점수를 0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요
//		
//		이름    국어     영어   수학  사회  과학      oracle  java     합계     평균       석차
//		홍길동   90     90    90     90     90     90      90       630      90.00      1
//		홍길동   90     90    90     90     90     90      90       630      90.00      1
//		홍길동   90     90    90     90     90     90      90       630      90.00      1
//		홍길동   90     90    90     90     90     90      90       630      90.00      1
//		홍길동   90     90    90     90     90     90      90       630      90.00      1
//	    과목합계 450    450    450   450    450    450      450      450 
//	    과목평균 90.00   90.00  90.00  90.00  90.00   90.00   90.00   
//	
		// 7과목의 점수를 랜덤으로 발생 0~100사이의 랜덤한 점수
		

		String[] students = { "강동주", "강정인", "강현수", "곽성상", "김기웅", "김민지",
				              "김형돈", "노혜지", "박태정", "서난희", "예현의", "오지현", "오혜지",
				             "유정민", "이병진", "이수민", "이슬기", "이유정", "이의찬", "이정규", "이종민", "장문석", "정다영", "최민규", "최혁진" };
		
		String[] name  = new String[] {"이름","국어","영어","수학","사회","과학","Oracle","Java","합계","평균","석차"};
		
		
		
		// 각 학생의 각 과목(7개의) 랜덤 함수 배열
		int[][] arr = new int[25][7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int ran_score = (int) (Math.random() * 100);
				arr[i][j] = ran_score;
				
			}
		}
		// 각 학생의 합계 배열
		int[] personal_sum = new int[25];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				personal_sum[i] += arr[i][j];
			}
		}
		System.out.println("각학생의 합계 배열 : "+ Arrays.toString(personal_sum));

		// 각 학생의 평균 배열
		double[] avg = new double[25];
		for (int i = 0; i < personal_sum.length; i++) {
			avg[i] = personal_sum[i] / arr[i].length;
		}

		System.out.println("각 학생의 평균 배열:" + Arrays.toString(avg));

		// 석차 구하기
		int[] rank = new int[25];
			
		for (int i = 0; i < personal_sum.length; i++) {
			for (int j = 0; j < personal_sum.length; j++) {
				if (personal_sum[i] < personal_sum[j]) {
					rank[j]++;
				}
			}
		}
		System.out.println("각 학생의 석차 배열:"+Arrays.toString(rank));
		
		// 각과목의 합계 구하기
		int[] subject_sum = new int[7];
		for (int i = 0; i < subject_sum.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				subject_sum[i] += arr[j][i];
			}
		}
		System.out.println("각 과목의 합계 배열:"+Arrays.toString(subject_sum));
		
		// 각 과목의 평균
		double[] subject_avg = new double[7];
		for (int i = 0; i < subject_sum.length; i++) {
			subject_avg[i] = subject_sum[i] / subject_avg.length;
		}
		System.out.println("각 과목의 평균 배열:"+Arrays.toString(subject_avg));
		
		
	
			for(int i =0; i<name.length;i++) {
			System.out.print(name[i]+"\t");
	}
			System.out.println();
		
			for(int i =0; i<arr.length; i++) {
				System.out.print(students[i]+"\t");
			for(int j =0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}
		
		
		
	}

}
