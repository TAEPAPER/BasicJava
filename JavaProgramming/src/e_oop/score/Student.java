package e_oop.score;

public class Student {
		//학생 한명의 데이터  //메써드를 만들어라
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		int rank;
		
		//메서드
		//학생이 점수 발생
		void randomScore() {
			kor = (int)(Math.random()*101);
			eng = (int)(Math.random()*101);
			math = (int)(Math.random()*101);
		}
		
		//학생 개개인의 각 과목의 점수의 합
		 int getSum() {
			return sum = kor + eng +math; 
		}
		 
		//학생 개개인의 과목 평균
		double getAverage() {
			return avg = Math.round(getSum()/3.0*100)/100.0;  //가능하면 변수보다는 이 값을 리턴해주는 메서드를 사용하는게 좋아
		}
		//석차 구하는 매써드
		int getRank(Student[] students) {
			rank =1;
			for(int i =0; i<students.length; i++) { //다른 사람의 점수를 외부에서 받아야해 // Student[] students 를 파라미터로 받음
				if(getSum()< students[i].getSum()) {
					rank++;
				}
			}
			return rank;
		}
			
		//한줄의 데이터를 제공하는 메써드(출력할 때)
		String getInfo() {
			return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank;
		}

}
