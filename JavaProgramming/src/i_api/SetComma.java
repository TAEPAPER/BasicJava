package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마를 붙여 출력해주세요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요"); //
		String n = sc.nextLine();

//		/*  내가 한것ㅠㅠ
//		 * String rev = ""; for (int i =0; i<n.length(); i++) { if (i % 3 == 2) { rev =
//		 * "," + n.substring(i); } else { rev = n.substring(i); } }
//		 * System.out.println(rev);
//	/
//
//		String str = "12345"; // 각자 한글자식 배열에 있는 거야 !~~!!!!
//		int length = str.length(); // 배열의 길이를 반환해주는거야
//		for (int i = 0; i < length; i++) {
//			char charAt = str.charAt(i); // char타입으로 반환된다
//			System.out.println(charAt);
//		}
//		
//		
//		String rev ="";
//	for(int i = n.length()-1; i>=0; i--) {
//		if(i%3==2) {
//		rev	+=","+n.charAt(i);
//		}else {
//			rev	+=  n.charAt(i);
//		}	
//	}
//		System.out.println(rev);	
//
//	if(rev[0].equals(",")) {
//		
//	}
//		
	
	////////////////////////////// 선생님이 한것
	int count = 0;
	String res = "";
	for(int i = n.length()-1; i>=0; i--) {
		res = n.charAt(i)+ res;  
		count++;
		if(count %3 == 0&& count!= n.length()) {
			res = ","+ res;
		}
	}
	System.out.println(res);
	
	
	System.out.println("몇개의 *를 표시할까요?");
	int input = sc.nextInt();
	int coun =0; 
	for(int i=0; i<input; i++) {
		System.out.print("*");
		coun++;
		if(coun%5==0) {
			System.out.println();
		}
	}
	
	
	
	
	
	}
}