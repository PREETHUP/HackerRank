import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class review_loop_English {
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    int count = scanner.nextInt();
    String[] arItems = new String[count];
    for (int i = 0; i < count; i++) {
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       arItems[i] = scanner.nextLine();
    }

    ArrayList str = new ArrayList();
    StringBuilder evenStringBuilder = null;
    StringBuilder oddStringBuilder = null;
    for (String line : arItems) {
      String[] lines = line.split("");
      evenStringBuilder = new StringBuilder();
      oddStringBuilder = new StringBuilder();
      for (int i = 0; i < lines.length; i++) {
        if (i % 2 == 0) {
          evenStringBuilder.append(lines[i]);
        } else {
          oddStringBuilder.append(lines[i]);
        }
      }
      str.add( evenStringBuilder + " " + oddStringBuilder);
    }
    Arrays.stream(str.toArray()).forEach(System.out::println);

  }
}