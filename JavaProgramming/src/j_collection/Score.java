package j_collection;

import java.util.ArrayList;
import java.util.Random;

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

		String[] name2 = { "강동주", "강정인", "강현수", "곽성상", "김기웅", "김민지", "김형돈", "노혜지", "박태정", "서난희", "예현의", "오지현", "오혜지",
				"유정민", "이병진", "이수민", "이슬기", "이유정", "이의찬", "이정규", "이종민", "장문석", "정다영", "최민규", "최혁진" };

		Random r = new Random();
		// 학생 개개인의 점수 정보
		ArrayList<ArrayList<Integer>> score = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 25; i++) {
			list = new ArrayList<Integer>();
			for (int j = 0; j < 7; j++) {
				list.add(r.nextInt(100) + 1);
			}
			score.add(list);
		}
		System.out.println(score);

//		학생 개개인의 과목의 합계와 평균
		ArrayList<Integer> psum = new ArrayList<Integer>();
		ArrayList<Double> pavg = new ArrayList<Double>();
		for (int i = 0; i < score.size(); i++) {
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < score.get(i).size(); j++) {
				sum += score.get(i).get(j);
			}
			psum.add(sum);
			avg = Math.round((double) sum / score.get(i).size() * 100) / 100.0;
			pavg.add(avg);
		}
		System.out.println(psum);
		System.out.println(pavg);

		// 석차 구하기 //과목 합계를 이용해서
		ArrayList<Integer> rank = new ArrayList<Integer>();
		for (int i = 0; i < psum.size(); i++) {
			rank.add(i, 1);
			int c_rank = 1;
			for (int j = 0; j < psum.size(); j++) {
				if (psum.get(i) < psum.get(j)) {
					c_rank++;
					rank.set(i, c_rank);
				}
			}
		}
		System.out.println(rank);

		// 과목 합계와 평균;
		ArrayList<Integer> Ssum = new ArrayList<Integer>();
		ArrayList<Double> Savg = new ArrayList<Double>();
		for (int i = 0; i < score.get(i).size(); i++) {
			int sum = 0;
			for (int j = 0; j < score.size(); j++) {
				sum += score.get(j).get(i);
			}
			Ssum.add(i, sum);
			Savg.add(i, Math.round((double) sum / score.get(i).size() * 100) / 100.0);
		}
		System.out.println(Ssum);
		System.out.println(Savg);

		// 출력하자

		ArrayList<String> name = new ArrayList<String>();
		// 이름 어레이 리스트로 만들기
		for (int i = 0; i < name2.length; i++) {
			name.add(i, name2[i]);
		}

		System.out.println();

		for (int i = 0; i < rank.size(); i++) {
			for (int j = 0; j < rank.size(); j++) {
				if (rank.get(i) < rank.get(j)) {
					int temp = rank.get(i);
					rank.set(i, rank.get(j));
					rank.set(j, temp);
					score.set(j, score.set(i, score.get(j)));
					psum.set(j, psum.set(i, psum.get(j)));
					pavg.set(j, pavg.set(i, pavg.get(j)));

				}
			}

		}
		// 본격적으로 출력
		String[] names = { "이름", "국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계", "평균", "석차" };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < score.size(); i++) {
			System.out.print(name.get(i) + "\t");
			for (int j = 0; j < score.get(i).size(); j++) {
				System.out.print(score.get(i).get(j) + "\t");
			}
			System.out.print(psum.get(i) + "\t");
			System.out.print(pavg.get(i) + "\t");
			System.out.print(rank.get(i));
			System.out.println();
		}
		// 과목합계 , 평균 출력
		System.out.print("과목합계\t");
		for (int i = 0; i < Ssum.size(); i++) {
			System.out.print(Ssum.get(i) + "\t");
		}
		System.out.println();
		// 과목 평균 출력
		System.out.print("과목평균\t");
		for (int i = 0; i < Savg.size(); i++) {
			System.out.print(Savg.get(i) + "\t");
		}
		System.out.println();

	}

}
