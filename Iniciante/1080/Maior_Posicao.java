package iniciante;

import java.util.Scanner; 

public class Maior_Posicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int valores[] = new int[100], i, maior = Integer.MIN_VALUE, p = 0;
		
		for (i = 0; i < 3; i++) {
			valores[i] = sc.nextInt();
			
			if (valores[i] > maior) {
				maior = valores[i];
				p = i+1;
			}
				
		}
		
		System.out.printf("%d\n%d\n", maior, p);
		
		sc.close();

	}

}
