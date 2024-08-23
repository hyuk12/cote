package A더하기B빼기C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		System.out.println(A + B - C);
		String AB = A + "" + B;
		int ABInt = Integer.parseInt(AB);
		System.out.println(ABInt - C);
	}
}
