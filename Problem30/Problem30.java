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


public class Problem30 
{

	
	public static long sumOfFifthPower(long number)
	{
		long sum = 0;
		
		for (char c : String.valueOf(number).toCharArray())
		{
			long digit = c - '0';
			
			sum += digit * digit * digit * digit * digit;
			
			if (sum > number)
			{
				return 0;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{	
		long sum = 0;
		
		for (long i = 2; i < 200000; i++)
		{
			if (i == sumOfFifthPower(i)) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("Solution: " + sum);
		
		
	}
	
}
