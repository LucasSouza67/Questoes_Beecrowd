package iniciante;
import java.util.Scanner; 

public class Consumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia; 
		double litros, consumo; 
		
		distancia = sc.nextInt();
		litros = sc.nextDouble();
		
		consumo = distancia/litros; 
		
		System.out.printf("%.3f Km/l", consumo);
		
		sc.close();
	

	}

}
