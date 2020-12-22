package euler;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;



public class Problem10 
{
	
	public static List<Long> primeNumbers = new ArrayList<>();
	
	public static void findPrimesLessThan(int n)
	{
		primeNumbers.add(2l);
		
		for (long i = 3l;i < n; i+=2)
		{
			if (BigInteger.valueOf(i).isProbablePrime(100))
			{
				primeNumbers.add(i);
			}
		}
	}
	
	public static long sumPrimes(int max)
	{
		findPrimesLessThan(max);
		
		long sum = 0;
		
		for (Long l : primeNumbers)
		{
			sum += l;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + sumPrimes(2000000));
	}
}
