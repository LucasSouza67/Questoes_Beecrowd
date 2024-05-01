package iniciante;
import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in); 
		
		double pi = 3.14159, raio, area;
		
		raio = sc.nextDouble();
		
		area = 4.0/3.0 * pi * Math.pow(raio, 3); 
		
		System.out.printf("VOLUME = %.3f", area);
		sc.close();

	}

}
