package iniciante;

import java.util.Scanner;

public class Ultrapassando_z {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, z;

		x = sc.nextInt();
		z = sc.nextInt();

		while (z <= x) {
			z = sc.nextInt();
		}

		int aux = x;
		x = 0;
		int cont = 0;

		while (x <= z) {
			x += aux++;
			cont++;
		}

		System.out.println(cont);

		sc.close();

	}

}
