package iniciante;

public class Sequencia_ij4 {

	public static void main(String[] args) {
		float i; 
		int j; 
		for (i = 0; i <= 2.01; i += 0.2){
            for (j = 1; j < 4; j ++){
                if (i == 0 || i == 1 || i >= 2){
                    System.out.printf("I=%.0f J=%.0f\n", i, j+i);
                }
                else{
                    System.out.printf("I=%.1f J=%.1f\n", i, j+i);
                }
            }
        }

	}

}
