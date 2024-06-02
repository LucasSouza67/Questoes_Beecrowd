package iniciante;

import java.util.Scanner;

public class Sequencia_E_Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, soma = 0, i, valores[] = new int[100];

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		while (n1 > 0 && n2 > 0) {
			if (n1 > n2) {
				int aux = n1;
				n1 = n2;
				n2 = aux;
			}

			for (i = n1; i <= n2; i++) {
				valores[i] = i;
				soma += i;
			}

			for (i = n1; i <= n2; i++)
				System.out.print(valores[i]+" ");
			
			System.out.println("Sum=" + soma);

			soma = 0;

			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		
		sc.close();

	}

}
