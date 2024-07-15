package iniciante;

import java.util.Scanner;

public class Divisores1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			int div = num % i;
			if (div == 0)
				System.out.println(i);
			i++;
		}

		sc.close();

	}

}
