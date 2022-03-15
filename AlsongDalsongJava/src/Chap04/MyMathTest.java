package Chap04;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long resultl = mm.add(5l,3l);
		long result2 = mm.substract(5l,3l);
		long result3 = mm.multiply(5l,3l);
		double result4 = mm.divide(5l, 3l);
		
		System.out.println(resultl);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}

	long substract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
	int max(int a, int b) {
		if(a>b) {
			return a;
			
		}else return b;
	}
}
cl
}



















