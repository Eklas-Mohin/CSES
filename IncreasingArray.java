import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IncreasingArray {

    public static long countMinMoves(int n, int[] arr) {
        long minMoves = 0;
        for (int i = 1; i < n; ++i) {
            if (arr[i] < arr[i - 1]) {
                minMoves += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        return minMoves;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());
        String[] inputLine = reader.readLine().split(" ");
        int inputArray[] = new int[n];
        for (int i = 0; i < n; ++i) {
            inputArray[i] = Integer.parseInt(inputLine[i]);
        }
        long minMoves = countMinMoves(n, inputArray);

        writer.println(minMoves);

        writer.flush();
    }
}
