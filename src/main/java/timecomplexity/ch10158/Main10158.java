package timecomplexity.ch10158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();

		String[] arr = s.split(" ");
		String[] arr2 = s2.split(" ");
		String[] arr3 = s3.split(" ");

		int w = Integer.parseInt(arr[0]);
		int h = Integer.parseInt(arr[1]);
		int p = Integer.parseInt(arr2[0]);
		int q = Integer.parseInt(arr2[1]);
		int t = Integer.parseInt(arr3[0]);

		int x = (p + t) % (2 * w);
		int y = (q + t) % (2 * h);

		if (x > w) {
			x = 2 * w - x;
		}
		if (y > h) {
			y = 2 * h - y;
		}

		System.out.println(x + " " + y);
	}
}
