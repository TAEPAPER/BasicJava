package e_oop.score;

public class Score {

	public static void main(String[] args) {
		// 객체생성을 해야 클래스(설계도)를 쓸 수 있어
		String[] studentNames = { "김기웅", "박태정", "이정규", "오지현" };
		Student[] students = new Student[studentNames.length]; // 학생을 저장할 배열 // //클래스 이름은 Student
		

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();// 객체 생성해서 배열에 저장
			students[i].name = studentNames[i];
			students[i].randomScore();
			students[i].getSum();
			students[i].getAverage();
		}
			//석차 구하기
		for (int i = 0; i < students.length; i++) {
			students[i].getRank(students);
		}
		//석차 순대로 정렬하기 //선택정렬
		for (int i = 0; i < students.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;

		}

		int[] subSum = new int[3];
		for (int i = 0; i < students.length; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		double[] subAvg = new double[3];
		for (int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round((double) subSum[i] / students.length * 100) / 100.0;
		}
		//출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getInfo());
		}
		System.out.print("과목합계");
		for (int i = 0; i < subSum.length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.print("\n과목평균");
		for (int i = 0; i < subAvg.length; i++) {
			System.out.print("\t" + subAvg[i]);
		}

//		for (int i = 0; i < students.length; i++) {
//			students[i].sum = sc.sum(students[i].kor, students[i].eng, students[i].math);
//		}
//		
//		// 학생 개개인의 과목 평균
//
//		for (int i = 0; i < students.length; i++) {
//			students[i].avg = sc.avg(students[i].sum);
//		}
//
//		// 학생들의 석차구하기
//		for (int i = 0; i < students.length; i++) {
//			for (int j = 0; j < students.length; j++) {
//				if (students[i].sum < students[j].sum) {
//					students[i].rank++;
//				}
//			}
//		}
//		// 과목 합계구하기
//		int[] subSum = new int[subject.length];
//
//		for (int i = 0; i < studentNames.length; i++) {
//			subSum[0] += students[i].kor;
//			subSum[1] += students[i].eng;
//			subSum[2] += students[i].math;
//		}
//
//		// 과목별 평균 구하기
//		double[] subAvg = new double[subject.length];
//		for (int i = 0; i < subAvg.length; i++) {
//			subAvg[i] = Math.round((double) subSum[i] / students.length * 100) / 100.0;
//		}
//		// 석차순으로 배열하기 //선택정렬
//		for (int i = 0; i < students.length; i++) {
//			int min = i;
//			for (int j = i + 1; j < students.length; j++) {
//				if (students[j].rank < students[min].rank) {
//					min = j; // 최솟값을 찾고!
//				}
//
//			}
//
//			Student temp = students[i];
//			students[i] = students[min];
//			students[min] = temp;
//		}
//			// 출력
//
//			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
//
//			for (int i = 0; i < students.length; i++) {
//				System.out.print(students[i].name + "\t");
//				System.out.print(students[i].kor + "\t");
//				System.out.print(students[i].eng + "\t");
//				System.out.print(students[i].math + "\t");
//				System.out.print(students[i].sum + "\t");
//				System.out.print(students[i].avg + "\t");
//				System.out.println(students[i].rank);
//
//			}
//			System.out.print("과목합계" + "\t");
//			for (int i = 0; i < subject.length; i++) {
//				System.out.print(subSum[i] + "\t");
//			}
//			System.out.println();
//			System.out.print("과목 평균" + "\t");
//			for (int i = 0; i < subject.length; i++) {
//				System.out.print(subAvg[i] + "\t");
//			}

		// 메써드 밖에 있는 변수와 안에 있는 변수는 차이가 있다
		// 밖에 있는 변수는 전역변수라고 함! 전체 영역에서 다 사용할 수 있다
		// 전역변수는 초기화하지 않아도 자동으로 초기화된다(기본값으로)

		// 과제
		// 스코어 클래스 메인메서드 분리해서 ,. 스튜던트 클래스 메서드를 만들어준다 -- 학생이 할 수 있는일만 메서드로 만든다
		// 스코어에서는 스튜던트 클래스의 메서드를 이용해서 한다

	}

}
