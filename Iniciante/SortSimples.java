package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeros[] = new int[3], vetorOrdem[] = new int[3];
		int i;

		for (i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
			vetorOrdem[i] = numeros[i];
		}

		Arrays.sort(vetorOrdem);

		for (i = 0; i < vetorOrdem.length; i++) {
			System.out.println(vetorOrdem[i]);
		}

		System.out.println();

		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
