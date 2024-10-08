package array.두수의합;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 두 수의 합
 * 문제: 서로 다른 양의 정수로 이루어진 수열에서 두 수의 합이 X가 되는 쌍의 개수
 * 입력: 첫째 줄에 수열의 크기 N(1 ≤ N ≤ 100,000)이 주어진다.
 * 둘째 줄에는 수열에 포함되는 수의 범위를 나타내는 정수 X(-1,000,000 ≤ X ≤ 1,000,000)가 주어진다.
 * 셋째 줄에는 수열이 주어진다. 수열에 포함되는 수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같다.
 * 출력: 첫째 줄에 문제의 정답을 출력한다.
 * 시간 복잡도: O(N)
 * 풀이: 두 수의 합이 X가 되는 쌍의 개수를 구하는 문제이다. 이 문제는 투 포인터(Two Pointer) 알고리즘을 사용하여 해결할 수 있다.
 * 투 포인터 알고리즘은 주로 정렬된 배열에서 두 개의 포인터를 조작하여 원하는 결과를 얻는 알고리즘이다.
 * 이 문제에서는 주어진 수열이 정렬되어 있지 않기 때문에 정렬을 수행한 후 투 포인터 알고리즘을 사용하여 문제를 해결할 수 있다.
 * 먼저, 수열을 정렬한 후 왼쪽 포인터와 오른쪽 포인터를 사용하여 두 수의 합이 X가 되는 쌍의 개수를 구한다.
 * 왼쪽 포인터는 수열의 가장 작은 수를 가리키고, 오른쪽 포인터는 수열의 가장 큰 수를 가리킨다.
 * 두 수의 합이 X보다 작으면 왼쪽 포인터를 오른쪽으로 이동하고, 두 수의 합이 X보다 크면 오른쪽 포인터를 왼쪽으로 이동한다.
 * 두 수의 합이 X가 되는 경우가 발생하면 왼쪽 포인터와 오른쪽 포인터를 각각 한 칸씩 이동하고, 두 수의 합이 X가 되는 경우의 수를 증가시킨다.
 * 이러한 방식으로 두 수의 합이 X가 되는 쌍의 개수를 구할 수 있다.
 * 이 문제를 해결하기 위한 알고리즘은 다음과 같다.
 * 1. 수열의 크기 N과 수열을 저장할 배열 arr, 두 수의 합 X를 입력받는다.
 * 2. 수열을 정렬한다.
 * 3. 왼쪽 포인터 left를 0으로, 오른쪽 포인터 right를 N-1로 초기화한다.
 * 4. left가 right보다 작은 동안 반복한다.
 * 5. 두 수의 합이 X보다 작으면 left를 오른쪽으로 이동한다.
 * 6. 두 수의 합이 X보다 크면 right를 왼쪽으로 이동한다.
 * 7. 두 수의 합이 X가 되는 경우가 발생하면 left와 right를 각각 한 칸씩 이동하고, 경우의 수를 증가시킨다.
 * 8. 반복이 끝나면 경우의 수를 출력한다.
 * 이 알고리즘을 사용하여 문제를 해결하면 시간 복잡도는 O(N)이 된다.
 * 이 알고리즘은 정렬된 배열에서 두 수의 합이 X가 되는 쌍의 개수를 구하는 문제에 사용할 수 있다.
 *
 */
public class Main3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int X = sc.nextInt();
		sc.close();
		int left = 0;
		int right = N - 1;
		int count = 0;
		// 수열을 정렬한다.
		// 퀵 정렬(Quick Sort)을 사용하여 수열을 정렬한다.
		// 퀵 정렬은 분할 정복(Divide and Conquer) 알고리즘을 사용하여 배열을 정렬하는 알고리즘이다.
		// 퀵 정렬은 평균적으로 O(NlogN)의 시간 복잡도를 가지지만, 최악의 경우 O(N^2)의 시간 복잡도를 가질 수 있다.
		// 수열의 크기가 최대 100,000이므로 퀵 정렬을 사용하여 수열을 정렬해도 시간 복잡도는 O(NlogN)이 된다.
		// 수열을 정렬하는 시간 복잡도는 O(NlogN)이 된다
		Arrays.sort(arr);
		// 투 포인터 알고리즘을 사용하여 두 수의 합이 X가 되는 쌍의 개수를 구한다.
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == X) {
				count++;
				left++;
				right--;
			} else if (sum < X) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(count);

	}
}
