package square;

public class SquareofnNumber {
	static int squaresum(int n)
    {
        // Iterate i from 1 and n
        // finding square of i and add to sum.
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
        System.out.println(squaresum(n));
	}

}
