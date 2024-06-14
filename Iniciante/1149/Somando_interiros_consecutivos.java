package iniciante;

import java.util.Scanner;

public class Somando_interiros_consecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, n = 0, i = 1, x = 0;

		a = sc.nextInt();

		do {
			n = sc.nextInt();
			i += 1;
		} while (n <= 0);

		for (i = 0; i < n; i++) {
			x = x + a + i;
		}

		System.out.println(x);

		sc.close();

	}

}
