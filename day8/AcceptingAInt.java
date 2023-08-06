import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class AcceptingAInt {

	public static void main(String[] args) throws IOException{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//			String str = br.readLine();
			System.out.println("enter an int value:");
			int i=Integer.parseInt(br.readLine());
			System.out.println("enter an float value:");
			float f=Float.parseFloat(br.readLine());
			System.out.println("enter an double value:");

			double d=Double.parseDouble(br.readLine());
			System.out.println("enter an long value:");
			
			
			long l=Long.parseLong(br.readLine());


			System.out.println("entered integer value:"+i);
			
			System.out.println("entered float value:"+f);
			System.out.println("entered double value:"+d);
			System.out.println("entered long value:"+l);
	}

}
