import java.util.Scanner; //для использования функций ввода

public class Reserve {
	private static final int LEN = 50; //макс. число работников заповедника на одном участке и макс. кол-во участков
	private String title;  //название заповедника
	private int budget=0;          //бюджет заповедника
	private int expens=0;          //расходы
	private int kolvow=0;         //кол-во работников в заповеднике на одном участке
	private int area=0; //кол-во участков в заповеднике (на каждом свои работники) //лаб 11
	private Worker[] workers = new Worker[LEN]; //работники заповедника
	private Worker[][] workersa = new Worker[LEN][LEN]; //работники заповедника, если несколько участков //лаб 11
	private static double nalog=0.13; //налоговые отчисления (для лаб. 8)
	
	//конструктор со всеми параметрами (для лаб. 9) (если нет разделения на участки)
	public Reserve(String titl, int budg, int exp, int kolv, Worker[] works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		for(int i=0; i<kolv; i++)
			this.workers[i]=works[i];
	}
	
	//конструктор для лаб 11 (заповедник с разделением на участки)
	public Reserve(String titl, int budg, int exp, int kolv, int areas, Worker[][] works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		this.area=areas;
		for(int i=0; i<areas; i++)
		{
			for(int j=0; j<kolv; j++)
			{
				this.workersa[i][j]=works[i][j];
			}
		}
	}
	
	//конструктор со всеми параметрами (для лаб. 9) (вторая перегрузка)
	public Reserve(String titl, int budg, int exp, int kolv, Worker works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		for(int i=0; i<kolv; i++)
			this.workers[i]=works;
	}
	
	public Reserve() //конструктор без параметров (для лаб. 9)
	{
		title="title";
		budget=0;
		expens=0;
		kolvow=0;
	}
	
	public Reserve(int kolv) //конструктор с одним параметром (для лаб. 9)
	{
		this.title="Reserve";
		this.budget=1000000;
		this.expens=100000;
		this.kolvow=kolv;
		Worker w_konstr = new Worker("Ivan Ivanov");
		for(int i=0; i<kolv; i++)
			this.workers[i]=w_konstr;
	}
	
	public void Display() //вывод
	{
		System.out.printf("\nOutput info about reserve.\n");
		System.out.println("Title: " + title);
		System.out.println("Budget: " + budget);
		System.out.println("Expenses: " + expens);
		System.out.println("Count of workers: " + kolvow);
		int n = this.kolvow; //получить кол-во работников
		for(int i=0; i<n; i++)
		{
			System.out.printf("\nWorker %d\n", i+1);
			System.out.println("Num of workbook: " + workers[i].get_num());
			System.out.println("Name and surname: " + workers[i].get_name());
			System.out.println("Dolzhnost: " + workers[i].get_dol());
			System.out.println("Work hours: " + workers[i].get_h());
			System.out.println("Zarplata: " + workers[i].get_z());
			System.out.println("Progools: " + workers[i].get_prog());
		}
	}
	
	public void Display_areas() //вывод по участкам //лаб 11
	{
		System.out.printf("\nOutput info about reserve.\n");
		System.out.println("Title: " + title);
		System.out.println("Budget: " + budget);
		System.out.println("Expenses: " + expens);
		System.out.println("Count of workers on area: " + kolvow);
		System.out.println("Count of areas: " + area);
		int n = this.kolvow; //получить кол-во работников
		int na = this.area; //получить кол-во участков
		for(int i=0; i<na; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.printf("\nWorker %d on area %d\n", j+1, i+1);
				System.out.println("Num of workbook: " + workersa[i][j].get_num());
				System.out.println("Name and surname: " + workersa[i][j].get_name());
				System.out.println("Dolzhnost: " + workersa[i][j].get_dol());
				System.out.println("Work hours: " + workersa[i][j].get_h());
				System.out.println("Zarplata: " + workersa[i][j].get_z());
				System.out.println("Progools: " + workersa[i][j].get_prog());
			}
		}
	}
	
	public void Read() //ввод
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nInput info about reserve.\n");
		System.out.printf("Input title: ");
		this.title=in.nextLine();
		System.out.printf("Input budget: ");
		this.budget=in.nextInt();
		System.out.printf("Input expenses: ");
		this.expens=in.nextInt();
		System.out.printf("Input count of workers: ");
		this.kolvow=in.nextInt();
		int n_k = this.kolvow;
		for(int i=0; i<n_k; i++)
			this.workers[i].Read();
		
	}
	
	public static double get_nalog() //получение значения процента налоговых отчислений (для лаб. 8)
	{
		return nalog;
	}

	public static void set_nalog(double nalogi) //установление значения процента налоговых отчислений (для лаб. 8)
	{
		nalog=nalogi;
	}
	
	public int get_kolvo() //получение значения кол-ва работников
	{
		return this.kolvow;
	}
	
	public static Reserve Add(Reserve r1, Reserve r2) //сложение
	{
		Reserve rsum;
		rsum=r1; //переписать первую структуру в суммарную структуру
		rsum.budget+=r2.budget; //прибавить к имеющимся числовым переменным суммарной структуры значения из второй структуры
		rsum.expens+=r2.expens;
		rsum.kolvow+=r2.kolvow;
		return rsum; //вернуть итоговый объект как результат
	}
	
	public void ZarplChange() //изменение зарплаты всех (прикладное)
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nChanging zarplata of all workers\n");
		System.out.printf("Input changes of zarplata: ");
		int izm; //переменная с прибавкой или убавкой
		izm=in.nextInt();
		int n = this.kolvow; //получить кол-во работников
		for(int i=0; i<n; i++)
		{
			this.workers[i].set_z(workers[i].get_z()+izm); //добавить изменение к текущему
		}
	}
	
	public void BudgChange() //изменение бюджета (прикладное)
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nChanging budget of reserve\n");
		System.out.printf("Input changes of budget: ");
		int izm; //переменная с прибавкой или убавкой
		izm=in.nextInt();
		this.budget+=izm; //добавить изменение к текущему
	}
	
	public int nal_otchisl(int otchisl) //налоговые отчисления
	{
		otchisl = (int)( expens * nalog );
		return otchisl;
	}
	
	public void found_name_surname(String names_surnames) //поиск по имени и фамилии (обработка строк)
	{
		int rez=0;
		for(int i=0; i<kolvow; i++)
		{
			if( names_surnames.equals(workers[i].get_name())) //сравнить строки на идентичность
			{
				System.out.printf("\nWorker found.\n");
				rez=1;
				break;
			}
		}
		if(rez==0)
		{
			System.out.printf("\nWorker didn't found.\n");
		}
	}
	
	public static void sravn_kolvow(Reserve r1, Reserve r2) //сравнить два заповедника по кол-ву работников (статический метод) (для лаб. 8)
	{
		if(r1.get_kolvo()>r2.get_kolvo())
		{
			System.out.printf("\nMore workers in first reserve.\n");
		}
		if (r1.get_kolvo()<r2.get_kolvo())
		{
			System.out.printf("\nMore workers in second reserve.\n");
		}
		if (r1.get_kolvo()==r2.get_kolvo())
		{
			System.out.printf("\nCounts of workers in reserves are equal.\n");
		}
	}
}