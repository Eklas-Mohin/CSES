import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Repititions {

    public static int longestRepititionsLength(String str) {
        int maxLength = 1, temp = 1;
        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                temp = temp + 1;
            } else {
                temp = 1;
            }
            maxLength = Math.max(maxLength, temp);
        }
        return maxLength;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        String seqOfDNA = reader.readLine();
        int maxLength = longestRepititionsLength(seqOfDNA);

        writer.println(maxLength);

        writer.flush();
    }
}
