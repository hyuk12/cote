package onedimensionalarray.ch10810;

import java.util.Scanner;

public class Main10810 {
	public static void main(String[] args) {
		// 문제: 바구니 총 N개 있다. 각각의 바구니는 1번부터 N번까지 번호 매겨져있다.
		// 가장 첫 바구니에는 공이 없음, 바구니에는 공을 1개만 넣을 수 있음
		// 앞으로 M번 공을 넣으려고 하고 한번 공을 넣을 때 공을 넣을 바구니 범위를 정하고 정한 바구니에 모두 같은 번호가 적혀 있는 공을 넣는다.
		// 만약 이미 들어가 있는 경우 빼고 새로운 공을 넣고 공을 넣을 바구니는 연속적이어야 한다.

		// 공을 어떻게 넣을지가 주어졌을 때 M번 공을 넣은 이후 바구니에 어떤공이 들어있는지 구하는 프로그램 만들기

		// 입력: 첫째 줄에 N(1 ≤ N ≤ 100)과 M(1 ≤ M ≤ 100)이 주어진다.
		// 다음 M개 줄에는 공을 넣는 방법이 주어진다. 각 방법은 두 정수 i, j로 이루어져 있음(1 ≤ i ≤ j ≤ N)
		// 출력: 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] baskets = new int[n];

		for (int i = 0; i < m; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();
			int ball = scanner.nextInt();

			for (int j = start - 1; j < end; j++) {
				baskets[j] = ball;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(baskets[i] + " ");
		}
		
	}
}
