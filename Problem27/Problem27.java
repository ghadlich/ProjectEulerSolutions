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
