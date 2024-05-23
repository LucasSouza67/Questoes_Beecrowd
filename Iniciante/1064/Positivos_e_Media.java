package iniciante;

import java.util.Scanner;

public class Positivos_e_Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valores[] = new double[6], soma = 0;
		int i, qtd = 0;

		for (i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();

			if (valores[i] > 0) {
				soma += valores[i];
				qtd++;
			}
		}

		double media = soma / qtd;

		System.out.printf("%d valores positivos\n", qtd);
		System.out.printf("%.1f\n", media);

		sc.close();

	}

}
