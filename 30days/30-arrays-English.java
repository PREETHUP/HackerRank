import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrays_English {
  
  
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
    /* Print elements in reverse order */
    for (int i = n - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    
/*  Descending order
        Arrays.stream(arr)
        .boxed() // Converts Intstream to Stream<Integer>
        .sorted(Collections.reverseOrder()) // Method on Stream<Integer>
        .forEach(System.out::println);*/
    Collections.reverse(Arrays.asList(arrItems));
    scanner.close();
  }
}

