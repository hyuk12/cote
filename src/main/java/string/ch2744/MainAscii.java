package string.ch2744;

import java.util.Scanner;

public class MainAscii {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			// 대문자인지?
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				int dist = str.charAt(i) - 'A';
				int lowerAscii = 'a' + dist;

				System.out.print((char)lowerAscii);
			} else {
				int dist = str.charAt(i) - 'a';
				int upperAscii = 'A' + dist;

				System.out.print((char)upperAscii);
			}
		}

	}
}
