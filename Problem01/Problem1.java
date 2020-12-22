package euler;
import java.util.HashSet;
import java.util.Set;


public class Problem1 
{
	public static long sumOfThreesAndFivesBelowN(int n)
	{
		Set<Integer> setOfMultiples = new HashSet<>();
		
		for (int i = 3; i < n; i+=3)
		{
			setOfMultiples.add(i);
		}
		
		for (int i = 5; i < n; i+=5)
		{
			setOfMultiples.add(i);
		}
		
		long sum = 0;
		
		for (Integer i : setOfMultiples)
		{
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + sumOfThreesAndFivesBelowN(1000));
	}
}
