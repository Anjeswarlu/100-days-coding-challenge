import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingASingleChar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a character:");
		char ch=(char) br.read();
		System.out.println("you entered a character:"+ch);
		
	}

}
