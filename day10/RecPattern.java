import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RecPattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value:");
		int n = Integer.parseInt(br.readLine());
		System.out.println("enter l value:");
		int l = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=l;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		
	}

}

