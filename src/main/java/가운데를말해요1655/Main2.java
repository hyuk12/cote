package 가운데를말해요1655;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Max-Heap을 표현하기 위해 PriorityQueue를 사용, 값은 음수로 저장
		PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
		// Min-Heap
		PriorityQueue<Integer> high = new PriorityQueue<>();

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();

			// 새로운 숫자를 `low` 힙에 추가
			low.add(number);

			// `low`의 최대값이 `high`의 최소값보다 크면 교환
			if (!high.isEmpty() && low.peek() > high.peek()) {
				high.add(low.poll());
			}

			// `low`와 `high`의 크기 조정
			if (low.size() > high.size() + 1) {
				high.add(low.poll());
			} else if (high.size() > low.size()) {
				low.add(high.poll());
			}

			// 현재 중간값 출력
			System.out.println(low.peek());
		}

		sc.close();
	}
}
