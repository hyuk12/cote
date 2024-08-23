package 중앙이동알고리즘;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pow = Math.pow(2, sc.nextInt());
		int result = (int)(pow + 1) * (int)(pow + 1);

		System.out.println(result);

	}
}
