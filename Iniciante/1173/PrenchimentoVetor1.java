package iniciante;

import java.util.Scanner;

public class PrenchimentoVetor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x[] = new int[10];

		int valor = sc.nextInt();

		for (int i = 0; i < x.length; i++) {
			if (i == 0)
				x[i] = valor;
			else
				x[i] = 2 * x[i - 1];
		}

		for (int i = 0; i < x.length; i++) {
			System.out.printf("N[%d] = %d\n", i, x[i]);
		}

		sc.close();

	}

}
