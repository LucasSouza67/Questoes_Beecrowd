package iniciante;

import java.util.Scanner;

public class Resto_Divisao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = sc.nextInt();
		y = sc.nextInt();

		int maior = Math.max(x, y);
		int menor = Math.min(x, y);

		for (i = menor + 1; i < maior; i++) {
			if (i % 5 == 2 || i % 5 == 3)
				System.out.println(i);
		}

		sc.close();

	}

}
