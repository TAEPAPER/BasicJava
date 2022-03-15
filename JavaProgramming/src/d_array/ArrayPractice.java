package d_array;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		String[] names = { "강동주", "강정인", "강현수", "곽성상", "김기웅", "김민지", "김형돈", "노혜지", "박태정", "서난희", "예현의", "오지현", "오혜지",
				"유정민", "이병진", "이수민", "이슬기", "이유정", "이의찬", "이정규", "이종민", "장문석", "정다영", "최민규", "최혁진" };
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };

//각 학생들의 과목들 점수 배열 만들기
		int[][] score = new int[names.length][subjects.length];
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}

//각 학생들의 7과목 점수들의 합계와 평균
		int[] p_subsum = new int[names.length];
		double[]p_subavg = new double[names.length];
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<subjects.length; j++) {
				     p_subsum[i] += score[i][j];
			}
			p_subavg[i] = Math.round((double)p_subsum[i]/subjects.length*100)/100.0;	
		}
		System.out.println(Arrays.toString(p_subsum));
		System.out.println(Arrays.toString(p_subavg));
		
//과목별 합계와 평균
	int[] subsum = new int[subjects.length];
	double[] subavg = new double[subjects.length];
	for(int i =0; i<subjects.length; i++) {
		for (int j=0; j<score.length; j++) {
			subsum[i] += score[j][i];
		}
		subavg[i] = Math.round((double)subsum[i]/score.length * 100)/100.0;
	}
	System.out.println(Arrays.toString(subsum));
	System.out.println(Arrays.toString(subavg));
		
		
		

//각 학생들의 석차
		int[] rank = new int[names.length];
		for(int i=0; i<p_subsum.length; i++) {
			rank[i] = 1;
			for(int j=0; j<p_subsum.length; j++) {
				if(p_subsum[i]<p_subsum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		
		
		
		System.out.print("이름");
		

		
	}

}
