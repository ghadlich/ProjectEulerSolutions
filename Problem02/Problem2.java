package euler;
import java.util.HashSet;
import java.util.Set;


public class Problem2 
{
	public static long createEvenFibonacciSum(int max)
	{
		Set<Integer> setOfEvenFibs = new HashSet<>();
		
		int prev1 = 1, prev2 = 1;

		while(true)
		{
			int fibNumber = prev1 + prev2;
			prev2 = prev1;
			prev1 = fibNumber;
			
			if (fibNumber >= max)
			{
				break;
			}
			
			if (fibNumber %2 == 0)
			{
				setOfEvenFibs.add(fibNumber);
			}
			
		}
		
		long sum = 0;
		
		for (Integer i : setOfEvenFibs)
		{
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + createEvenFibonacciSum(4000000));
	}
}
