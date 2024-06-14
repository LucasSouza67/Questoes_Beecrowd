package iniciante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Sequencia_Crescente  {

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int x;
        while (true) {
            x = Integer.parseInt(reader.readLine().trim());
            if (x == 0) {
                break;
            }
            for (int i = 1; i <= x; i++) {
                if (i != x) {
                    writer.write(i + " ");
                } else {
                    writer.write(i + "\n");
                }
            }
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
