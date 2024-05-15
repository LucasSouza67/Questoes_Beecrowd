package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");

		double valor = sc.nextDouble();

		if (valor <= 2000)
			System.out.println("Isento");
		else if (valor <= 3000.00) {
			valor -= 2000.00;
			valor *= 0.08;
			System.out.println("R$ " + dc.format(valor));
		} else if (valor <= 4500.00) {
			valor -= 3000.00;
			valor *= 0.18;
			valor += 1000 * 0.08;
			System.out.println("R$ " + dc.format(valor));
		} else {
			valor -= 4500.00f;
			valor *= 0.28;
			valor += 1000 * 0.08;
			valor += 1500 * 0.18;
			System.out.println("R$ " + dc.format(valor));
		}

		sc.close();
	}

}
