import java.util.Scanner; //для использования функций ввода

public class lab5
{
	public static void main (String args[])
	{
		final int LEN = 100; //макс. кол-во работников заповедника
		
		System.out.printf("\nStart program for working with workers and reserves.\n");
		Worker[] w0 = new Worker[LEN]; //начальные данные работника для инициализации заповедника
		for(int i=0; i<LEN; i++)
			w0[i] = new Worker (12345, "No Name", "No Prof", 0, 0, 0);
		Reserve res1= new Reserve("No Name", 0, 0, 100, w0); //объект заповедника с массивом объектов работников
		res1.Read();
		res1.Display();
		res1.ZarplChange();
		res1.Display();
		res1.BudgChange();
		res1.Display();
		
		Blag b = new Blag(); //отчисления на благотворительность
		res1.blagotvor(b);
		double b2 = b.blaga;
		System.out.println("Reserve's charity is " +b2);
		
		String search = new String();
		System.out.printf("\nInput name, surname of worker\nwhat would you like to found: ");
		Scanner in = new Scanner(System.in);
		search=in.nextLine();
		res1.found_name_surname(search);
		
		System.out.printf("\nEnd of program...\n");
		
		
	}
}