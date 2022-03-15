package e_oop.score;

public class practiceStudent {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;

	// 학생 개개인의 클래스
	// 메서드 만들기

	// 개개인의 과목점수 발생 메서드\
	void getScore() {
		kor = (int) (Math.random() * 101);
		eng = (int) (Math.random() * 101);
		math = (int) (Math.random() * 101);
	}

	// 개개인의 과목합계 메서드
	int getSum() {
		return sum = kor + eng + math;
	}

	// 개개인의 과목평균 메서드
	double getAverage() {
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}

	// 석차 구하는 메서드

	int getRank(practiceStudent[] students) {
		rank = 1;
		for (int i = 0; i < students.length; i++) {
			if (getSum() < students[i].sum) {
				rank++;
			}
		}
		return rank;
	}
	
	//한줄의 데이터 제공
	
//	String getInfo() {
//		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank;
	
	
	String getInfo() {
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank;	
	}
}
