package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * 예외 발생시키기 (내가 원하는 상황에서 예외 발생)
		 * -throw new Exception();
		 * 
		 * 
		 */
		try {
			throw new IOException();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//NullPointerException -null을 참조했다?
//		
//		String str = null;
//		System.out.println(str.equals("abc"));

//		ArrayIndexOutOfBoundsException - 범위가 인덱스 범위를 벗어났다
		int[] arr = new int[10];
		for(int i =0; i<= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
