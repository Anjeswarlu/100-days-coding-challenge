
public class LogicalOperators {

	public static void main(String[] args) {
		int a=40;
		int b=20;
		int c=10;
		if(((a>b)&&(a>c)))
		{
			System.out.println("a is big");
		}
		if((a>b)||(b<c))
		{
			System.out.println("this is or operator");
		}
		if(a!=b)
		{
			System.out.println("yes");
		}
	}

}
