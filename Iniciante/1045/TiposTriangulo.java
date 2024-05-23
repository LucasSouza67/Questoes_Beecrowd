package iniciante;

import java.util.Scanner;
import java.util.Arrays;

public class TiposTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valores[] = new double[3];
		int i;
		double A = 0, B = 0, C = 0;

		for (i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
		}

		Arrays.sort(valores);

		A = valores[2];
		B = valores[1];
		C = valores[0];
		if (A >= B + C)
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if (A * A == B * B + C * C)
				System.out.println("TRIANGULO RETANGULO");
			if (A * A > B * B + C * C)
				System.out.println("TRIANGULO OBTUSANGULO");
			if (A * A < B * B + C * C)
				System.out.println("TRIANGULO ACUTANGULO");
			if (valores[0] == valores[1] && valores[1] == valores[2])
				System.out.println("TRIANGULO EQUILATERO");
			if (valores[0] == valores[1] && valores[0] != valores[2] && valores[2] != valores[1])
				System.out.println("TRIANGULO ISOSCELES");
			if (valores[1] == valores[2] && valores[0] != valores[1] && valores[0] != valores[2])
				System.out.println("TRIANGULO ISOSCELES");
			if (valores[0] == valores[2] && valores[2] != valores[1] && valores[0] != valores[1])
				System.out.println("TRIANGULO ISOSCELES");
		}

		sc.close();
	}

}
