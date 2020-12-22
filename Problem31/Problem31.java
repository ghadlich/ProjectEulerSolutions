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





public class Problem31 
{
	public static int[] S = {1, 2, 5, 10, 20, 50, 100, 200};
	
	public static long count(int n, int m)
	{
		if (n < 0 || m < 0)
		{
			return 0;
		}
		else if (n ==0)
		{
			return 1;
		}
		
		return count(n, m-1) + count( n - S[m], m );
	}
	
	
	public static void main(String[] args)
	{	

		System.out.println("Solution: " +  count(200,S.length-1));
		
		int coins[] = { 1, 2 , 5 , 10 , 20 , 50 , 100 , 200 };
		int amount = 200;
		int ways [] = new int[200+1];
		ways [0] = 1;
		for (int i = 0; i < 8; i++)
		{
			for (int j = coins[i]; j<= amount; j++)
			{
				ways [j] = ways [j] + ways [j - coins [ i ]];
			}
		}

		System.out.println(ways [ amount ]);

		
	}
}
