import java.util.Scanner; //для использования функций ввода

public class lab5
{
	public static void main (String args[])
	{
		final int LEN = 100; //макс. кол-во работников заповедника
		
		System.out.printf("Start program for working with workers and reserves.\n");
		Worker w0 = new Worker(12345, "No Name", "No Prof", 0, 0, 0);
		Reserve res1= new Reserve("No Name", 0, 0, 1, w0);
		res1.Read();
		res1.Display();
		res1.ZarplChange();
		res1.Display();
		res1.BudgChange();
		res1.Display();
	}
}