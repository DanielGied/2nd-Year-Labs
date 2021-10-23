package ie.itcarlow.Lab3;
import java.util.Calendar;

//Student Name 	: Daniel Giedraitis
//Student Id Number: C00260331
//Date: October 2021

public class Clock 
{

	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));	
		
		int startingMinute = t.getMinute();
		long previousSecond = System.currentTimeMillis() / 1000;
		while(startingMinute == t.getMinute())
		{
			if(previousSecond < System.currentTimeMillis() / 1000)
			{
				previousSecond = System.currentTimeMillis() / 1000;
				t.tick();
				System.out.println(t);
			}
		}	

	}

}
