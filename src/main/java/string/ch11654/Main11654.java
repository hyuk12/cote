package string.ch11654;

import java.util.Scanner;

public class Main11654 {
	public static void main(String[] args) {
		// 아스키 코드
		// 알파벳 소문자, 대문자, 숫자 0-9 하나가 주어졌을 때 주어진 글자의 아스키 코드 값을 출력하는 프로그램

		Scanner sc = new Scanner(System.in);

		String code = sc.next();
		System.out.println((int)code.charAt(0));
	}
}
