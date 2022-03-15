package if_;

public class if_if {

	public static void main(String[] args) {
		
		//점수가 60이면 합격 그렇지 않으면 불합격
		
//		 int score = 55;
//				 if (score>=60) {
//					 System.out.println("합격");}
//				 
//				else {
//						 System.out.println("불합격");
//						 
//					 }
//				 }

	
	//점수에 등급을 부여
	
	int score = 80;
	String grade = null;
	
	if (score >= 90) {
		grade = "A";
	}else if (score>=80) {
		grade = "B";	
	}else if (score >=70) {
		grade = "C";
	}else {
		grade = "F";
		
	}
	
	System.out.println(score + "점:"+grade);
	int a;
	String b;
	boolean c;
	System.out.println();
	
	
	
	//switch문!!!
	int month = 5;
	String season = null;
	
	switch(month) {
	case 3:
	case 4:
	case 5: season = "봄";break;
	case 6:
	case 7:
	case 8: season = "여름";break;
	case 9:
	case 10:
	case 11:season = "가을"; break;
	case 12:
	case 1:
	case 2: season = "겨울"; break;
	}
	System.out.println(month+"월:"+season);
	
	
	
	
	

		
		}
		
	}


