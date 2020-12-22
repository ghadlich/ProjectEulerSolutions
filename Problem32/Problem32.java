package euler;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem32 
{

	public static Set<String> computePermutations(String input)
	{
		Set<String> output = new LinkedHashSet<>();
		
		if (input.length() == 1)
		{
			output.add(input);
			return output;
		}
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length; i++)
		{
			char a = charArray[i];
			
			Set<String> subOutput = computePermutations((new StringBuilder(input)).deleteCharAt(i).toString());
		
			for (String subStr : subOutput)
			{
				output.add(a + subStr);
			}
		}
		
		return output;
	}

	public static boolean isPandigital(String strNum)
	{
		Set<String> set = new HashSet<>();
		
		if (strNum.length() != 9 || strNum.contains("0"))
		{
			return false;
		}
		
		for (char a : strNum.toCharArray())
		{
			set.add(String.valueOf(a));
		}
		
	    return (set.size() == 9);
	}
	
	public static boolean isPandigital(long number)
	{
		return isPandigital(String.valueOf(number));
	}
	
	public static void main(String args[])
	{
		//Set<String> permutations = computePermutations("12345");
		
		Set<Integer> products = new HashSet<>();
		
		for (int i = 2; i < 2000; i++)
		{
			for (int j = 2; j < 2000; j++)
			{
				if (isPandigital(i+""+j+""+i*j))
				{
					products.add(i*j);
				}
			}
		}
		
		int sum = 0;
		
		for (Integer i : products)
		{
			sum +=i;
		}
		
		System.out.println(sum);
	}
	
}
