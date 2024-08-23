package string.ch1543;

import java.util.Scanner;

public class MainVersion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();

		String replaced = doc.replace(word, "");
		int count = (doc.length() - replaced.length()) / word.length();

		System.out.println(count);
	}
}
