package 약수들의합;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int sum = 0;
			int n = sc.nextInt();
			list.clear();
			if (n == -1) {
				break;
			}

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					// System.out.println(i);
					list.add(i);
				}
			}

			for (int i = 0; i < list.size() - 1; i++) {
				sum += list.get(i);
			}

			if (sum != n) {
				System.out.println(n + " is NOT perfect.");
			} else {
				System.out.print(n + " = ");
				for (int i = 0; i < list.size() - 1; i++) {
					System.out.print(list.get(i));
					for (int j = 0; j < 1; j++) {
						if (i == (list.size() - 2)) {
							break;
						}
						System.out.print(" + ");
					}
				}
				System.out.println();
			}
		}
	}
}
