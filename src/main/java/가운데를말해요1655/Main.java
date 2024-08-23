package 가운데를말해요1655;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int[] temp = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				temp[j] = arr[j];
			}
			// 정렬
			for (int j = 0; j < i; j++) {
				for (int k = j + 1; k <= i; k++) {
					if (temp[j] > temp[k]) {
						int tempValue = temp[j];
						temp[j] = temp[k];
						temp[k] = tempValue;
					}
				}
			}
			if (i % 2 == 0) {
				System.out.println(temp[i / 2]);
			} else {
				System.out.println(temp[i / 2]);
			}
		}
	}
}
