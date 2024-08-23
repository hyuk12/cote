package 세탁소사장동혁;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		for (int i = 0; i < T; i++) {
			int C = sc.nextInt();
			System.out.print(C / quarter + " ");
			C %= quarter;
			System.out.print(C / dime + " ");
			C %= dime;
			System.out.print(C / nickel + " ");
			C %= nickel;
			System.out.println(C / penny);
		}
	}
}
