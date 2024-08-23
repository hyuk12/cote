package 심화.팰린드롬;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int len = input.length();
		boolean isPalindrome = true;
		for (int i = 0; i < len / 2; i++) {
			if (input.charAt(i) != input.charAt(len - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome ? 1 : 0);
	}
}
