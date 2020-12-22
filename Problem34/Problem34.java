package euler;



public class Problem34
{

	public static long[] factorialLookup = {1,1,2,6,24,120,720,5040,40320,362880};
	
	public static long factorial(int i)
	{
		return factorialLookup[i];
	}
	
	public static long factorialSum(long i)
	{
		long sum = 0;
		
		for (char c : String.valueOf(i).toCharArray())
		{
			sum += factorial(c - '0');
			
			if (sum > i)
			{
				return 0;
			}
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		long sum = 0;
		for (long i = 3; i < 1000000; i++)
		{
			if (i == factorialSum(i))
			{
				sum += i;
			}
		}
		
		System.out.println("Solution: " + sum);
	}
	
}
