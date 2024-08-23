package string.ch1543;

import java.util.Scanner;

public class Main1543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();

		int count = 0;
		int index = 0;

		while ((index = doc.indexOf(word, index)) != -1) {
			count++;
			index += word.length();
		}

		System.out.println(count);
	}
}
