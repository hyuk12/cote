package string.ch2743;

import java.util.Scanner;

public class Main2743 {
	public static void main(String[] args) {
		// 단어 길이 재기
		// 문제: 알파벳으로만 이루어진 단어를 입력받아 그 길이를 출력하는 프로그램 작성
		// 입력: 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
		// 출력: 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(str.length());
	}
}
