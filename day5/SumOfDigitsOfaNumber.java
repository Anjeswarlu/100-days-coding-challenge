
public class SumOfDigitsOfaNumber {

	public static void main(String[] args) {
		int num=153;
		int r=0;
		int a=0;
		System.out.println("number before reversing:" +" "+num);
		while(num>0)
		{
			 r=num%10;
			
			a+=r;
			 num=num/10;
			
		}
		System.out.println(a);
	}

}
