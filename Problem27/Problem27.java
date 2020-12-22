package euler;
import java.math.BigInteger;





public class Problem27 
{
	
	public static int maxConsecutivePrimes(long a, long b)
	{
		int consecutivePrimes = 0;
		for (int i = 0;; i++)
		{
			if ((i*i+a*i+b > 0) &&BigInteger.valueOf(i*i+a*i+b).isProbablePrime(100))
			{
				consecutivePrimes++;
			}
			else
			{
				return consecutivePrimes;
			}
		}
	}

	public static void main(String[] args)
	{	
		long max = 0, product = 0;
		
		for (int a = -999; a < 1001; a+=2)
		{
			for (int b = 3; b < 1001; b+=2)
			{
				if (BigInteger.valueOf(b).isProbablePrime(100))
				{
					if (1+a+b > 0 && BigInteger.valueOf(1+a+b).isProbablePrime(100))
					{
						int num = maxConsecutivePrimes(a,b);
						if (num > max)
						{
							product = a*b;
							max = num;
							System.out.println("n^2 " + a + "n + " + b +" : " + max);
						}
					}
				}
			}
		}
		

		System.out.println("Solution: " +  product);
		System.out.println("Max: " +  max);
		
	}
}
