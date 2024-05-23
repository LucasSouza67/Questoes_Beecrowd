package iniciante;
import java.util.Scanner; 

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double valorHora;
		int numFunc, numHora; 
		
		numFunc = sc.nextInt(); 
		numHora = sc.nextInt();
		valorHora = sc.nextDouble();
		
		double salario = valorHora * numHora; 
		
		System.out.printf("NUMBER = %d\nSALARY =  U$ %.2f\n", numFunc, salario);
		sc.close();
	}
}
