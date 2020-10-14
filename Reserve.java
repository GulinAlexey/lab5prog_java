import java.util.Scanner; //для использования функций ввода

public class Reserve {
	private static final int LEN = 100; //макс. число работников заповедника
	private String title;  //название заповедника
	private int budget=0;          //бюджет заповедника
	private int expens=0;          //расходы
	private int kolvow=0;         //кол-во работников в заповеднике
	private Worker[] workers = new Worker[LEN]; //работники заповедника
	
	//конструктор с параметрами
	public Reserve(String titl, int budg, int exp, int kolv, Worker[] works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		for(int i=0; i<kolv; i++)
			this.workers[i]=works[i];
	}
	
	//конструктор с параметрами (вторая перегрузка)
	public Reserve(String titl, int budg, int exp, int kolv, Worker works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		for(int i=0; i<kolv; i++)
			this.workers[i]=works;
	}
	
	//инициализация
	public void Init(String titl, int budg, int exp, int kolv, Worker[] works)
	{
		this.title=titl;
		this.budget=budg;
		this.expens=exp;
		this.kolvow=kolv;
		for(int i=0; i<kolv; i++)
			this.workers[i]=works[i];
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
	
	public void Read() //ввод
	{
		Scanner in = new Scanner(System.in, "cp866");
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
	
	public void Add(Reserve r1, Reserve r2) //сложение
	{
		Reserve rsum;
		rsum=r1; //переписать первую структуру в суммарную структуру
		rsum.budget+=r2.budget; //прибавить к имеющимся числовым переменным суммарной структуры значения из второй структуры
		rsum.expens+=r2.expens;
		rsum.kolvow+=r2.kolvow;
		this.Init(rsum.title, rsum.budget, rsum.expens, rsum.kolvow, rsum.workers); //вернуть итоговый объект как результат
	}
	
	public void ZarplChange() //изменение зарплаты всех (прикладное)
	{
		Scanner in = new Scanner(System.in, "cp866");
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
		Scanner in = new Scanner(System.in, "cp866");
		System.out.printf("\nChanging budget of reserve\n");
		System.out.printf("Input changes of budget: ");
		int izm; //переменная с прибавкой или убавкой
		izm=in.nextInt();
		this.budget+=izm; //добавить изменение к текущему
	}
}