package iniciante;

import java.util.Scanner;

public class Pare_Impares_Positivos_Negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, par = 0, impar = 0, positivo = 0, negativo = 0, valor;

		for (i = 0; i < 5; i++) {
			valor = sc.nextInt();

			if (valor % 2 == 0)
				par++;
			else
				impar++;

			if (valor > 0)
				positivo++;
			else if (valor < 0)
				negativo++;
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		sc.close();
	}

}
