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
