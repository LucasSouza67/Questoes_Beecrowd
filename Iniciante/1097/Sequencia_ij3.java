package iniciante;

public class Sequencia_ij3 {

	public static void main(String[] args) {
		int i = 1, j = 7;
		int k; 

		for (i = 1; i <= 9; i += 2) {
			for (k = 0; k < 3; k++) {
				System.out.printf("I=%d J=%d\n", i, j);
				j--;
			}
			j+=5;
		}

	}

}
