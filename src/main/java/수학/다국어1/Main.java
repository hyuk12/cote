package 수학.다국어1;

import java.util.Scanner;

// 4375
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int num = 0;
			for (int i = 1; ; i++) {
				num = num * 10 + 1;
				num %= n;
				if (num == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
