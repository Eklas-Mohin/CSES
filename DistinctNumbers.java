import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class DistinctNumbers {

    public static int countDistinctNumbers(int n, int[] nums) {
        HashSet<Integer> distinctNums = new HashSet<>();
        for (int num : nums) {
            distinctNums.add(num);
        }
        return distinctNums.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int n = Integer.parseInt(reader.readLine());
        int[] nums = new int[n];
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < n; ++i) {
            nums[i] = Integer.parseInt(input[i]);
        }

        writer.println(countDistinctNumbers(n, nums));

        writer.flush();
    }
}
