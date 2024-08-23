package loop.ch25314;

import java.util.Scanner;

public class Main25314 {
	public static void main(String[] args) {
		// 문제: long int 는 4바이트 정수 자료형, long long int 는 8바이트, int 앞에 long이 하나 붙을 때마다 4바이트씩 증가
		// 입력: 첫 번째 줄에는 문제의 정수 N이 주어짐(N은 4보다 크거나 같고 1000보다 작거나 같다, N은 4의 배수)
		// 출력: N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력해라

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int longCount = n / 4;

		for (int i = 0; i < longCount; i++) {
			System.out.print("long ");
		}

		System.out.println("int");
	}
}
