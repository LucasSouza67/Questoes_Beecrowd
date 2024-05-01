/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
package iniciante;
import java.util.Scanner; 

public class Areas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		double A, B, C; 
		double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159; 
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C /2;
		circulo  = pi * Math.pow(C, 2);
		trapezio = (A + B) * C;
		quadrado = Math.pow(B, 2);
		retangulo = A * B; 
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		sc.close();

	}

}
