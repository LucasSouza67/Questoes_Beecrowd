package iniciante;

import java.util.Scanner;

public class Seis_Numeros_mpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, qtd = 0;

		x = sc.nextInt();

		if (x % 2 == 0) {
			x += 1;
			while (qtd < 6) {
				System.out.println(x++);
				x++;
				qtd++;
			}
		} else {
			while (qtd < 6) {
				System.out.println(x++);
				x++;
				qtd++;
			}
		}

		sc.close();

	}

}
