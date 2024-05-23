package iniciante;
import java.util.Scanner; 

public class NumeroDeCedulas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int notas100, notas50, notas20, notas10, notas5, notas2, notas1;
		 int valorInicial = sc.nextInt();
		 int valor = valorInicial;
		 notas100 = valor/100;
		 valor -= notas100 * 100; 
		 
		 notas50 = valor/50;
		 valor -= notas50 * 50;
		 
		 notas20 = valor/20;
		 valor -= notas20 *20;
		 
		 notas10 = valor/10;
		 valor -= notas10 *10;
		 
		 notas5 = valor/5;
		 valor -= notas5 * 5;
		 
		 notas2 = valor/2;
		 valor -= notas2 * 2;
		 
		 notas1 = valor;
		 
		 System.out.println(valorInicial);
		 System.out.println(notas100+" nota(s) de R$ 100,00");
		 System.out.println(notas50+" nota(s) de R$ 50,00");
		 System.out.println(notas20+" nota(s) de R$ 20,00");
		 System.out.println(notas10+" nota(s) de R$ 10,00");
		 System.out.println(notas5+" nota(s) de R$ 5,00");
		 System.out.println(notas2+" nota(s) de R$ 2,00");
		 System.out.println(notas1+" nota(s) de R$ 1,00");
		 sc.close();
	}

}
