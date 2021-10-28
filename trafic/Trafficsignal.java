package trafic;
import java.util.*;
public class Trafficsignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("select your choice: Red, Yellow or Green");
		String colour=sc.next();
		
		switch(colour)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Wrong choice");
		}
	}
	}

