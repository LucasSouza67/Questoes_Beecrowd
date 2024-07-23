package iniciante;

import java.util.Scanner;

public class Crescimento_Populacional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nTestes = sc.nextInt();
		int i = 0;
		while (nTestes > i) {
			int populacaoA = sc.nextInt();
			int populacaoB = sc.nextInt();
			float taxaA = sc.nextFloat();
			float taxaB = sc.nextFloat();
			int anos = 0;

			do {
				populacaoA += (int) (taxaA * populacaoA/100);
				populacaoB += (int) (taxaB * populacaoB/100);
				anos++;
				if (anos > 100)
					break;
			} while (populacaoA <= populacaoB);
			
			if (anos > 100)
				System.out.println("Mais de 1 seculo.");
			else
				System.out.println(anos + " anos.");
			i++;
		}
		sc.close();

	}

}
