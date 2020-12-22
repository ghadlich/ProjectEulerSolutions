package euler;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Problem7 
{
	public static List<Long> primeNumbers = new ArrayList<>();
	
	public static long findNthPrime(int n)
	{
		primeNumbers.add(2l);
		
		for (long i = 3l;primeNumbers.size() < n; i+=2)
		{
			if (BigInteger.valueOf(i).isProbablePrime(100))
			{
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers.get(n-1);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + findNthPrime(10001));
	}
}
