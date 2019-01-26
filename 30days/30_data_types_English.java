import java.util.Scanner;

public class data_types_English {
  
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    
    Scanner scan = new Scanner(System.in);
    /* Declare second integer, double, and String variables. */
    int ii = 0;
    double dd = 0.0;
    String ss = null;
    
    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
    ii = scan.nextInt();
    dd = scan.nextDouble();
    ss = scan.nextLine() + scan.nextLine();
    /* Print the sum of both integer variables on a new line. */
    System.out.println(ii + i);
    /* Print the sum of the double variables on a new line. */
    System.out.println(d + dd);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
    System.out.println(s + ss);
    scan.close();
  }
}