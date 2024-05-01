package iniciante;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		double A, B; 
		
		Scanner sc = new Scanner(System.in); 
		A = sc.nextDouble(); 
		B = sc.nextDouble();
		double media = (A * 3.5 + B * 7.5)/11;
		
		System.out.printf("MEDIA = %.5f", media);
		sc.close();

	}

}
