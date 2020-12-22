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

import java.util.Set;

public class Problem43 
{
	
	public static boolean isMod(int i, int mod)
	{
		return (i % mod == 0);
	}

	public static void main(String args[])
	{
		Set<String> panNumbers = Problem32.computePermutations("0123456789");
		
		System.out.println("Found permutions: " + panNumbers.size());
		
		long sum = 0;
		
		for (String panNumber : panNumbers)
		{
			if (!panNumber.startsWith("0"))
			{
				char[] array = panNumber.toCharArray();
				
				int d2d3d4  = 100*(array[1]-'0')+10*(array[2]-'0')+(array[3]-'0');
				int d3d4d5  = 100*(array[2]-'0')+10*(array[3]-'0')+(array[4]-'0');
				int d4d5d6  = 100*(array[3]-'0')+10*(array[4]-'0')+(array[5]-'0');
				int d5d6d7  = 100*(array[4]-'0')+10*(array[5]-'0')+(array[6]-'0');
				int d6d7d8  = 100*(array[5]-'0')+10*(array[6]-'0')+(array[7]-'0');
				int d7d8d9  = 100*(array[6]-'0')+10*(array[7]-'0')+(array[8]-'0');
				int d8d9d10 = 100*(array[7]-'0')+10*(array[8]-'0')+(array[9]-'0');
				
				if (isMod(d2d3d4,2)&&isMod(d3d4d5,3)&&isMod(d4d5d6,5)&&isMod(d5d6d7,7)&&isMod(d6d7d8,11)&&isMod(d7d8d9,13)&&isMod(d8d9d10,17))
				{
					sum += Long.valueOf(panNumber);
				}
			}
		}
		
		System.out.println("Solution: " + sum);
	}
	
}
