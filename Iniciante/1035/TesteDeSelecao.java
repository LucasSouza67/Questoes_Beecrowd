/*Leia 4 valores inteiros A, B, C e D. 
 * se B for maior do que C e se D for maior do que A, 
 * a soma de C com D for maior que a soma de A e B 
 *  se C e D, ambos, forem positivos 
 *  e se a variável A for par 
 *  escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 * 
 * */
package iniciante;
import java.util.Scanner; 

public class TesteDeSelecao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d; 
		boolean par = false, positivo  = false; 
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		
		int somaAB = a+b; 
		int somaCD = c+d; 
		
		if(a % 2 == 0)
			par = true; 
		if(c > 0 && d > 0)
			positivo = true; 
		
		if(b > c && d > a && somaCD > somaAB && positivo && par) {
			System.out.println("Valores aceitos");
		}else
			System.out.println("Valores nao aceitos");
	}

}
