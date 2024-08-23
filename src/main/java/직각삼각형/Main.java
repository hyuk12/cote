package 직각삼각형;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			int aPow = (int)Math.pow(a, 2);
			int bPow = (int)Math.pow(b, 2);
			int cPow = (int)Math.pow(c, 2);

			if (aPow + bPow == cPow) {
				System.out.println("right");
			} else if (bPow + cPow == aPow) {
				System.out.println("right");
			} else if (aPow + cPow == bPow) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
