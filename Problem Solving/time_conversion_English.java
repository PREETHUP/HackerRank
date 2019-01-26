import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class time_conversion_English {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) throws ParseException {

      SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
      SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
      Date date = parseFormat.parse(s);
      String display = displayFormat.format(date);
      return display;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/tmp/test.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}













