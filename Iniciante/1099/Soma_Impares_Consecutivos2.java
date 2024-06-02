package iniciante;

import java.util.Scanner; 

public class Soma_Impares_Consecutivos2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int leituras, n1, n2, i, soma = 0; 
		
		leituras = sc.nextInt();
		
		for(i = 0; i < leituras; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if (n1 > n2) {
				int aux = n1; 
				n1 = n2; 
				n2 = aux; 
			}
			
			for (int j = n1+1; j < n2; j++) {
				if (j%2!=0)
					soma+=j; 
			}
			System.out.println(soma);
			soma = 0; 
		}
		
		
		
		sc.close();
	}

}
