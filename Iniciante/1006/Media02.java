package iniciante;
import java.util.Scanner; 

public class Media02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double media = (A * 2 + B * 3 + C * 5)/10;
		System.out.printf("MEDIA = %.1f", media);
		sc.close(); 
	}

}
