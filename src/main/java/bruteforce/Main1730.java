package bruteforce;

import java.util.Scanner;

public class Main1730 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String command = sc.hasNext() ? sc.next() : "";

		int curR = 0, curC = 0;
		boolean[][] passVertical = new boolean[N][N];
		boolean[][] passHorizontal = new boolean[N][N];
		for (int i = 0; i < command.length(); i++) {
			char c = command.charAt(i);
			if (c == 'D') {
				if (curR == N - 1)
					continue;
				passVertical[curR][curC] = true;
				passVertical[curR + 1][curC] = true;
				curR++;
			} else if (c == 'U') {
				if (curR == 0)
					continue;
				passVertical[curR - 1][curC] = true;
				passVertical[curR][curC] = true;
				curR--;
			} else if (c == 'R') {
				if (curC == N - 1)
					continue;
				passHorizontal[curR][curC] = true;
				passHorizontal[curR][curC + 1] = true;
				curC++;
			} else if (c == 'L') {
				if (curC == 0)
					continue;
				passHorizontal[curR][curC - 1] = true;
				passHorizontal[curR][curC] = true;
				curC--;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (passVertical[i][j] && passHorizontal[i][j]) {
					sb.append('+');
				} else if (passVertical[i][j]) {
					sb.append('|');
				} else if (passHorizontal[i][j]) {
					sb.append('-');
				} else {
					sb.append('.');
				}
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
