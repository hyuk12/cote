package array.수정렬하기3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 계수 정렬(Counting Sort)을 사용하여 문제를 해결합니다.
 * 수 정렬하기3
 * 문제: N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
 * 출력: 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for (int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		for (int i = 1; i < 10001; i++) {
			while (arr[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
		bw.close();

	}
}
