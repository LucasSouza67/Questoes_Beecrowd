package iniciante;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i = 0;

		n = sc.nextInt();
		
		sc.close();

		for (i = 1; i <= 10; i++)
			System.out.printf("%d x %d = %d\n", i, n, i * n);

	}

}
