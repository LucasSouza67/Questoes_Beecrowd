package iniciante;

import java.util.Scanner;

public class Numero_Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leituras = sc.nextInt();

		for (int i = 0; i < leituras; i++) {
			int num = sc.nextInt();
			ehPrimo(num);
		}
		sc.close();
	}

	public static void ehPrimo(int n) {
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				soma++;
		}
		if (soma == 2)
			System.out.printf("%d eh primo\n", n);
		else
			System.out.printf("%d nao eh primo\n", n);
	}

}
