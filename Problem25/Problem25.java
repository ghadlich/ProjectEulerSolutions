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
import java.util.ArrayList;
import java.util.List;




public class Problem25 
{

	private static List<BigInteger> fibList = new ArrayList<>();
	
	static
	{
		fibList.add(BigInteger.valueOf(1));
		fibList.add(BigInteger.valueOf(1));
	}
	
	public static void nextFibNumber()
	{
		fibList.add(fibList.get(fibList.size()-1).add(fibList.get(fibList.size()-2)));
	}
	
	public static long fibNumber(int length)
	{
		while (fibList.get(fibList.size()-1).toString().length() < length)
		{
			nextFibNumber();
		}
		
		return fibList.size();
		
	}
	
	public static void main(String[] args)
	{	
		System.out.println("Solution: " +  fibNumber(1000));
	}
}
