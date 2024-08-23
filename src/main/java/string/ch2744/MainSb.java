package string.ch2744;

import java.util.Scanner;

public class MainSb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		StringBuilder sb = new StringBuilder(str.length());

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}

		System.out.println(sb.toString());
	}
}
