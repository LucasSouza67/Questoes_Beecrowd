package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Preenchimento_de_vetor_IV {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		final int size = 5; 
		int i, vetPar[] = new int[size], vetImpar[] = new int[size], value = 0, nPar = 0, nImpar = 0;
		
		for(i = 0; i < 15; i++) {
			
			value = Integer.parseInt(reader.readLine().trim());
			
			if(value % 2 == 0) {
				vetPar[nPar] = value;
				nPar++;
				
				if (nPar == 5) {
					for(int j = 0; j < vetPar.length; j++) {
						writer.write(String.format("par[%d] = %d%n", j, vetPar[j]));
					}
					nPar = 0;
				}
			}
			else {
				vetImpar[nImpar] = value;
				nImpar++;
				
				if (nImpar == 5) {
					for(int j = 0; j < vetImpar.length; j++) {
						writer.write(String.format("impar[%d] = %d%n", j, vetImpar[j]));
					}
					nImpar = 0;
				}
			}
		}
		
        for (int j = 0; j < nImpar; j++) {
            writer.write(String.format("impar[%d] = %d%n", j, vetImpar[j]));
        }

        for (int j = 0; j < nPar; j++) {
            writer.write(String.format("par[%d] = %d%n", j, vetPar[j]));
        }
		
		writer.flush();
		writer.close();
		reader.close();

	}

}
