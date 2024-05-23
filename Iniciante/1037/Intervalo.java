package iniciante;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor >= 0 && valor <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		} else if (valor > 25 && valor <= 50.0000000) {
			System.out.println("Intervalo (25,50]");
		} else if (valor > 50 && valor <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
