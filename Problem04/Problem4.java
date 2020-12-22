package euler;


public class Problem4 
{	
	public static boolean isPalindrome(long number)
	{
		return isPalindrome(String.valueOf(number));
	}
	
	public static boolean isPalindrome(String num)
	{
		char[] array = num.toCharArray();

		for (int i = 0; i < num.length()/2; i++)
		{
			if (array[i] != array[num.length()-1-i])
			{
				return false;
			}
		}

		return true;
	}
	
	
	public static long largestPalindrome()
	{
		long largest = 0;
		for (long i = 100; i < 1000; i++)
		{
			for (long j = 100; j < 1000; j++)
			{
				long mult = i*j;
				
				if (isPalindrome(mult)&& mult > largest)
				{
					largest = mult;
				}
			}
		}
		
		return largest;
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + largestPalindrome());
	}
}
