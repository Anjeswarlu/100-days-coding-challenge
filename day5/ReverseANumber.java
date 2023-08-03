
public class ReverseANumber {

	public static void main(String[] args) {
		int num=139;
		int m=0;
		System.out.println("before reversing the number:"+" "+num);
		for(int i=1;num>0;i++)
		{
		 m=num%10;
			System.out.print(m);
			num=num/10;
		}
		

	}


}
