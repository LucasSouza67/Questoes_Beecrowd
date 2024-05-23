package iniciante;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Tempo_de_um_Evento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diaInicio, diaFim, horaIni, minutoIni, segundoIni, horaFim, minutoFim, segundoFim;
		String leitura;
		char let;

		leitura = sc.next();
		diaInicio = sc.nextInt();

		horaIni = sc.nextInt();
		let = sc.next().charAt(0);
		minutoIni = sc.nextInt();
		let = sc.next().charAt(0);
		segundoIni = sc.nextInt();

		leitura = sc.next();
		diaFim = sc.nextInt();

		horaFim = sc.nextInt();
		let = sc.next().charAt(0);
		minutoFim = sc.nextInt();
		let = sc.next().charAt(0);
		segundoFim = sc.nextInt();

		/// define o momento do inicio e termino do evento 
		ChronoLocalDateTime inicio = LocalDateTime.of(2024, 5, diaInicio, horaIni, minutoIni, segundoIni);
		ChronoLocalDateTime fim = LocalDateTime.of(2024, 5, diaFim, horaFim, minutoFim, segundoFim);

		long duracaoSegundos = ChronoUnit.SECONDS.between(inicio, fim); /// tempo do evento em segundos 

		long dias = duracaoSegundos / (86400); /// segundos em dia -> 1 dia tem 86400 segundos 
		duracaoSegundos %= (86400);
		long horas = duracaoSegundos / 3600;
		duracaoSegundos %= 3600;
		long minutos = duracaoSegundos / 60;
		long segundos = duracaoSegundos % 60;

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

		sc.close();
	}

}
