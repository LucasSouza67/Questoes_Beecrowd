package iniciante;

import java.util.Scanner;

public class Pares_Entre_Cinco_Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, qtdPares = 0, num;

		for (i = 0; i < 5; i++) {
			num = sc.nextInt();

			if (num % 2 == 0)
				qtdPares++;
		}
		
		System.out.println(qtdPares+" valores pares");
		
		sc.close();
	}

}
