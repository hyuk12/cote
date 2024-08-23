package 세로읽기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] chars = new char[5][15];

		for (int i = 0; i < chars.length; i++) {
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				chars[i][j] = s.charAt(j);
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (chars[j][i] == '\0') {
					continue;
				}
				result.append(chars[j][i]);
			}
		}
		System.out.println(result);
	}
}
