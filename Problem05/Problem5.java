package euler;


public class Problem5 
{	
	public static long lcm(int... a) {
	    for (long m = 1;; m++) {
	    	long n = a.length;
	        for (long i : a) {
	            if (m % i != 0) {
	                break;
	            }
	            if (--n == 0) {
	                return m;
	            }
	        }
	    }
	}
	
	public static void main(String[] args)
	{
		System.out.println("Solution: " + lcm(2,4,6,8,10,12,14,16,18,20,3,5,7,9,11,13,15,17,19));
	}
}
