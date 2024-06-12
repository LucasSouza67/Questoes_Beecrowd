package iniciante;

import java.util.Scanner;

public class Sequencia_logica2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, i; 
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		for (i = 1; i <= y; i++) {
			
			if (i % x == 1) {
                System.out.print(i);
            } else {
                System.out.print(" " + i);
            }
			
			if (i % x == 0)
				System.out.println(); 
		}
		
		sc.close();	
		
	}

}
