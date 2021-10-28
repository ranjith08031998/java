package prime;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
boolean flag=true;
for(int i=2;i<n/2;i++) {
	if(n%i==0) {
		flag=false;
		System.out.println("num is not a prime");
		break;
		
	}
}
if(flag) System.out.println("num is a prime");
	}

}
