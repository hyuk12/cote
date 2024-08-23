package 최댓값;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] board = new int[9][9];
		int[] check = new int[2];
		int temp = -1; // 양의 정수기 때문에 0일경우도 생각해야해서 -1 로해야한다. 예를들어 전부다 0일경우 0이 최대값이기 때문이다.
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (temp < board[i][j]) {
					temp = board[i][j];
					check[0] = i + 1;
					check[1] = j + 1;
				}
			}
		}
		System.out.println(temp);
		System.out.println(check[0] + " " + check[1]);
	}
}
