package euler;


public class Problem30 
{

	
	public static long sumOfFifthPower(long number)
	{
		long sum = 0;
		
		for (char c : String.valueOf(number).toCharArray())
		{
			long digit = c - '0';
			
			sum += digit * digit * digit * digit * digit;
			
			if (sum > number)
			{
				return 0;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{	
		long sum = 0;
		
		for (long i = 2; i < 200000; i++)
		{
			if (i == sumOfFifthPower(i)) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("Solution: " + sum);
		
		
	}
	
}
