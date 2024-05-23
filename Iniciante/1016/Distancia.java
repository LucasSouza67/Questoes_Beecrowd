package iniciante;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// vm = variação de distancia  / variação de tempo
		// 60 km/h = entrada/saida -> saida = entrada / velocidade media -> saida em minutos 
		
		double velocidadeX = 60, velocidadeY = 90, tempo; 
		int distancia; 
		distancia = sc.nextInt();
		
		double velocidade = velocidadeY - velocidadeX;
		
		tempo = (distancia/velocidade) * 60;
		
		System.out.printf("%.0f minutos\n", tempo);
		sc.close();
	}

}
