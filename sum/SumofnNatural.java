package sum;

public class SumofnNatural {
	static int sum(int N)
	{
	    int S1, S2, S3;
	 
	    S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;
	    S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;
	    S3 = ((N / 12)) * (2 * 12 + (N / 12 - 1) * 12) / 2;
	 
	    return S1 + S2 - S3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 20;
		 
	    System.out.print(sum(12));
	}

}
