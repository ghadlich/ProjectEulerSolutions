package euler;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;




public class Problem19 
{
	public static void main(String[] args)
	{	
		int count = 0;
		Locale locale = Locale.getDefault();
		for (int year = 1901; year <= 2000; year++)
		{
			for (int month = 0; month < 12; month++)
			{
				GregorianCalendar g = new GregorianCalendar(year,month,1);
				String day = g.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
				
				if (day.equals("Sunday"))
				{
					count++;
				}
			}
		}
		
		
		
		System.out.println("Solution: " + count);
		
	}
}
