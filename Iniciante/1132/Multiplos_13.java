package iniciante;

import java.util.Scanner;

public class Multiplos_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, soma = 0, i;

		x = sc.nextInt();
		y = sc.nextInt();

		int maior = Math.max(x, y);
		int menor = Math.min(x, y);

		for (i = menor; i <= maior; i++) {
			if (i % 13 != 0)
				soma += i;
		}

		System.out.println(soma);

		sc.close();

	}

}
