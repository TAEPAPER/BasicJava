package if_;

import java.util.Scanner;

public class if_hw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = "아침을 배불리 먹은 후 점심시간 전에 배가고프다";
		String b = "밥,빵,과자 등 음식을 먹기 시작하면 끝이 없다";
		String c = "음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다";
		String d = "정말 배고프지 않더라도 먹을 때가 있다";
		String e = "저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다";
		String f ="스트레스를 받으면 자꾸 먹고 싶어진다";
		String g = "책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다";
		String h = "오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다";
		String i = "과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다";
		String j = "다이어트를 위해 식이조절을 하는데 3일도 못 간다";
		String y_n = "1.그렇다  2.아니다";
		int count;
		int count_f =0;
		
	     System.out.println(a);
		System.out.println(y_n);
		count = Integer.parseInt(sc.nextLine());
		if (count ==1){
			count_f +=1;}
		System.out.println(b);
		System.out.println(y_n);
		count = Integer.parseInt(sc.nextLine());
		if (count ==1){
			count_f +=1;}
		
			System.out.println(c);
			System.out.println(y_n);
			count = Integer.parseInt(sc.nextLine());
		if (count ==1){
				count_f +=1;}
		
				System.out.println(d);
				System.out.println(y_n);
				count = Integer.parseInt(sc.nextLine());
		if (count ==1){
					count_f +=1;}
		
					System.out.println(e);
					System.out.println(y_n);
					count = Integer.parseInt(sc.nextLine());
		if (count ==1){
						count_f +=1;}
		
						System.out.println(f);
						System.out.println(y_n);
						count = Integer.parseInt(sc.nextLine());
		if (count ==1){
							count_f +=1;}
		
							System.out.println(g);
							System.out.println(y_n);
							count = Integer.parseInt(sc.nextLine());
				if (count ==1){
								count_f +=1;}
				
								System.out.println(h);
								System.out.println(y_n);
								count = Integer.parseInt(sc.nextLine());
						if (count ==1){
									count_f +=1;}
									System.out.println(i);
									System.out.println(y_n);
									count = Integer.parseInt(sc.nextLine());
								if (count ==1){
										count_f +=1;}
										System.out.println(j);
										System.out.println(y_n);
										count = Integer.parseInt(sc.nextLine());
									if (count ==1){
											count_f +=1;}
									
			if (count_f <=3) {
				System.out.println("주의! 위험한 수준은 아니지만 관리필요");
				
			}else if (4 <=count_f&& count_f<=6) {
				System.out.println("위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
			}else if (count_f>= 7) {
				System.out.println("중독! 전문의 상담이 필요함");
			}
						
			switch(count_f) {
			case 1:
			case 2:
			case 3:  System.out.println("주의! 위험한 수준은 아니지만 관리 필요"); break;
			case 4:
			case 5:
			case 6: System.out.println("위험! 탄수활물 섭취 줄이기 위한 식습관 개선이 필요함");break;
			case 7:
			case 8:
			case 9:
			case 10: System.out.println("중독! 전문의 상담이 필요함"); break;
				
			}
				
											
		
						
   


	}

}
