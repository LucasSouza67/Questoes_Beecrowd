package iniciante;
import java.util.Scanner; 

public class GastoCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int tempo, velocidadeMed; 
		int consumoMed = 12; 
		
		tempo = sc.nextInt();
		velocidadeMed = sc.nextInt();
		// velocidae media = distancia / tempo -> distancia = velociade media * tempo 
		
		double distancia = velocidadeMed * tempo; 
		
		double consumo = distancia / consumoMed; 
		
		System.out.printf("%.3f\n", consumo);
		
		sc.close();

	}

}
