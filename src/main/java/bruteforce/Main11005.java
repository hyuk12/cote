package bruteforce;

import java.util.Scanner;

public class Main11005 {
	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		while (N > 0) {
			int digit = N % B;
			if (digit < 10)
				ans += digit;
			else
				ans += (char)(digit - 10 + 'A');
			N /= B;
		}

		for (int i = ans.length() - 1; i >= 0; i--) {
			System.out.print(ans.charAt(i));
		}
		System.out.println();
	}
}
