package iniciante;

import java.util.Scanner;

public class Intervalo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, nLeitura, numero, in = 0, out = 0;

		nLeitura = sc.nextInt();

		for (i = 0; i < nLeitura; i++) {
			numero = sc.nextInt();

			if (numero >= 10 && numero <= 20)
				in++;
			else
				out++;
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
