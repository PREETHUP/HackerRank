import java.io.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class comapre_the_triplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b ) {
		List<Integer> result1 = new ArrayList<>();
		int aScore = (a.get(0)>b.get(0)?1:0) + (a.get(1)>b.get(1)?1:0) + (a.get(2)>b.get(2)?1:0); 
		int bScore = (a.get(0)<b.get(0)?1:0) + (a.get(1)<b.get(1)?1:0) + (a.get(2)<b.get(2)?1:0);
		result1.add( aScore );
		result1.add( bScore );
		return result1; 
	}

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			BufferedWriter bw = new BufferedWriter( new FileWriter( "/tmp/test.txt" ));
			List<Integer> a = Stream.of( br.readLine()
					.replaceAll( "\\s+$", "" )
					.split(" "))
					.map(Integer::parseInt)
					.collect(toList() );
       			List<Integer> b = Stream.of( br.readLine()
					.replaceAll("S.", "")
					.split(" "))
            				.map(Integer::parseInt)
            				.collect(toList());
			List<Integer> result =  compareTriplets( a, b);
			bw.write( result.stream()
				.map( Object::toString )
				.collect( joining( " " ) ) 
				+ "\n" );
			br.close();
			bw.close();
 		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

