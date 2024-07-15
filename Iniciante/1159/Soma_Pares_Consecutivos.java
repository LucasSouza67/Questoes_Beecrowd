package iniciante;

import java.util.Scanner;

public class Soma_Pares_Consecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		do {
			int soma = 0, i = 0;
			while (i < 5) {
				if (num % 2 == 0) {
					soma += num;
					i++;
				}
				num++;
			}

			System.out.println(soma);
			num = sc.nextInt();
		} while (num != 0);

		sc.close();

	}

}
