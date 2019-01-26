import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class mini_max_sum_English {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long ascList = IntStream.of(arr)
            .boxed()
            .sorted()
            .mapToLong(Integer::intValue).limit(4).sum();
    
        long descList = IntStream.of(arr)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToLong(Integer::intValue).limit(4).sum();

        System.out.println(ascList + " " + descList);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

