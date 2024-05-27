package iniciante;

import java.util.Scanner;

public class Medias_Ponderadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, media = 0;

		int i, leituras;

		leituras = sc.nextInt();

		for (i = 0; i < leituras; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();

			media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (10);

			System.out.printf("%.1f\n", media);
		}

		sc.close();

	}

}
