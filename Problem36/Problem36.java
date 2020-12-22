package euler;



public class Problem36
{
	public static String base10ToBin(int number)
	{
		String output = "";
		
		while (number > 0)
		{
			if (number % 2 == 0)
			{
				output = "0"+output;
			}
			else
			{
				output = "1"+output;
			}
			
			number >>= 1;
		}
		
		return output;
		
	}
	
	public static void main(String args[])
	{
		long sum = 0;
		
		for (int i = 1; i < 1000000; i++)
		{
			if (Problem4.isPalindrome(i)&&Problem4.isPalindrome(base10ToBin(i)))
			{
				sum += i;
			}
		}
		
		System.out.println("Solution: " + sum);
	}
	
}
