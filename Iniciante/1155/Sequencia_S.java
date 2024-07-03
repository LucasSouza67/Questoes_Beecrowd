package iniciante;

public class Sequencia_S {

	public static void main(String[] args) {
		int i;
		double soma = 0;
		
		for (i = 1; i <= 100; i++) {
			soma += 1.0/i;
		}
		
		System.out.printf("%.2f%n", soma);
		

	}

}
