package c;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 1-9 세 개의 숫자
		// 123

		// 135 :1s 1b 1o

		// 숫자가 동일한 경우에는 스트라이크

		// 379 : 0s ob 3o
		// 124 : 1s 1b 1o
		// 248 : 1s 2b 0o
		// 정답은 428

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;
		int num1;
		int num2;
		int num3;
		a = (int) (Math.random() * 9) + 1;
		b = (int) (Math.random() * 9) + 1;

		while (a == b) {

			b = (int) (Math.random() * 9) + 1;
		}
		c = (int) (Math.random() * 9) + 1;
		while (a == c || b == c) {
			c = (int) (Math.random() * 9) + 1;

		}

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("1-9까지의 겹치지 않는 숫자 3개를  입력해주세요");

		do {

			num1 = Integer.parseInt(sc.nextLine());
			num2 = Integer.parseInt(sc.nextLine());
			num3 = Integer.parseInt(sc.nextLine());

			int strike = 0;
			int ball = 0;
			int out = 0;
			if (a == num1) {

				strike += 1;

			} else if (a == num2 || a == num3) {
				ball += 1;

			} else {
				out += 1;

			}

			if (b == num2) {
				strike += 1;

			} else if (b == num1 || b == num3) {

				ball += 1;

			} else {

				out += 1;

			}

			if (c == num3) {

				strike += 1;

			} else if (c == num1 || c == num2) {

				ball += 1;

			} else {

				out += 1;

			}

			System.out.println("strike:" + strike + " ball:" + ball + " out:" + out);

		} while (a != num1 || b != num2 || c != num3);

	}

}
