
public class ComparsionFloatingPoints {

	public static void main(String[] args) {
		float o = 14.42534f;
		float t = 14.45355f;
		double a=Math.floor(o*100)/100;
		double b=Math.floor(t*100)/100;
		if(a==b)
		{
			System.out.println("both are same numbers");
		}
		else
		{
			System.out.println("both are different");
		}
	}
}
