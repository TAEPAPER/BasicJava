package e_oop.score;

public class practiceScore {

	public static void main(String[] args) {
		String[] studentNames = { "김기웅", "박태정", "이정규", "오지현" };
		practiceStudent[] students = new practiceStudent[studentNames.length]; //그냥 배열만 생성해놓은것
		
		//객체 생성하고 값을 넣어줘
		
		for(int i =0; i<students.length; i++) {
			students[i] = new practiceStudent();
			students[i].name = studentNames[i];    //객체 생성후 배열에 저장
			students[i].getScore();         //개개인의 점수
			students[i].getSum();
			students[i].getAverage();
		}

		for(int i =0; i<students.length; i++) {
			students[i].getRank(students); //getRank의 return 값은 rank이다
		}
		//석차순으로 정렬 -선택정렬 -가장 작은 숫자를 찾아 맨앞으로보내
		for(int i = 0; i<students.length-1; i++) {
			int min = i;
			for(int j = i+1; j<students.length; j++) {
				if(students[j].rank <students[min].rank) {
					min = j;
				}
			}
			practiceStudent temp = students[i];
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
		for(int i =0; i<students.length; i++) {
			System.out.println(students[i].getInfo());
		}
		
		System.out.print("과목합계");
		for(int i =0; i<subSum.length; i++) {
			System.out.print("\t"+subSum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		for(int i =0; i<subAvg.length; i++) {
			System.out.print("\t"+subAvg[i]);
		}
		
		
		
		
	}

}
