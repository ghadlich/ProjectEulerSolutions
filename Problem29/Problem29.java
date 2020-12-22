package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


public class Problem29
{

	public static void main(String args[])
	{
		Set<String> uniqueNumbers = new HashSet<>();
		
		for (long a = 2; a <= 100; a++)
		{
			for (int b = 2; b <= 100; b++)
			{
				uniqueNumbers.add(BigInteger.valueOf(a).pow(b).toString());
			}
		}
		
		System.out.println("Solution: " + uniqueNumbers.size());
	}
	
}
