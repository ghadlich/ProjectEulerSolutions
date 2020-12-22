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
