package 색종이;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int area = 0;
		boolean[][] check = new boolean[100][100];
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!check[j][k]) {
						check[j][k] = true;
						area++;
					}
				}
			}
		}
		System.out.println(area);
	}
}
