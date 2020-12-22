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


public class Problem40 
{

	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder(1500000);
		
		for (int i = 1; sb.length() < 1000000; i++)
		{
			sb.append(i);
		}
		
		int int_1       = sb.charAt(0)-'0';
		int int_10      = sb.charAt(9)-'0';
		int int_100     = sb.charAt(99)-'0';
		int int_1000    = sb.charAt(999)-'0';
		int int_10000   = sb.charAt(9999)-'0';
		int int_100000  = sb.charAt(99999)-'0';
		int int_1000000 = sb.charAt(999999)-'0';
	
		System.out.println("Solution: " + int_1*int_10*int_100*int_1000*int_10000*int_100000*int_1000000);
	}
	
}
