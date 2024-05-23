package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoDeSlaario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		double novoSalario = 0, aumento = 0;
		int percentual = 0;

		if (salario <= 400.0) {
			percentual = 15;
		} else if (salario > 400.0 && salario <= 800.0) {
			percentual = 12;
		} else if (salario > 800.0 && salario <= 1200.0) {
			percentual = 10;
		} else if (salario > 1200.0 && salario <= 2000.0) {
			percentual = 7;
			aumento = salario * percentual;
		} else {
			percentual = 4;
		}

		DecimalFormat convert = new DecimalFormat("0.00");

		aumento = salario * percentual / 100;
		novoSalario = salario + aumento;

		System.out.println("Novo salario: "+convert.format(novoSalario));
		System.out.println("Reajuste ganho: "+convert.format(novoSalario - salario));
		System.out.println("Em percentual: " + percentual + " %");

		sc.close();
	}

}
