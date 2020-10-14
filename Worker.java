import java.util.Scanner; //для использования функций ввода

public class Worker {
	private int num_tr=0; //номер трудовой книжки
	private String name_surname; //имя и фамилия
	private String dolzh; //должность
	private int hours=0; //кол-во рабочих часов
	private int zarpl=0; //зарплата в месяц в рублях
	private int progools=0; //кол-во прогулов (в днях)
	
	//конструктор с параметрами
	public Worker(int num_trud, String name_sur, String dolzhno, int hourss, int zarplat, int progoo)
	{
		this.num_tr=num_trud;
		this.name_surname=name_sur;
		this.dolzh=dolzhno;
		this.hours=hourss;
		this.zarpl=zarplat;
		this.progools=progoo;
	}
	
	//инициализация
	public void Init(int num_trud, String name_sur, String dolzhno, int hourss, int zarplat, int progoo)
	{
		this.num_tr=num_trud;
		this.name_surname=name_sur;
		this.dolzh=dolzhno;
		this.hours=hourss;
		this.zarpl=zarplat;
		this.progools=progoo;
	}
	
	//Получение и установление соответствующих полей
	public void set_num(int num)
	{
		this.num_tr=num;
	}
	public int get_num()
	{
		return this.num_tr;
	}

	public void set_h(int h)
	{
		this.hours=h;
	}
	public int get_h()
	{
		return this.hours;
	}

	public void set_z(int z)
	{
		this.zarpl=z;
	}
	public int get_z()
	{
		return this.zarpl;
	}

	public void set_prog(int prog)
	{
		this.progools=prog;
	}
	public int get_prog()
	{
		return this.progools;
	}

	public void set_name(String nam)
	{
		this.name_surname = nam;
	}

	public String get_name()
	{
		return this.name_surname;
	}

	public void set_dol(String dol)
	{
		this.dolzh = dol;
	}

	public String get_dol()
	{
		return this.dolzh;
	}
	
	public void Read() //ввод
	{
		Scanner in = new Scanner(System.in, "cp866");
		Worker w1 = new Worker(12345, "No Name", "No Prof", 0, 0, 0);
		System.out.printf("\nInput info about worker.\n");
		System.out.printf("Input num of workbook: ");
		num_tr=in.nextInt();
		System.out.printf("Input name and surname: ");
		name_surname=in.nextLine();
		name_surname=in.nextLine();
		System.out.printf("Input dolzhnost: ");
		dolzh=in.nextLine();
		System.out.printf("Input work hours: ");
		hours=in.nextInt();
		System.out.printf("Input zarplata: ");
		zarpl=in.nextInt();
		System.out.printf("Input progools: ");
		progools=in.nextInt();
	}
	
	public void Display() //вывод
	{
		System.out.printf("\nOutput info about worker.\n");
		System.out.println("Num of workbook: " + num_tr);
		System.out.println("Name and surname: " + name_surname);
		System.out.println("Dolzhnost: " + dolzh);
		System.out.println("Work hours: " + hours);
		System.out.println("Zarplata: " + zarpl);
		System.out.println("Progools: " + progools);

	}
	
	public void Add(Worker wr1, Worker wr2) //сложение
	{
		Worker wrsum = new Worker(12345, "No Name", "No Prof", 0, 0, 0);
		wrsum=wr1;
		wrsum.hours+=wr2.hours; //прибавить к имеющимся числовым переменным суммарного объекта значения из второго объекта (кроме номера трудовой)
		wrsum.zarpl+=wr2.zarpl;
		wrsum.progools+=wr2.progools;
		this.Init(wrsum.num_tr, wrsum.name_surname, wrsum.dolzh, wrsum.hours, wrsum.zarpl, wrsum.progools); //вернуть итоговый объект как результат
	}
	
	//обнуление прогулов (прикладное)
	public void Obnul()
	{
		this.progools=0; //обнулить прогулы
	}

	public void Izm_zarpl() //изменение зарплаты (прикладное)
	{
		Scanner in = new Scanner(System.in, "cp866");
		System.out.printf("\nChanging zarplata of worker\n");
		System.out.printf("Input changes of zarplata: ");
		int izm; //переменная с прибавкой или убавкой зарплаты
		izm=in.nextInt();
		this.zarpl+=izm; //добавить изменение к текущей зарплате
	}
}