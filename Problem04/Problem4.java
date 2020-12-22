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


public class Problem4 
{	
	public static boolean isPalindrome(long number)
	{
		return isPalindrome(String.valueOf(number));
	}
	
	public static boolean isPalindrome(String num)
	{
		char[] array = num.toCharArray();

		for (int i = 0; i < num.length()/2; i++)
		{
			if (array[i] != array[num.length()-1-i])
			{
				return false;
			}
		}

		return true;
	}
	
	
	public static long largestPalindrome()
	{
		long largest = 0;
		for (long i = 100; i < 1000; i++)
		{
			for (long j = 100; j < 1000; j++)
			{
				long mult = i*j;
				
				if (isPalindrome(mult)&& mult > largest)
				{
					largest = mult;
				}
			}
		}
		
		return largest;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + largestPalindrome());
	}
}
