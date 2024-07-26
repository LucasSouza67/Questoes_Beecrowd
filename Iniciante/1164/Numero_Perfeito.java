package iniciante;

import java.util.Scanner;

public class Numero_Perfeito {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leituras = sc.nextInt();

		for (int i = 0; i < leituras; i++) {
			int num = sc.nextInt();
			ehPerfeito(num);
		}
		sc.close();
	}

	public static void ehPerfeito(int n) {
		int soma = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				soma += i;
		}
		if (soma == n)
			System.out.println(n + " eh perfeito");
		else
			System.out.println(n + " nao eh perfeito");
	}

}
