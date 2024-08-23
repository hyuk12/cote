package bruteforce;

import java.util.Scanner;

/**
 * 회문인 수
 */
public class Main11068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int x = sc.nextInt();
			boolean ans = false;
			for (int i = 2; i <= 64; i++) {
				int[] digit = convertBase(x, i);
				if (isPalidrome(digit)) {
					ans = true;
					break;
				}
			}
			System.out.println(ans ? 1 : 0);
		}
	}

	private static boolean isPalidrome(int[] digit) {
		for (int i = 0; i < digit.length / 2; i++) {
			if (digit[i] != digit[digit.length - i - 1]) {
				return false;
			}
		}
		return true;
	}

	private static int[] convertBase(int x, int i) {
		int len = 0, copyX = x;
		while (copyX > 0) {
			copyX /= i;
			len++;
		}

		int[] digit = new int[len];
		len = 0;
		while (x > 0) {
			digit[len++] = x % i;
			x /= i;
		}
		return digit;
	}
}
