package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요. (계산기 만들어주세용)-산술연산 가능한
		
		Scanner sc = new Scanner(System.in);
		
		
	int num1;
	int num2;
	String _op;
	System.out.println("첫번째 숫자를 입력해주세요>");
	num1 = Integer.parseInt(sc.nextLine());
	System.out.println("두번째 숫자를 입력해주세요>");
	num2 = Integer.parseInt(sc.nextLine());
	System.out.println("연산자를 입력해주세요");
	_op = sc.nextLine();
	//int cal= _op.equals("+")? num1 + num2 :(_op.equals("-")?: num1-num2 :(_op.equals("*")? num1 *num2): _op.equals("/")?num1/num2:"확인불가")));
    
	System.out.println(_op.equals("+")? num1 + num2 :(_op.equals("-")? num1-num2 :(_op.equals("*")? num1 *num2: _op.equals("/")?num1/num2:"확인불가")));
	
	
	
			
			
	}

}
