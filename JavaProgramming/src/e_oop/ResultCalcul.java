package e_oop;

public class ResultCalcul {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double result1 = cal.plus(123456, 654321);
		System.out.println(result1);
		double result2 = cal.multi(result1, 123456);
		System.out.printf("%f%n",result2);
		double result3 = cal.div(result2, 123456);
		System.out.println(result3);
		double result4 = cal.minus(result3, 654321);
		System.out.println(result4);
		double result5 = cal.rest(result4, 123456);	
		System.out.println(result5);
		
		
		
	}

}
