package bruteforce;

import java.util.Scanner;

public class Main10448 {
	static boolean[] isEurekaNumber = new boolean[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// 삼각수의 합으로 만들 수 있는 수인지 확인한다
		preprocess();
		for (int i = 0; i < T; i++) {
			if (isEurekaNumber[arr[i]]) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	private static void preprocess() {

		for (int i = 1; i <= 44; i++) {
			for (int j = 1; j <= 44; j++) {
				for (int k = 1; k <= 44; k++) {
					int sum = i * (i + 1) / 2 + j * (j + 1) / 2 + k * (k + 1) / 2;
					if (sum <= 1000) {
						isEurekaNumber[sum] = true;
					}
				}
			}
		}
	}

}
