package euler;


public class Problem6 
{	
	public static long squareOfSums(long n) 
	{
		return (long)Math.pow(((n*(n+1))/2),2);
	}
	
	public static long sumOfSquares(long n) 
	{
		return n*(n+1)*(2*n+1)/6;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + (sumOfSquares(100)-squareOfSums(100)));
	}
}
