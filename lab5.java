import java.util.Scanner; //для использования функций ввода

public class lab5
{
	public static void main (String args[]) throws Exception
	{
		final int LEN = 100; //макс. кол-во работников заповедника
		
		System.out.printf("\nStart program for working with workers and reserves.\n");
		
		Worker wrk88 = new Worker(22222, "Oleg Olegov", "Gribnik", -5, 8000, 3); //(для лаб. 10)
		Worker wrk99 = new Worker(); //(для лаб. 10)
        wrk99.Read();
        wrk99.Display();
		
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