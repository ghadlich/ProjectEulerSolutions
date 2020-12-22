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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;




public class Problem22 
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader  r = new BufferedReader(new FileReader("C:\\Users\\ghadl_000\\Documents\\Programming\\Euler\\p022_names.txt"));
		
		String contents = r.readLine();
		
		contents = contents.replaceAll("\"", "");
		
		String[] names = contents.split(",");
		
		Arrays.sort(names);
		
		int sum = 0;
		
		for (int i = 0; i < names.length; i++)
		{
			int mult = i +1;
			int subSum = 0;
			
			for (char c : names[i].toCharArray())
			{
				subSum += c - 'A'+1;
			}
			
			sum += (mult*subSum);
		}
		
		
		System.out.println("Solution: " + sum);
	}
}
