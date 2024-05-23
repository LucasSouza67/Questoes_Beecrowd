package iniciante;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0, x;

		x = sc.nextInt();

		for (i = 1; i < x; i++) {
			System.out.println(i);
			i++;
		}

		sc.close();

	}

}
