package iniciante;

import java.util.Scanner;

public class QuadradoPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, i, exp;

		N = sc.nextInt();

		if (N % 2 == 0) {
			for (i = 1; i <= N; i++) {
				exp = i*i;
				if (i % 2 == 0) {
					System.out.println(i+"^2 = "+exp);
				}
			}
		} else {
			for (i = 1; i < N; i++) {
				exp = i*i;
				if (i % 2 == 0) {
					System.out.println(i+"^2 = "+exp);
				}
			}
		}

		sc.close();

	}

}
