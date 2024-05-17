package iniciante;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, cont = 0;
		double valor;

		for (i = 0; i < 6; i++) {
			valor = sc.nextDouble();
			if (valor > 0)
				cont++;
		}
		sc.close();

		System.out.println(cont + " valores positivos");

	}

}
