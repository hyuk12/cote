package 백조의호수3197;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 백조의 호수[3197]
 * 시간 제한: 1초
 * 문제: 두 마리의 백조가 호수에서 살고 있었다. 그렇지만 두 마리는 호수를 덮고 있는 빙판으로 만나지 못한다.
 * 호수는 행이 R개, 열이 C개인 직사각형 모양이다. 어떤 칸은 얼음으로 덮여있다.
 * 호수는 차례로 녹는데, 매일 물 공간과 접촉한 모든 빙판 공간은 녹는다.
 * 두 개의 공간이 접촉하려면 가로나 세로로 닿아 있는 것만 (대각선은 고려하지 않는다) 생각한다.
 * 아래에는 세 가지 예가 있다.
 *...XXXXXX..XX.XXX ....XXXX.......XX .....XX..........
 * ....XXXXXXXXX.XXX .....XXXX..X..... ......X..........
 * ...XXXXXXXXXXXX.. ....XXX..XXXX.... .....X.....X.....
 * ..XXXXX..XXXXXX.. ...XXX....XXXX... ....X......XX....
 * .XXXXXX..XXXXXX.. ..XXXX....XXXX... ...XX......XX....
 * XXXXXXX...XXXX... ..XXXX.....XX.... ....X............
 * ..XXXXX...XXX.... ....XX.....X..... .................
 * ....XXXXX.XXX.... .....XX....X..... .................
 *       처음               첫째 날             둘째 날
 *
 * 백조는 오직 물 공간에서 세로나 가로로만(대각선은 제외한다) 움직일 수 있다.
 * 며칠이 지나야 백조들이 만날 수 있는 지 계산하는 프로그램을 작성하라.
 *
 * 입력:
 * - 첫째 줄에는 R과 C가 주어진다. 단, 1 ≤ R, C ≤ 1500이다.
 * - 다음 R개의 줄에는 C개의 문자가 주어진다. '.'은 물 공간, 'X'는 빙판 공간, 'L'은 백조가 있는 공간이다.
 *
 * 출력:
 * - 첫째 줄에 문제에서 주어진 걸리는 날을 출력한다.
 */

public class Main {
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int R, C;
	static char[][] lake;
	static Queue<int[]> waterQueue = new LinkedList<>();
	static Queue<int[]> iceQueue = new LinkedList<>();
	static Queue<int[]> swanQueue = new LinkedList<>();
	static boolean[][] visited;
	static int[] swan1 = new int[2];
	static int[] swan2 = new int[2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		R = Integer.parseInt(input[0]);
		C = Integer.parseInt(input[1]);

		lake = new char[R][C];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			lake[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				if (lake[i][j] == 'L') {
					if (swan1[0] == 0 && swan1[1] == 0) {
						swan1[0] = i;
						swan1[1] = j;
					} else {
						swan2[0] = i;
						swan2[1] = j;
					}
					lake[i][j] = '.';
				}
				if (lake[i][j] == '.') {
					waterQueue.add(new int[] {i, j});
					visited[i][j] = true;
				}
				if (lake[i][j] == 'X') {
					iceQueue.add(new int[] {i, j});
				}
			}
		}

		int days = 0;
		boolean found = false;

		// 얼음이 녹는 시뮬레이션
		while (!found) {
			// 얼음이 녹는 BFS
			int iceSize = iceQueue.size();
			for (int i = 0; i < iceSize; i++) {
				int[] ice = iceQueue.poll();
				int x = ice[0];
				int y = ice[1];

				for (int d = 0; d < 4; d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					if (nx >= 0 && nx < R && ny >= 0 && ny < C && lake[nx][ny] == 'X') {
						lake[nx][ny] = '.';
						waterQueue.add(new int[] {nx, ny});
						iceQueue.add(new int[] {nx, ny});
					}
				}
			}

			// 백조의 이동 BFS
			int swanSize = swanQueue.size();
			boolean[][] swanVisited = new boolean[R][C];
			for (int i = 0; i < swanSize; i++) {
				int[] swan = swanQueue.poll();
				int x = swan[0];
				int y = swan[1];

				for (int d = 0; d < 4; d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
						if (nx == swan2[0] && ny == swan2[1]) {
							found = true;
							break;
						}
						if (!swanVisited[nx][ny] && (lake[nx][ny] == '.' || (nx == swan2[0] && ny == swan2[1]))) {
							swanQueue.add(new int[] {nx, ny});
							swanVisited[nx][ny] = true;
						}
					}
				}
				if (found)
					break;
			}

			days++;
		}

		bw.write(days + "\n");
		bw.flush();
		br.close();
		bw.close();
	}
}
