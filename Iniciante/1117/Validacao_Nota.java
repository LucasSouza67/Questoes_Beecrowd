package iniciante;

import java.util.Scanner;

public class Validacao_Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1 = 0, nota2 = -1, media = -1;

		do {
			nota1 = sc.nextFloat();

			if (nota1 < 0 || nota1 > 10)
				System.out.println("nota invalida");

		} while (nota1 < 0.0 || nota1 > 10.0);

		do {
			nota2 = sc.nextFloat();

			if (nota2 < 0 || nota2 > 10)
				System.out.println("nota invalida");

		} while (nota2 < 0.0 || nota2 > 10.0);

		media = (nota1 + nota2) / 2;

		System.out.printf("media = %.2f\n", media);

		sc.close();

	}

}
