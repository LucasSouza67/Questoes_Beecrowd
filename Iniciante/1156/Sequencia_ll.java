// S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/? 
// S = x / y + (x+2)/y*2
package iniciante;

public class Sequencia_ll {

	public static void main(String[] args) {
		int x = 1, y = 1;
		double soma = 0.0;
		
		while( x <= 39) {
			soma += (double) x/y;
			y*=2;
			x+=2;
		}
		
		System.out.printf("%.2f%n", soma);
		

	}

}
