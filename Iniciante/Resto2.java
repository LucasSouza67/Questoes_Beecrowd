package iniciante;

import java.util.Scanner;

public class Resto2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, i;

		N = sc.nextInt();

		for (i = 1; i <= 10000; i++) {
			if (i % N == 2)
				System.out.println(i);
		}

		sc.close();

	}

}
