package wrk;

import java.util.Scanner;

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
		this.progools-progoo;
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
}