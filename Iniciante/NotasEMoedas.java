package iniciante;
import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorLido, moeda1, moeda5, moeda25, moeda05, moeda10, moeda01;
		int cedula100, cedula50, cedula20, cedula5, cedula10, cedula2; 
		
		valorLido = sc.nextDouble();
		sc.close();
		
		int valor = (int) valorLido; 
				
		cedula100 = valor / 100; 
		valor %= 100;
		
		cedula50 = valor / 50; 
		valor %= 50; 
		
		cedula20 = valor /20; 
		valor %= 20; 
		
		cedula10 = valor / 10; 
		valor %= 10; 
		
		cedula5 = valor / 5; 
		valor %= 5; 
		
		cedula2 = valor / 2; 
		valor %= 2; 
		
		moeda1 = valor; 
		
		int parteDecimal = (int) Math.round((valorLido - (int) valorLido) * 100);
        moeda5 = parteDecimal / 50;
        parteDecimal %= 50;
        moeda25 = parteDecimal / 25;
        parteDecimal %= 25;
        moeda10 = parteDecimal / 10;
        parteDecimal %= 10;
        moeda05 = parteDecimal / 5;
        parteDecimal %= 5;
        moeda01 = parteDecimal;
		
		
		System.out.println("NOTAS:");
		System.out.println(cedula100+" nota(s) de R$ 100.00");
		System.out.println(cedula50+" nota(s) de R$ 50.00");
		System.out.println(cedula20+" nota(s) de R$ 20.00");
		System.out.println(cedula10+" nota(s) de R$ 10.00");
		System.out.println(cedula5+" nota(s) de R$ 5.00");
		System.out.println(cedula2+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.printf("%.0f moeda(s) de R$ 1.00", moeda1);
		System.out.printf("\n%.0f moeda(s) de R$ 0.50", moeda5);
		System.out.printf("\n%.0f moeda(s) de R$ 0.25", moeda25);
		System.out.printf("\n%.0f moeda(s) de R$ 0.10", moeda10);
		System.out.printf("\n%.0f moeda(s) de R$ 0.05", moeda05);
		System.out.printf("\n%.0f moeda(s) de R$ 0.01", moeda01);
	}

}
