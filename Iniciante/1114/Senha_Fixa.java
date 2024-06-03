package iniciante;

import java.util.Scanner;

public class Senha_Fixa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String senha = " ";

		do {
			senha = sc.next();

			if (senha.equals("2002")) {
				System.out.println("Acesso Permitido");
				break; 
			}
			else
				System.out.println("Senha Invalida");
		} while (senha != "2002");

		sc.close();

	}

}
