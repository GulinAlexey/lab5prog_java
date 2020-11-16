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
		
		int nal=0; //налоговые отчисления
		nal=res1.nal_otchisl(nal);
		System.out.println("\nTax is "+Reserve.get_nalog());
		System.out.println("Reserve's tax deductions is " + nal);
		
		//для лаб. 8
		Reserve res2= new Reserve("No Name", 0, 0, 100, w0); //объект заповедника с массивом объектов работников
		res2.Read();
		res2.Display();
		Reserve.sravn_kolvow(res1, res2);
		Reserve.set_nalog(0.05);
		System.out.println("\nNew tax is "+Reserve.get_nalog()+"\n");
		
		
		String search = new String();
		System.out.printf("\nInput name, surname of worker\nwhat would you like to found in Reserve 1: ");
		Scanner in = new Scanner(System.in);
		search=in.nextLine();
		res1.found_name_surname(search);
		
		System.out.printf("\nEnd of program...\n");
		
		
	}
}