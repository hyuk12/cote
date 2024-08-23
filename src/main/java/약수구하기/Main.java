package 약수구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		// list 안에 a의 약수 넣기
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				list.add(i);
			}
		}

		// b-1번째 인덱스 꺼내기. 만약 b보다 list.size 가 작으면 0 출력
		if (list.size() <= b - 1) {
			System.out.println(0);
		} else {
			System.out.println(list.get(b - 1));
		}
	}
}
