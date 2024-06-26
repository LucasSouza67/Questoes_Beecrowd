package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double a, b, c;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			double perimetro = a + b + c;
			System.out.println("Perimetro = " + df.format(perimetro));
		} else {
			double area = ((a + b) * c) / 2;
			System.out.println("Area = " + df.format(area));
		}
		sc.close();
	}

}
