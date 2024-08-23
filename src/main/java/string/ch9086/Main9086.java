package string.ch9086;

import java.util.Scanner;

public class Main9086 {
	public static void main(String[] args) {
		// 문자열
		// 문제: 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램 작성
		// 입력: 첫 줄에는 테스트 케이스의 개수 T(1 <= T <= 10) 각 테스트 케이스는 한줄에 하나의 문자열이 주어진다.
		// 문자열은 알파벳 대문자로 이루어지며 알파벳 사이에 공백은 없고 문자열의 길이는 1000보다 작다
		// 출력: 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] strArray = new String[count];

		for (int i = 0; i < count; i++) {
			String str = sc.next();
			char first = str.charAt(0);
			char last = str.charAt(str.length() - 1);
			String result = String.valueOf(first) + String.valueOf(last);

			strArray[i] = result;
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
