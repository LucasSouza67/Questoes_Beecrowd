package iniciante;
import java.util.Scanner; 

public class SalrioCombonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double salario = salarioFixo + vendas * 0.15;
		System.out.println("NOME: "+nome);
		System.out.printf("TOTAL = R$ %.2f\n", salario);
		sc.close();
	}

}
