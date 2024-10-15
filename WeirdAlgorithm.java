import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WeirdAlgorithm {

    public static String collatzConjecture(int n) {
        String collatzSequence = "";

        while (n > 1) {
            collatzSequence += Integer.toString(n) + ' ';
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        collatzSequence += Integer.toString(n);

        return collatzSequence;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());
        String collatzSequence = collatzConjecture(n);
        writer.println(collatzSequence);

        writer.flush();
    }
}
