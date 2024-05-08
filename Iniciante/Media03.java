package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double nota1, nota2, nota3, nota4, media;
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		nota4 = sc.nextDouble();

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

		System.out.println("Media: " + df.format(media));
		if (media >= 7)
			System.out.println("Aluno aprovado.");
		else if (media >= 5 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double notaExame = sc.nextDouble();
			double mediaFinal = (media + notaExame) / 2;
			System.out.println("Nota do exame: " + df.format(notaExame));
			if (mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format(mediaFinal));
			} else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + df.format(mediaFinal));
			}

		} else {
			System.out.println("Aluno reprovado.");
		}

		sc.close();

	}
}
