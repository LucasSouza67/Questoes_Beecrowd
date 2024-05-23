package iniciante;

import java.util.Scanner;

public class Soma_Impares_Consecutivos1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, soma = 0, aux, i;

		x = sc.nextInt();
		y = sc.nextInt();

		if (x > y) { /// colancando os valores inseridos em ordem crescente
			aux = x;
			x = y;
			y = aux;
		}

		/// x + 1 garante o intervalo ENTRE os valores fornecidos
		for (i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);

		sc.close();

	}

}
