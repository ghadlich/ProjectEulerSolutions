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
