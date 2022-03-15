package h_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * 메서드에 예외 선언하기
		 * -메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다
		 * -void method()  throws IOException{}  //
		 * -예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	private static void method() throws IOException { // -예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		throw new IOException();
		
	}

}
