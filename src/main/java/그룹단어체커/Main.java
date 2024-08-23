package 그룹단어체커;

import java.util.Scanner;

//1316
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 0;

		for (int i = 0; i < N; i++) {
			String input = sc.next();
			boolean[] check = new boolean[26];
			boolean isGroupWord = true;

			for (int j = 0; j < input.length(); j++) {
				int index = input.charAt(j) - 'a';

				if (check[index] == false) {
					check[index] = true;
				} else {
					if (input.charAt(j - 1) != input.charAt(j)) {
						isGroupWord = false;
						break;
					}
				}
			}

			if (isGroupWord) {
				result++;
			}
		}
		System.out.println(result);
	}
}
