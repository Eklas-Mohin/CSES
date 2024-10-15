
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MissingNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());
        String[] numList = reader.readLine().split(" ");
        long sum = 0;

        for (int i = 0; i < n - 1; ++i) {
            sum = sum + Integer.parseInt(numList[i]);
        }
        long x = (n * (n + 1)) / 2;

        writer.println(x - sum);

        writer.flush();
    }
}
