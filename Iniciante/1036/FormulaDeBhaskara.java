package iniciante;
import java.util.Scanner; 
public class FormulaDeBhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c; 
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		
		// x1 = (-b + raiz(b*b -4*a*c))/(2*a)
		// x2 = (-b - raiz(b*b -4*a*c))/(2*a)
		
		double delta = b * b - (4*a*c);
		
		if(a == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}else {
			double raiz = Math.sqrt(delta);
			double x1 = (-b + raiz)/(2*a);
			double x2 = (-b - raiz)/(2*a);
			
			System.out.printf("R1 = %.5f", x1);
			System.out.printf("\nR2 = %.5f\n", x2);
		}
		
	}

}
