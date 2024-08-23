package bruteforce;

import java.util.Scanner;

/**
 * ACM 호텔
 */
public class Main10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			int floor = N % H;
			int room = N / H + 1;
			if (floor == 0) {
				floor = H;
				room--;
			}
			System.out.println(floor * 100 + room);
		}
	}
}
