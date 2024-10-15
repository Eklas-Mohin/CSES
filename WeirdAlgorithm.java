import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WeirdAlgorithm {

    public static String collatzConjecture(long n) {
        StringBuilder collatzSequence = new StringBuilder();

        while (n > 1) {
            collatzSequence.append(n).append(' ');
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        collatzSequence.append(n);
        
        return collatzSequence.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        long n = Long.parseLong(reader.readLine());
        String collatzSequence = collatzConjecture(n);
        writer.println(collatzSequence);

        writer.flush();
    }
}
                          
/*************************** Alternative Solutions ******************************                                                

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WeirdAlgorithm {

    public static String collatzConjecture(long n) {
        String collatzSequence = "";

        while (n > 1) {
            collatzSequence += Long.toString(n) + ' ';
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        collatzSequence += Long.toString(n);

        return collatzSequence;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        long n = Long.parseLong(reader.readLine());
        String collatzSequence = collatzConjecture(n);
        writer.println(collatzSequence);

        writer.flush();
    }
}

***************************************************************************************

import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            while (n > 1) {
                System.out.print(n + ' ');
            }
            System.out.println(n);
        }
    }
}

*****************************************************************************************/
