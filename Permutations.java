import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Permutations {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());

        if (n > 1 && n < 4) {
            writer.println("NO SOLUTION");
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                result.append(i).append(' ');
            }
            for (int i = 1; i <= n; i += 2) {
                result.append(i).append(' ');
            }
            writer.println(result);
        }

        writer.flush();
    }
}