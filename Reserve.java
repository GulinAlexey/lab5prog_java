import java.util.Scanner;

public class Reserve {
	private static final int LEN = 100; //макс. число работников заповедника
	private String title;  //название заповедника
	private int budget=0;          //бюджет заповедника
	private int expens=0;          //расходы
	private int kolvow=0;         //кол-во работников в заповеднике
	private Worker[] workers = new Worker[LEN]; //работники заповедника
}