Прикладной задачей данной работы является управление заповедниками. 
Нужно вести учёт работников заповедника для хорошего управления, а также самих заповедников для 
эффективного распределения средств. Использовать классы.

//////////////////////////////////////////
Класс: Worker (работник заповедника) (будет вызываться другим классом)

Поля:

private int num_tr                     номер трудовой книжки
private String name_surname            имя и фамилия
private String dolzh                   должность
private int hours                      кол-во рабочих часов
private int zarpl                      зарплата в месяц в рублях
private int progools                   кол-во прогулов (в днях)

Методы:

Worker()                                               конструктор без параметров
~Worker()                                              деструктор
void Init(int num_trud, const char* name_sur, const char* dolzhno, int hourss, int zarplat, int progoo)  Инициализация
void Display()                                         вывод
void Read()                                            ввод
void Add(Worker wr1, Worker wr2)                       сложение
void Obnul()                                           обнуление прогулов (прикладное)
void Izm_zarpl()                                       изменение зарплаты (прикладное)

          Получение и установление соответствующих полей
void set_num(int num)
int get_num()
void set_h(int h)
int get_h()
void set_z(int z)
int get_z()
void set_prog(int prog)
int get_prog()
void set_name(char* nam)
char* get_name()
void set_dol(char* dol)
char* get_dol()


//////////////////////////////////////////
Класс: Reserve (заповедник) (будет вызывать класс Worker)

Поля:
private String title        название заповедника
private int budget          бюджет заповедника
private int expens          расходы
private int kolvow          кол-во работников в заповеднике
private Worker workers[LEN]  работники заповедника

Методы:

Reserve()                                                        конструктор без параметров
~Reserve()                                                       деструктор
void Init(const char* titl, int budg, int exp, int kolv, Worker works[LEN])          Конструктор с параметрами (выполняет инициализацию)
void Display()                                                   вывод
void Read()                                                      ввод
void Add(Reserve r1, Reserve r2)                                 сложение
void ZarplChange()                                               изменение зарплаты всех работников (прикладное)
void BudgChange()                                                изменение бюджета (прикладное)
