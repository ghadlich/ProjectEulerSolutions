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


public class Problem8 
{
	public static String largeNumber = "73167176531330624919225119674426574742355349194934" +
			"96983520312774506326239578318016984801869478851843" +
			"85861560789112949495459501737958331952853208805511" +
			"12540698747158523863050715693290963295227443043557" +
			"66896648950445244523161731856403098711121722383113" +
			"62229893423380308135336276614282806444486645238749" +
			"30358907296290491560440772390713810515859307960866" +
			"70172427121883998797908792274921901699720888093776" +
			"65727333001053367881220235421809751254540594752243" +
			"52584907711670556013604839586446706324415722155397" +
			"53697817977846174064955149290862569321978468622482" +
			"83972241375657056057490261407972968652414535100474" +
			"82166370484403199890008895243450658541227588666881" +
			"16427171479924442928230863465674813919123162824586" +
			"17866458359124566529476545682848912883142607690042" +
			"24219022671055626321111109370544217506941658960408" +
			"07198403850962455444362981230987879927244284909188" +
			"84580156166097919133875499200524063689912560717606" +
			"05886116467109405077541002256983155200055935729725" +
			"71636269561882670428252483600823257530420752963450";
	
	public static int[] intArray;
	
	static{
		
		char[] charArray = largeNumber.toCharArray();
		
		intArray = new int[largeNumber.length()];
		
		for (int i = 0; i < charArray.length; i++)
		{
			intArray[i] = charArray[i] - '0';
		}
	}
	
	public static long findMaxProduct(int[] array, int min)
	{
		long product = 0;
		long maxProduct = 0;
		int numsInSum = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (numsInSum < min)
			{
				if (array[i] == 0)
				{
					i++;
					product = 0;
					numsInSum = 0;
				}
				else if (product == 0)
				{
					product = array[i];
					numsInSum++;
				}
				else
				{
					product *= array[i];
					numsInSum++;
				}
			}
			else
			{
				if (array[i] == 0)
				{
					i++;
					product = 0;
					numsInSum = 0;
				}
				else
				{
					product /= array[i-min];
					product *= array[i];
				}
			}
			
			if ((numsInSum == min)&&(product > maxProduct))
			{
				maxProduct = product;
			}
		}

		
		return maxProduct;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + findMaxProduct(intArray, 13));
	}
}
