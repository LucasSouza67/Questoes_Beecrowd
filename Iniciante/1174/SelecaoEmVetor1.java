package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SelecaoEmVetor1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		final int vet_size = 100;
		float A[] = new float[vet_size];
		int i;
		
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter (new OutputStreamWriter(System.out));
		
		for (i = 0; i < A.length; i++) {
			A[i] = Float.parseFloat(inp.readLine().trim());
			if (A[i] <= 10)
				 out.write("A[" + i + "] = " + A[i] + "\n");
		}
		
		inp.close();
        out.close();
		
	}

}
