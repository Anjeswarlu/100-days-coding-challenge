import java.util.Scanner;

public class LeapyearorNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in );
		int a=sc.nextInt();
		if(a%4==0&&a%400==0) {
			System.out.println("given year is leap year");
			
		}
		else
		{
			System.out.println("given year is not a leap year");
		}
		sc.close();
	}

}
