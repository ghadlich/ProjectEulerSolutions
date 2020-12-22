package euler;
import java.math.BigInteger;


public class Problem3 
{	
	public static long largestPrimeFactor(long max)
	{
		long originalMaxSqrt = (long)Math.sqrt(max);
		
		long largestFactor = 1;
		
		while ((max % 2 == 0)&&(max > 1))
		{
			max>>=1;
		}
		
		for (long i = 3; i < originalMaxSqrt && max > 1; i+=2)
		{
			if ((BigInteger.valueOf(i)).isProbablePrime(100))
			{
				while ((max % i == 0)&&(max>1))
				{
					max /= i;
					largestFactor = i;
				}
			}
		}
		
		return largestFactor;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + largestPrimeFactor(600851475143l));
	}
}
