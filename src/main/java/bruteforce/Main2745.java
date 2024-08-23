package bruteforce;

import java.util.Scanner;

// 2745
public class Main2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String B = sc.next();
		int N = sc.nextInt();

		int result = 0;
		for (int i = 0; i < B.length(); i++) {
			char c = B.charAt(i);
			int num = 0;
			if (c >= '0' && c <= '9') {
				num = c - '0';
			} else {
				num = c - 'A' + 10;
			}
			result = result * N + num;
		}
		System.out.println(result);
	}
}
