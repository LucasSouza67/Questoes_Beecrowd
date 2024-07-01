package iniciante;

import java.util.Scanner;

public class Fatorial_simples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		for (i = n - 1; i >= 1; i--) {
			int fat = n * i;
			n = fat;
		}

		System.out.println(n);

		sc.close();

	}

}
