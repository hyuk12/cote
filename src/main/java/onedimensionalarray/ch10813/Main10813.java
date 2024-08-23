package onedimensionalarray.ch10813;

import java.util.Scanner;

public class Main10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp;

		int[] baskets = new int[n];
		for (int i = 0; i < baskets.length; i++) {
			baskets[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			temp = baskets[start - 1];
			baskets[start - 1] = baskets[end - 1];
			baskets[end - 1] = temp;

		}

		for (int i = 0; i < n; i++) {
			System.out.print(baskets[i] + " ");
		}

	}
}
