import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingAString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a name:");
		String name = br.readLine();
		System.out.print("you enter the name:"+name);
		
		
	}

}
