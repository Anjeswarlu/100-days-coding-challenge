
public class Pattern {

	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n;j++)
			{
			
				System.out.print(" ");
				
				count++;
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
				
		}
		System.out.println(" count is " + " " +count);
	}

}
