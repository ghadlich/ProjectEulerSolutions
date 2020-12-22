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
