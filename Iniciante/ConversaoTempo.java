package iniciante;
import java.util.Scanner; 

public class ConversaoTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundos, minutos, horas; 
		 segundos = sc.nextInt();
		 
		 int n = segundos; 
		 
		 horas = n / 3600; 
		 n -= horas * 3600;
		 
		 minutos = n / 60;
		 n -= minutos * 60;
		 
		 segundos = n;
		 
		System.out.println(horas+":"+minutos+":"+segundos);
		sc.close();

	}

}
