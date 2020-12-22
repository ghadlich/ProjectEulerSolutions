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
import java.util.HashSet;
import java.util.Set;


public class Problem2 
{
	public static long createEvenFibonacciSum(int max)
	{
		Set<Integer> setOfEvenFibs = new HashSet<>();
		
		int prev1 = 1, prev2 = 1;

		while(true)
		{
			int fibNumber = prev1 + prev2;
			prev2 = prev1;
			prev1 = fibNumber;
			
			if (fibNumber >= max)
			{
				break;
			}
			
			if (fibNumber %2 == 0)
			{
				setOfEvenFibs.add(fibNumber);
			}
			
		}
		
		long sum = 0;
		
		for (Integer i : setOfEvenFibs)
		{
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + createEvenFibonacciSum(4000000));
	}
}
