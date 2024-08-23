package string.ch27866;

import java.util.Scanner;

public class Main27866 {
	public static void main(String[] args) {
		// 문자와 문자열
		// 문제: 단어 S와 정수 i 가 주어졌을 때 , S의 i번째 글자를 출력하는 프로그램

		// 입력: 첫째 줄에 단어 S가 주어진다. S는 알파벳 소문자와 대문자로만 이루어져 있고 길이는 1000을 넘지 않는다. 둘째 줄에 정수 i가 주어진다. (1 ≤ i ≤ |S|)
		// 출력: S의 i번째 글자를 출력한다.
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int i = sc.nextInt();

		System.out.println(s.charAt(i - 1));
	}
}
