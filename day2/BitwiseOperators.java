
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		System.out.println(~i);
		int a,b;
		a=50;
		b=70;
		System.out.printf("%s\n",Integer.toBinaryString(b));
		System.out.printf("%s\n",Integer.toBinaryString(a));
		System.out.printf("%s\n",Integer.toBinaryString(118));
		System.out.println((a|b));
		System.out.println((a&b));
		System.out.println((a^b));
		System.out.println((a>>2));
		System.out.println((b<<2));
		System.out.println((i>>>1));

		
	} 
}             
