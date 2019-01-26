import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class diagonal_difference_English {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
	int size = arr[0].length;
	int lsum = 0;
	int rsum = 0;
	for(int i = 0; i<size;i++){
		for(int j=0;j<size;j++){
			if (i+j == size-1){
				rsum = rsum+arr[j][i];
			} 
			if(i==j){
			lsum = lsum + arr[i][j];
			}	
		}
	}	
	System.out.println(lsum);
	System.out.println(rsum);        
	return Math.abs(lsum-rsum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/tmp/test.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

