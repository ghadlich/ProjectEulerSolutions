/* Copyright (c) 2014-2020 Grant Hadlich
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the Software), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED AS IS, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
