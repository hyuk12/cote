package bruteforce;

import java.util.Scanner;

/**
 * 사탕 게임
 * 첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)
 * 다음 N개의 줄에는 보드의 상태가 주어진다.
 * 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.
 * 사탕의 색이 다른 인접한 두 칸을 골라서 교환할 수 있다.
 *
 * 출력: 첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.
 * 힌트: 예제 3의 경우 4번 행의 Y와 C를 바꾸면 사탕 네 개를 먹을 수 있다.
 *
 * 색이 다른 사탕이 인접한 두 칸을 골라 사탕을 서로 교환할 때, 같은 색으로 이루어진 가장 긴 연속 부분 행/열의 최댓값
 * 교환은 무조건 한 번만
 * 1. 가능한 모든 쌍의 사탕을 서로 교환한다.
 * 2. 교환한 상태에서 가장 긴 연속 부분 행/열을 찾는다.
 * 3. 교환한 사탕을 원복한다.
 */
public class Main3085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] board = new char[N][N];
		for (int i = 0; i < N; i++) {
			board[i] = sc.next().toCharArray();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j + 1 < N && board[i][j] != board[i][j + 1]) {
					swapCandy(board, i, j, i, j + 1);
					ans = Math.max(ans, Math.max(maxColumn(board), maxRow(board)));
					swapCandy(board, i, j, i, j + 1);
				}

				if (i + 1 < N && board[i][j] != board[i + 1][j]) {
					swapCandy(board, i, j, i + 1, j);
					ans = Math.max(ans, Math.max(maxColumn(board), maxRow(board)));
					swapCandy(board, i, j, i + 1, j);
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static int maxColumn(char[][] board) {
		int N = board.length;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 1; j < N; j++) {
				if (board[j][i] == board[j - 1][i]) {
					cnt++;
				} else {
					max = Math.max(max, cnt);
					cnt = 1;
				}
			}
			max = Math.max(max, cnt);
		}
		return max;
	}

	private static int maxRow(char[][] board) {
		int N = board.length;
		int ans = 0;
		for (int r = 0; r < N; r++) {
			int len = 1;
			for (int c = 1; c < N; c++) {
				if (board[r][c] == board[r][c - 1]) {
					len++;
				} else {
					ans = Math.max(ans, len);
					len = 1;
				}
			}
			ans = Math.max(ans, len);
		}
		return ans;
	}

	private static void swapCandy(char[][] board, int i, int j, int i1, int i2) {
		char temp = board[i][j];
		board[i][j] = board[i1][i2];
		board[i1][i2] = temp;
	}
}
