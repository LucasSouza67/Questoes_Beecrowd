package iniciante;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco = 0;
		int codProduto = sc.nextInt();
		int qtd = sc.nextInt();

		switch (codProduto) {
		case 1:
			preco = 4;
			break;
		case 2:
			preco = 4.5;
			break;
		case 3:
			preco = 5;
			break;
		case 4:
			preco = 2;
			break;
		case 5:
			preco = 1.5;
			break;
		}

		double total = qtd * preco;

		System.out.printf("Total: R$ %.2f\n", total);

		sc.close();
	}

}
