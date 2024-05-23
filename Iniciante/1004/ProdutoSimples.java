package iniciante;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int produto = A * B;

		System.out.println("PROD = " + produto);

		sc.close();

	}

}
