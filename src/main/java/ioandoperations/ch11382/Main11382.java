package ioandoperations.ch11382;

import java.util.Scanner;

public class Main11382 {
	public static void main(String[] args) {
		// 문제: 꼬마 정민이는 이제 A + B 정도는 쉽게 계산가능 이제 A + B + C 를 계산하고 출력하시오.
		// 입력: 첫째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12제곱)가 공백을 사이에 두고 주어진다.
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		System.out.println(a + b + c);

	}
}
