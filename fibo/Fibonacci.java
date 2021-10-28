package fibo;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("enter range: ");
int n=scn.nextInt();
int m=scn.nextInt();
int a=0,b=1,c;
while(a<=m) {
	if(a>=n)
		System.out.print(a+ "\t");
	c=a+b;
	a=b;
	b=c;
	
		
}
	}

}
