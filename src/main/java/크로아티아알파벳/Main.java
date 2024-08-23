package 크로아티아알파벳;

import java.util.Scanner;

// 2941
public class Main {
	public static void main(String[] args) {
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < croatia.length; i++) {
			if (input.contains(croatia[i])) {
				input = input.replace(croatia[i], " ");
			}
		}
		System.out.println(input.length());
	}
}
