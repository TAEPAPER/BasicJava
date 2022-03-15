package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * 
		 * String -여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 *
		 * String의 주요 메서드 -equals() : 문자열의 내용이 같은지 반환한다 -length() : 문자열의 길이를 반환한다
		 * -charAt(): 특정 인덱스에 위치한 문자를 반환한다 
		*	-substring() : 문자열의 특정 부분을 잘라서 반환한다
		 * -contains() : 문자열이 특정문자열을 포함하고 있는지 여부를 반환한다(boolean) 
		-indexOf() : 문자열 내의 특정
		 * 문자의 인덱스를 반환한다 
		-split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다 -replace() : 문자열 내의
		 * 특정 문자를 다른 문자로 바꿔서 반환한다 -trim() : 문자열 앞뒤의 공백을 제거해 반환한다 -valueOf() : 다른 타입의
		 * 데이터를 문자열로 반환해 반환한다.(형변환)
		 * 
		 */

		String str = "12345"; // 각자 한글자식 배열에 있는 거야 !~~!!!!
		int length = str.length(); // 배열의 길이를 반환해주는거야
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i); // char타입으로 반환된다
			System.out.println(charAt);
		}

		// 문자열 뒤집기
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);

		str = "0123456789";
		String sub1 = str.substring(3); // 파라미터 1개 : 시작인덱스 부터 끝까지 잘라서 반환
		System.out.println(sub1); // 파라미터 2개 : 시작인덱스부터 끝나는 인덱스까지 -끝나는 인덱스는 포함이 안된다(전까지만 반환)
		String sub2 = str.substring(5, 8);
		System.out.println(sub2);

		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index); // 없으면 -1이 반환이된다

		// substring과 indexof를 조합해서 문자열 자르기
		String[] menu = { "수박 20000원", "오렌지 100000원", "귤 500원", "블루베리 3000원" };
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
		}

		// 가격만 잘라서 int 타입 변수에 저장하세요

		for (int i = 0; i < menu.length; i++) {
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") + 1, menu[i].indexOf("원")));
			System.out.println(price);
		}

		str = "a/b/c";
		String[] split = str.split("/"); // "/"을 기준으로 나눈다 -/은 내용에 포함되지 않는다!
		System.out.println(Arrays.toString(split));

		// 메뉴명과 가격 나누기
		for (int i = 0; i < menu.length; i++) {
			String[] split2 = menu[i].split(" ");
			System.out.println(split2[0]+":"+split2[1]);
		}

		str = "123123123";
		str = str.replace("3", "짝");
		System.out.println(str);
		
		str = " 문 자 열 ";  //앞뒤에 있는 공백만 제거해준다  //사용자한테 입력받을 때 사용
		String trim = str.trim();
		System.out.println("["+str+"]->[" +trim +"]");
		
		int num = 10;
		str = num + ""; 
		str = String.valueOf(num);  //스트링타입으로 형변환 해줌;
		
		
		
		
		
		
		
		
	}

}
