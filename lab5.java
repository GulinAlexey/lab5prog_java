import wrk.Worker;
import rsrv.Reserve;

import java.util.Scanner; //для использования функций ввода

public class lab5
{
	public static void main (String args[])
	{
		final int LEN = 100; //макс. кол-во работников заповедника
		
		System.out.printf("Start program for working with workers and reserves.\n");
		
		Reserve res1;
		res1.Read();
		res1.Display();
		res1.ZarplChange();
		res1.Display();
		res1.BudgChange();
		res1.Display();
	}
}