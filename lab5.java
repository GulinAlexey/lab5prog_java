import java.util.Scanner; //для использования функций ввода

public class lab5
{
	public static void main (String args[])
	{
		final int LEN = 100; //макс. кол-во работников заповедника
		
		System.out.printf("\nStart program for working with workers and reserves.\n");
		
		
		Worker wrk11 = new Worker();
		Worker wrk12 = new Worker("Vlad Vladov");
		Worker wrk13 = new Worker(22222, "Oleg Olegov", "Gribnik", 150, 8000, 3);
		System.out.printf("\nWorker: constructor without value.\n");
		wrk11.Display();
		System.out.printf("\nWorker: constructor with one value.\n");
		wrk12.Display();
		System.out.printf("\nWorker: constructor with all value.\n");
		wrk13.Display();

		Reserve res11 = new Reserve();
		Reserve res12 = new Reserve(2);
		Reserve res13 = new Reserve("White Sand", 2000000, 400000, 0, wrk11);
		System.out.printf("\nReserve: constructor without value.\n");
		res11.Display();
		System.out.printf("\nReserve: constructor with one value.\n");
		res12.Display();
		System.out.printf("\nReserve: constructor with all value.\n");
		res13.Display();
		
		Worker[] wrk2= new Worker[2];
		for(int i=0; i<2; i++)
		{
			wrk2[i]= new Worker("Ivan Ivanov"); //инициализация небольшого массива конструктором с одним параметром
		}
		
		//для лаб 11
		System.out.printf("Input count of workers: ");
		int kolvv=in.nextInt();
		Worker[] wr22 = new Worker[LEN];
		for (int i=0; i<kolvv; i++)
		{
			wr22[i] = new Worker();
			wr22[i].Read();
		}
		for (int h=0; h<kolvv; h++)
		{
			wr22[h].Display();
		}
		
		Reserve res123 = new Reserve("Svetilo", 1000000, 500000, kolvv, wr22); //для лаб 11
		res123.Display();
		
		//для лаб 11
		System.out.printf("Input count of areas in reserve: ");
		int ar = in.nextInt();
		System.out.printf("Input count of workers on area: ");
		kolvv=in.nextInt();
		Worker wrk55 = new Worker[ar][kolvv];
		for(int i=0; i<ar; i++)
		{
			for(int j=0; j<kolvv; j++)
			{
				wrk55[i][j] = new Worker();
				wrk55[i][j].Read();
			}
		}
		Reserve rees("Opyata", 2000000, 1500000, kolvv, ar, wrk55);
		rees.Display();
		rees.ZarplChange();
		rees.Display();
		
		/*
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
		*/
		
		System.out.printf("\nEnd of program...\n");
		
		
	}
}