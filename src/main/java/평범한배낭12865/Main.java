package 평범한배낭12865;

import java.util.Scanner;

/**
 *  평범한 배낭
 *  동적 계획법에 관한 문제
 *	이 문제의 목표는 주어진 물건들 중에서 무게가 최대 K를 넘지 않도록 배낭에 넣었을 때 가치를 최대화하는 것입니다.
 *	동적 계획법을 사용하여 이 문제를 해결할 때,주로 사용하는 접근 방식은 단일 차원 DP 배열을 사용하는 것입니다.
 *	이 접근 방식을 통해 시간 복잡도를 줄이고 효율적으로 문제를 해결할 수 있습니다.
 *  입력:
 *  - 첫 번째 줄에는 물품의 수 N과 배낭의 최대 무게 K가 주어집니다. (1 ≤ N ≤ 100, 1 ≤ K ≤ 100,000)
 *  - 두 번째 줄부터 N+1번째 줄까지 각 물품의 무게 W와 가치 V가 주어집니다. (1 ≤ W ≤ 100, 0 ≤ V ≤ 1,000)
 *  출력:
 *  - 배낭에 넣을 수 있는 물품들의 가치의 최댓값을 출력합니다.
 *
 *  동적 계획법(Dynamic Programming)을 사용하여 문제를 해결합니다.
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] dp = new int[K + 1];
		for (int i = 0; i < N; i++) {
			int W = sc.nextInt();
			int V = sc.nextInt();
			for (int j = K; j >= W; j--) {
				dp[j] = Math.max(dp[j], dp[j - W] + V);
			}
		}
		System.out.println(dp[K]);
	}
}
