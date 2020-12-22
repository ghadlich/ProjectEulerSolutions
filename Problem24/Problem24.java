package euler;

import java.util.Set;

public class Problem24 
{

	public static void main(String args[])
	{
		Set<String> perms = Problem32.computePermutations("0123456789");

		System.out.println("Solution: " + perms.toArray(new String[0])[999999]);
	}
	
}
