package euler;
import java.math.BigInteger;




public class Problem20 
{
	
	public static long factorialSum(long input)
	{
		BigInteger factorialNumber = BigInteger.valueOf(1);
		
		for (long i = 2; i <= input; i++)
		{
			factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));
		}
		
		int sum = 0;
		
		for (char a : factorialNumber.toString().toCharArray())
		{
			sum += (a-'0');
		}
		
		
		
		return sum;
	}
	
	public static void main(String[] args)
	{	
		System.out.println("Solution: " +  factorialSum(100));
	}
}
