package iniciante;

import java.util.Scanner;

public class Soma_Impares_Consecutivos3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0, aux = 0;

			while (aux < y) {
				if (x % 2 != 0) {
					soma += x;
					aux++;
				}
				x++;
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
