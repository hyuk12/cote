package 정처기;

public class Soojebi {
	public static void main(String[] args) {
		int[] a = new int[8];
		int i = 0;
		int n = 10;
		while (i < a.length) {
			a[i++] = n % 2;
			n /= 2;
		}
		for (i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
