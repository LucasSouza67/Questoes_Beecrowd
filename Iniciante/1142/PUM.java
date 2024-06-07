package iniciante;

import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, n, nAtual = 1;

		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.printf("%d %d %d PUM\n", nAtual, nAtual + 1, nAtual + 2);
			nAtual += 4;
		}

		sc.close();

	}

}
