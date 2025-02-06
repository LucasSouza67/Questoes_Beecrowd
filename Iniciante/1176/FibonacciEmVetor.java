package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FibonacciEmVetor {

	public static void main(String[] args) throws IOException {
		
		final int vet_size = 20;
		int vet[] = new int[vet_size];
		int i;
		
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(inp.readLine().trim());
		
		for (i = 0; i < n; i++) {
			int value = Integer.parseInt(inp.readLine().trim());
		}

		

		inp.close();
		out.close();

	}

}
