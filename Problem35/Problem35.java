package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Problem35
{

	public static long[] factorialLookup = {1,1,2,6,24,120,720,5040,40320,362880};
	
	public static Set<String> rotations(int i)
	{
		Set<String> rotations = new LinkedHashSet<>();
		
		int rotationNumber = String.valueOf(i).length();
		String a = String.valueOf(i);
		rotations.add(a);
		
		int rotationCount = 1;
		
		while (rotationNumber > rotationCount)
		{
			a = rotate(a);
			rotations.add(a);
			rotationCount++;
		}
		
		return rotations;
	}
	
	private static String rotate(String i) 
	{
		String s = String.valueOf(i);
		
		if (s.length() == 1)
		{
			return i;
		}
		else
		{
			return s.substring(1, s.length()) + s.substring(0, 1);
		}
	}

	public static void main(String args[])
	{
		Set<String> circularPrimes = new HashSet<>();
		
		circularPrimes.add("2");
		
		int count = 1;
		
		for (int i =3; i < 1000000; i+=2)
		{
			
			if (circularPrimes.contains(String.valueOf(i)))
			{
				continue;
			}
			if (BigInteger.valueOf(i).isProbablePrime(100))
			{
				boolean circular = true;
				Set<String> rotations = rotations(i);
				
				for (String a : rotations)
				{
					if (!BigInteger.valueOf(Integer.valueOf(a)).isProbablePrime(100))
					{
						circular = false;
						break;
					}
				}
				if (circular)
				{
					count++;
					circularPrimes.addAll(rotations);	
				}
			}
		}
		
		System.out.println("Solution: " + circularPrimes.size());
		System.out.println("Solution: " + count);
	}
	
}
