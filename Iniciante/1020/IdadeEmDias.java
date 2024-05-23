package iniciante;
import java.util.Scanner; 

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeDia, idadeAno, idadeMes;

		idadeDia = sc.nextInt();
		int dias = idadeDia;
		
		sc.close();
		
		idadeAno = dias / 365;
		dias -= idadeAno * 365; 
		
		idadeMes = dias / 30; 
		dias -= idadeMes * 30; 
		
		idadeDia = dias; 
		
		System.out.println(idadeAno+" ano(s)");
		System.out.println(idadeMes+" mes(s)");
		System.out.println(idadeDia+" dia(s)");
		
	}

}
