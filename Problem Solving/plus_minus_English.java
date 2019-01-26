import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class plus_minus_English {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int size = arr.length;
        float positive = 0;
        float negative = 0;
        float zero = 0;
        for (int array : arr) {
          if (array > 0) {
            positive++;
          } else if (array < 0) {
            negative++;
          } else {
            zero++;
          }
        }
        
        System.out.println(positive / size);
        System.out.println(negative / size);
        System.out.println(zero / size);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

