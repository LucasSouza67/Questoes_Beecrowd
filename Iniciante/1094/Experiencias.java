package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int n, qtd, i, coelho = 0, sapo = 0, rato = 0, soma = 0;
		char tipo;
		double mediaC = 0, mediaR = 0, mediaS = 0;

		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			qtd = sc.nextInt();
			tipo = sc.next().charAt(0);

			soma += qtd;

			if (tipo == 'C')
				coelho += qtd;
			else if (tipo == 'R')
				rato += qtd;
			else
				sapo += qtd;
		}

		mediaC = (coelho * 100.0) / soma;
		mediaR = (rato * 100.0) / soma;
		mediaS = (sapo * 100.0) / soma;

		System.out.printf("Total: %d cobaias\n", soma);
		System.out.printf("Total de coelhos: %d\n", coelho);
		System.out.printf("Total de ratos: %d\n", rato);
		System.out.printf("Total de sapos: %d\n", sapo);
		System.out.println("Percentual de coelhos: " + df.format(mediaC) + " %");
		System.out.println("Percentual de ratos: " + df.format(mediaR) + " %");
		System.out.println("Percentual de sapos: " + df.format(mediaS) + " %");

		sc.close();

	}

}
