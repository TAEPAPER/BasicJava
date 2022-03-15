package Joon;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if (m<45) {
			h--;
			m = 60-(45-m);
			if (h < 0) {
				h = 23;
			}
			System.out.println(h + " ");
			System.out.println(m + " ");
		} else {
			m = m - 45;
			System.out.println(h + " ");
			System.out.println(m + " ");
		}
	}

}
