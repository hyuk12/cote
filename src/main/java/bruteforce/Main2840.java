package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Main2840 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		char[] ans = new char[N];
		Arrays.fill(ans, '?');
		int curIndex = 0;
		while (K-- > 0) {
			int step = sc.nextInt();
			char nextAlphabet = sc.next().charAt(0);
			int nextIndex = ((curIndex - step) % N + N) % N;
			if (ans[nextIndex] == '?')
				ans[nextIndex] = nextAlphabet;
			else if (ans[nextIndex] != nextAlphabet) {
				System.out.println("!");
				return;
			}
			curIndex = nextIndex;
		}
		boolean[] isUsed = new boolean[26];
		for (int i = 0; i < N; i++) {
			if (ans[i] == '?')
				continue;
			if (isUsed[ans[i] - 'A']) {
				System.out.println("!");
				return;
			}
			isUsed[ans[i] - 'A'] = true;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(ans[(curIndex + i) % N]);
		}
		System.out.println(sb.toString());
	}
}
