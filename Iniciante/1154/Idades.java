package iniciante;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();

		double media = 0, soma = 0;
		int i = 0;

		while (idade > 0) {
			soma += idade;
			i++;
			
			idade = sc.nextInt();
		}

		media = soma / i;

		System.out.printf("%.2f", media);

		sc.close();
	}

}
