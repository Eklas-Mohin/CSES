import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NumberSpiral {

    public static long calculateNumber(long x, long y) {
        long num;
        if (x % 2 == 1 && x > y) {
            num = (x - 1) * (x - 1) + y;
        } else if (x % 2 == 0 && x >= y) {
            num = x * x - y + 1;
        } else if (y % 2 == 1 && y >= x) {
            num = y * y - x + 1;
        } else {
            num = (y - 1) * (y - 1) + x;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; ++i) {
            String[] line = reader.readLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);
            writer.println(calculateNumber(x, y));
        }

        writer.flush();
    }
}
