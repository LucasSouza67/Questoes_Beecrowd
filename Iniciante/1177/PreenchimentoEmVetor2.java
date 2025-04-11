package iniciante;

import java.util.Scanner;

public class PreenchimentoEmVetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int tam = 1000;
		int vet[] = new int[tam], i, u = 0;
		
		int t = sc.nextInt();
		
		while(u < vet.length) {
			for (i = 0; i < t && u < vet.length; i++) {
				vet[u] = i;
				System.out.println("N["+u+"] = "+vet[u]);
				u++;
			}
		}

        sc.close();

	}

}
