package string.상수;

import java.util.Scanner;

// 2908
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputArr = input.split(" ");
		String A = inputArr[0];
		String B = inputArr[1];

		StringBuilder sbA = new StringBuilder(A);
		StringBuilder sbB = new StringBuilder(B);

		A = sbA.reverse().toString();
		B = sbB.reverse().toString();
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);

		System.out.println(a > b ? a : b);
	}
}
