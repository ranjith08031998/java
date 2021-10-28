package Training;
import java.util.*;
public class CubeofNDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n!=0)
		{
			int r=n%10;
			c= c+(r*r*r);
			n=n/10;
		}
		
		System.out.println("Cube of the digits is "+ c);
	}

}
