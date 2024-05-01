package iniciante;
import java.util.Scanner; 

public class Omaior {

	public static void main(String[] args) {
		 int num, num1, num2; 
		 
		 Scanner sc = new Scanner(System.in); 
		 
		 num = sc.nextInt() ; 
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 
		 int aux = (num + num1 + Math.abs(num - num1))/2; 
		 
		 int maior = (aux + num2 + Math.abs(aux - num2))/2;
		 
		 System.out.println(maior +" eh o maior\n");
		 
		 sc.close();

	}

}
