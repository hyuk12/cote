package bruteforce;

import java.util.Scanner;

public class Main2817 {
	static class Score {
		int staffIndex;
		double scr;

		public Score(int staffIndex, double scr) {
			this.staffIndex = staffIndex;
			this.scr = scr;
		}
	}

	public static void sortScoresDescendingOrder(Score[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i].scr > arr[j].scr) {
					Score cur = arr[i];
					for (int k = i; k > j; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j] = cur;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		double validCut = X * 0.05;
		boolean[] validCandidate = new boolean[26];
		int[] staffVote = new int[26];
		int candidateCount = 0;
		for (int i = 0; i < N; i++) {
			String name = sc.next();
			int vote = sc.nextInt();
			if (vote >= validCut) {
				int idx = name.charAt(0) - 'A';
				validCandidate[idx] = true;
				staffVote[idx] = vote;
				candidateCount++;
			}
		}

		Score[] scores = new Score[candidateCount * 14];
		int scoreIndex = 0;
		for (int i = 0; i < 26; i++) {
			if (!validCandidate[i])
				continue;
			for (int j = 1; j <= 14; j++) {
				scores[scoreIndex++] = new Score(i, (double)staffVote[i] / j);
			}
		}

		sortScoresDescendingOrder(scores);

		int[] ans = new int[26];
		for (int i = 0; i < 14; i++)
			ans[scores[i].staffIndex]++;

		for (int i = 0; i < 26; i++) {
			if (validCandidate[i]) {
				System.out.println((char)(i + 'A') + " " + ans[i]);
			}
		}
	}
}
