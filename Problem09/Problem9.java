package euler;


public class Problem9 
{
	
	public static long pythagoreanTriplet(int sum)
	{
		for (int a = 1; a < sum; a++)
		{
			for (int b = a+1; (a + b) < sum; b++)
			{
				for (int c = b + 1; (a+b+c) <= sum; c++)
				{
					if (a+b+c == sum)
					{
						if ((a*a + b*b)==c*c)
						{
							return a*b*c;
						}
					}
				}
			}
		}
		
		
		return 0;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + pythagoreanTriplet(1000));
	}
}
