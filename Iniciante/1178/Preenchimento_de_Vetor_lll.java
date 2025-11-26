package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Preenchimento_de_Vetor_lll {
	
	public static void main(String[] args ) throws IOException {
		
		final int vet_size = 5;
		int i = 0;
		double vet[] = new double[vet_size], value = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		value = Double.parseDouble(reader.readLine().trim());
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(i < vet_size) {
			if(i == 0) {
				vet[i] = value;
			}
			else {
				vet[i] = vet[i-1]/2;
			}
			
			writer.write(String.format("N[%d] = %.4f%n", i, vet[i]));
			
			i++; 
		}
		
		writer.flush();
		reader.close();
		writer.close();
	}
}
