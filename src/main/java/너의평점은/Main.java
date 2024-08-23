package 너의평점은;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] scores = new double[20];
		double scoreSum = 0.0;
		for (int i = 0; i < 20; i++) {
			String subject = sc.next();
			double score = sc.nextDouble();
			String graduate = sc.next();
			if (!graduate.equals("P")) {
				scoreSum += score;
				if (graduate.equals("F")) {
					score *= 0.0;
				} else if (graduate.equals("D0")) {
					score *= 1.0;
				} else if (graduate.equals("D+")) {
					score *= 1.5;
				} else if (graduate.equals("C0")) {
					score *= 2.0;
				} else if (graduate.equals("C+")) {
					score *= 2.5;
				} else if (graduate.equals("B0")) {
					score *= 3.0;
				} else if (graduate.equals("B+")) {
					score *= 3.5;
				} else if (graduate.equals("A0")) {
					score *= 4.0;
				} else if (graduate.equals("A+")) {
					score *= 4.5;
				}
				scores[i] = score;
			}
		}

		double sum = 0.0;
		for (int i = 0; i < 20; i++) {
			sum += scores[i];
		}
		System.out.println(String.format("%.6f", sum / scoreSum));

	}
}
