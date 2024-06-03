package iniciante;

import java.util.Scanner;

public class Dividindo_X_por_Y {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int leituras, x, y, i;
		float quociente;

		leituras = sc.nextInt();

		for (i = 0; i < leituras; i++) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				quociente = (float) x / y;
				System.out.printf("%.1f\n", quociente);
			}
		}
		
		sc.close();

	}

}
