package iniciante;

import java.util.Scanner;

public class Fibonacci_facil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1, i = 0;
		int n = sc.nextInt();

		do {
			if (i == n-1)
				System.out.println(n1);
			else {
				System.out.printf("%d ", n1);
				int aux = n1;
				n1 = n2;
				n2 = aux + n1;
			}
			i++;
		} while (i < n);

		sc.close();
	}

}
