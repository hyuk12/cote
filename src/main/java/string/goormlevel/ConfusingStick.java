package string.goormlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1.  문제 링크:  https://level.goorm.io/exam/47882/%ED%97%B7%EA%B0%88%EB%A6%AC%EB%8A%94-%EC%9E%91%EB%8C%80%EA%B8%B0/quiz/1
 * 2. 접근 방법: 문자열 처리
 * 3. 시간 복잡도: O(N)
 *   - 입력받은 문자열을 한 글자씩 탐색하면서 조건에 맞는 문자열을 찾는다.
 *   - 따라서 입력받은 문자열의 길이만큼 탐색을 진행하므로 O(N)의 시간 복잡도를 가진다.
 *   - 여기서 N은 입력받은 문자열의 길이를 의미한다.
 *   - 이 문제에서는 N의 최대 길이가 100이므로 O(100) = O(1)이라고 볼 수 있다.
 *   - 따라서 시간 복잡도는 O(1)이라고 볼 수 있다.
 */
public class ConfusingStick {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '1') {
				cnt1++;
			} else if (c == 'I') {
				cnt2++;
			} else if (c == 'l') {
				cnt3++;
			} else if (c == '|') {
				cnt4++;
			}
		}
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
		System.out.println(cnt4);
	}
}
