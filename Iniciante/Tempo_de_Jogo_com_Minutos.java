package iniciante;

import java.util.Scanner;

public class Tempo_de_Jogo_com_Minutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicio, horaFim, minInicio, minFim, hora = 0, minuto = 0;

		horaInicio = sc.nextInt();
		minInicio = sc.nextInt();
		horaFim = sc.nextInt();
		minFim = sc.nextInt();

		if(horaInicio == horaFim && minInicio == minFim) {
			hora = 24;
			minuto = 0; 
		}
		else {
			int minutosInicio = horaInicio* 60 + minInicio;
	        int minutosFim = horaFim * 60 + minFim;
			int somaminutos = (minutosFim - minutosInicio + 1440) % 1440; 
			hora = somaminutos / 60;
			minuto = somaminutos % 60;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora, minuto);

		sc.close();

	}

}
