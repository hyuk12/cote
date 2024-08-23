package string.ch10809;

import java.util.Scanner;

public class Main10809 {
	public static void main(String[] args) {
		// 알파벳 찾기
		// 문제: 알파벳 소문자로만 이루어진 단어 S존재, 각각의 알파벳에 대해서 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램 작성
		// 입력: 첫줄에 단어 S 주어진다. 단어의 길이는 100을 넘지않고 소문자로만 이루어짐
		// 출력: 각각 알파벳에 대해서 a가 처음 등장하는 위치, b가...z가 등장하는 위치를 공백으로 구분해서 출력
		// 만약 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] alphabetArr = new int[26];

		for (int i = 0; i < alphabetArr.length; i++) {
			alphabetArr[i] = -1;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (alphabetArr[ch - 'a'] == -1) {
				alphabetArr[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < alphabetArr.length; i++) {
			System.out.print(alphabetArr[i] + " ");
		}
	}
}
