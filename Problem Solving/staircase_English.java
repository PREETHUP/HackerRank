import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class staircase_English {

    // Complete the staircase function below.
    static void staircase(int n) {

		String str = "#";
		for (int i = 0; i < n; i++) {
			System.out.printf("%" + (n) + "s \n", str);
			str += "#";
		}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

# Ref :  http://www.java2s.com/Code/Java/Development-Class/SystemoutprintfStringis5snA.htm
# This one used formatters
# %5s -> '    A'
# %-5s -> 'A    '
