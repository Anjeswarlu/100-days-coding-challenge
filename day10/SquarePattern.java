import java.io.*;
public class SquarePattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n value:");
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		
	}

}
