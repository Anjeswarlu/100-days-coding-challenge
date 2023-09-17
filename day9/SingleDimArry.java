import java.io.*;

public class SingleDimArry {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int marks[] = new int[5];
		for(int i=0;i<5;i++)
		{
			marks[i]=Integer.parseInt(br.readLine());
		}
		for(int j=0;j<5;j++)
		{
			System.out.println(marks[j]);
		}
	}

}
