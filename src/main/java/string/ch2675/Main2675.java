package string.ch2675;

import java.util.Scanner;

public class Main2675 {
	public static void main(String[] args) {
		// 문제: 문자열 S를 받은 후 각 문자를 R 번 반복, 새 문자열 P를 만든후 출력
		// 즉 첫번째 문자를 R번반복, 두번째 문자를 R번 반복하는 식으로 P를 만들 면된다.

		Scanner sc = new Scanner(System.in);
		int testCount = sc.nextInt();

		for (int i = 0; i < testCount; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
