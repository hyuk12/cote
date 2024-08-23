package string.그대로출력하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
