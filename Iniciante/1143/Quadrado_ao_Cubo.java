package iniciante;

import java.util.Scanner;

public class Quadrado_ao_Cubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, n;
		double quad, cub;

		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			quad = Math.pow(i, 2);
			cub = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f\n", i, quad, cub);
		}

		sc.close();

	}

}
