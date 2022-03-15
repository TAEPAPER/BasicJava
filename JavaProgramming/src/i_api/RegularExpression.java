package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 *  //라이브러리를 사용하는 방법을 api라고 한다
		 *  
		 * ^ 뒷 문자로 시작
		 * $ 앞 문자로 종료
		 * .임의의 문자(줄바꿈 제외)
		 * *앞 문자가 0개 이상
		 * + 앞 문자가 1개 이상
		 * ? 앞문자가 없거나 1개
		 * [] 문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z] : a부터 z가 아닌것)
		 * {} 앞 문자의 개수 ({2}:2개, {2,4}: 2개 이상 4개 이하)
		 * () 그룹화(1개의 문자처럼 인식)
		 * | OR 연산
		 * \s 공백,탭, 줄바꿈
		 * \S 공백, 탭, 줄바꿈이 아닌 문자
		 * \w 알파벳이나 숫자
		 * \W 알파벳이나 숫자가 아닌 문자
		 * \d 숫자
		 * \D 숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분안함
		 * \ 정규표현식에서 사용되는 특수문자 표현
		 * 
		 */
		
		
		//String regex = "[a-z]{3}[0-9]{1,3}";   
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";  
		
	//파라미터로 정규표현식을 넘겨줌

	
	
	//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요/
	    String regex1 = "[a-z]{1,4}\\d{0,5}";   //--앞에는 4개개이하의 알파벳, 뒤에는 숫자 5개
		String regex2 = "\\d{3}\\S\\d{4}\\S\\d{4}";//전화번호	 앞 3개 특수기호 하나 앞 4개 특수기호 앞 4개
		String regex3 = "[a-z]+\\d{0,5}\\S[a-z]{1,}\\S[a-z]{1,}";  //이메일    -앞에 문자 1개 이상   5개까지 숫자 특수기호    10글자까지 문자 특수기호
		
		
		String id = "ptj4906";
		Pattern p = Pattern.compile(regex1);
		Matcher m =	p.matcher(id);
		System.out.println(m.matches());
		
		Pattern p2 = Pattern.compile(regex2);
		String num = "010-2768-8228";
		Matcher m2 =	p2.matcher(num);
		System.out.println(m2.matches());
		
		Pattern p3 = Pattern.compile(regex3);
		String email = "taejeong055@gmail.com";
		Matcher m3 =	p3.matcher(email);
		System.out.println(m3.matches());
	/*
	 * 아이디: [a-z0-9_-]{5,20}
	 * 전화번호 : ^0\\d{1,3}-\\d{3,4}-\\d{4}
	 * 이메일 주소: [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$	
	 */
		
		
		
		
		
	}

}
