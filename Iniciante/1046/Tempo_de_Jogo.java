package iniciante;

import java.util.Scanner;

public class Tempo_de_Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicio, horaFim, tempo;

		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();

		if (horaInicio > horaFim)
			tempo = (24 - horaInicio) + horaFim;
		else if (horaInicio < horaFim)
			tempo = horaFim - horaInicio;
		else
			tempo = 24;

		System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);

		sc.close();

	}

}
