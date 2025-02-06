package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TrocaEmVetor1 {

	public static void main(String[] args) throws IOException {

		final int vet_size = 20;
		int N[] = new int[vet_size];
		int i;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		for (i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(in.readLine().trim());
		}

		for (i = 0; i < N.length / 2; i++) {
			int aux = N[i];
			N[i] = N[N.length - 1 - i];
			N[N.length - 1 - i] = aux;
		}

		for (i = 0; i < N.length; i++) {
			out.write("N[" + i + "] = " + N[i] + "\n");
		}

		in.close();
		out.close();

	}

}
