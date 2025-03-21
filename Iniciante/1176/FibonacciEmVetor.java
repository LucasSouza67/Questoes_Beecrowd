package iniciante;
import java.util.Scanner;
import java.io.IOException;

public class FibonacciEmVetor {
    
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            long result = fibonacci(value);
            System.out.println("Fib(" + n + ") = " + result);
        }

        scanner.close();
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
 
}