package iniciante;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2; 
		double preco1, preco2, valorTotal; 
		
		cod1  = sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2  = sc.nextInt();
		preco2 = sc.nextDouble();
		
		valorTotal = (qtd1 * preco1) + (qtd2 * preco2);
		
		System.out.printf("VALOR TOTAL = R$ %.2f", valorTotal);
		sc.close();

	}

}
