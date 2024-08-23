package array.chapter1236;

import java.util.Scanner;

public class Main1236 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next().toCharArray();
		}

		// 1. 각 행/열에 대해 경비원이 있는지 확인한다.
		boolean[] existRow = new boolean[n];
		boolean[] existCol = new boolean[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 'X') {
					existRow[i] = true;
					existCol[j] = true;
				}
			}
		}
		
		int existRowCount = 0;
		for (int i = 0; i < n; i++) {
			boolean exist = false;
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 'X') {
					exist = true;
					break;
				}
			}
			if (exist) {
				existRowCount++;
			}
		}

		int existColCount = 0;
		for (int j = 0; j < m; j++) {
			boolean exist = false;
			for (int i = 0; i < n; i++) {
				if (arr[i][j] == 'X') {
					exist = true;
					break;
				}
			}
			if (exist) {
				existColCount++;
			}
		}

		// 2. 경비원이 없는 행/열의 개수를 센다.
		int needRowCount = n - existRowCount;
		int needColCount = m - existColCount;
		// 3. 둘 중 큰 값을 출력한다.
		System.out.println(Math.max(needRowCount, needColCount));

	}
}
