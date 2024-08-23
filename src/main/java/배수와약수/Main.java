package 배수와약수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			if (first == 0 && second == 0) {
				flag = false;
				return;
			}

			if (second / first != 0) {
				System.out.println("factor");
			} else if (first % second == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}

		}
	}
}
