package iniciante;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int golGremio, golInter, vitoriaG = 0, vitoriaI = 0, opcao, jogos = 0, empate;

		golInter = sc.nextInt();
		golGremio = sc.nextInt();

		if (golGremio > golInter)
			vitoriaG++;
		else if (golGremio < golInter)
			vitoriaI++;

		do {
			System.out.println("Novo grenal (1-sim 2-nao)");
			opcao = sc.nextInt();

			if (opcao == 1) {
				golInter = sc.nextInt();
				golGremio = sc.nextInt();

				if (golGremio > golInter)
					vitoriaG++;
				else if (golGremio < golInter)
					vitoriaI++;

				jogos++;
			}
		} while (opcao != 2);

		empate = (jogos - (vitoriaI + vitoriaG))+1;
		System.out.printf("%d grenais\n", jogos + 1);
		System.out.println("Inter:" + vitoriaI);
		System.out.println("Gremio:" + vitoriaG);
		System.out.println("Empates:" + empate);

		if (vitoriaI > vitoriaG)
			System.out.println("Inter venceu mais");
		else if (vitoriaI < vitoriaG)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");

		sc.close();

	}

}
