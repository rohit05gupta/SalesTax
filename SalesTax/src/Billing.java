import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Billing {
	public static void main(String args[]) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		GetData b = new GetData();
		
		b.printOutput(b.getInput(reader), b);
		
	}
}
