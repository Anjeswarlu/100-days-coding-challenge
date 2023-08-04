import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int num1= d.nextInt();
		int num2= d.nextInt();
		System.out.println("Before swapping:"+num1 + " "+ num2);

		num1=num2+num1;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swapping:"+num1 + " "+ num2);
				
	}

}
