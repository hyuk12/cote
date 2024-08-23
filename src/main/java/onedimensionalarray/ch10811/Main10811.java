package onedimensionalarray.ch10811;

import java.util.Scanner;

public class Main10811 {
	public static void main(String[] args) {
		// 바구니가 총 N개 있다. 각각의 바구니는 1번부터 N번까지 번호가 순서대로 적혀있음
		// 가장 왼쪽 바구니부터 1번 ....N번째 바구니
		// 앞으로 M번의 바구니 순서를 역순으로 만들려고 한다. 한번 순서를 역순으로 바꿀 때,
		// 순서를 역순으로 만들 범위를 정하고 그 범위에 있는 바구니의 순서를 역순으로 만든다.
		// M번 순서를 역순으로 만든 이후 바구니에 어떤 순서가 적혀있는지 구하는 프로그램을 작성하시오.

		// 입력: 첫째 줄에 N(3 ≤ N ≤ 100)과 M(1 ≤ M ≤ 100)이 주어진다.
		// 출력: 모든 순서를 바꾼 다음에 가장 왼쪽에 있는 바구니 부터 바구니에 적혀있는 순서를 공백으로 구분해 출력

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp;

		int[] baskets = new int[n];

		for (int i = 0; i < n; i++) {
			baskets[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			for (int j = 0; j < (end - start + 1) / 2; j++) {
				temp = baskets[start - 1 + j];
				baskets[start - 1 + j] = baskets[end - 1 - j];
				baskets[end - 1 - j] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(baskets[i] + " ");
		}
	}
}
