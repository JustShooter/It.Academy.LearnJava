package HomeWork3;

public class HomeWork3 {

    private static void print(byte b, short s, int i, long l) {		// Создаю метод с закрытым доступом для вывода в консоль передаваемых на вход значений целочисленных переменных
        System.out.println("Byte variable max value: " + b);		// Вывожу в консоль переданное значение переменной типа Byte
        System.out.println("Short variable max value: " + s);		// Вывожу в консоль переданное значение переменной типа Short
        System.out.println("Integer variable max value: " + i);		// Вывожу в консоль переданное значение переменной типа Int
        System.out.println("Long Variable max value: " + l);		// Вывожу в консоль переданное значение переменной типа Long

    }

    public static void main(String[] args) {
        MyInteger objMaxInt = new MyInteger (MyInteger.I_MAX);	// Создаю экземпляр класса MyInteger, на который будет ссылаться ссылочная переменная objMaxInt, и передаю ему значение переменной i_max из класса MyInteger
        MyInteger objMinInt = new MyInteger (MyInteger.I_MIN);	// Создаю экземпляр класса MyInteger, на который будет ссылаться ссылочная переменная objMinInt, и передаю ему значение переменной i_min из класса MyInteger

        MyByte objMaxByte = new MyByte (MyByte.B_MAX);			// Создаю экземпляр класса MyByte, на который будет ссылаться ссылочная переменная objMaxByte, и передаю ему значение переменной b_max из класса MyByte
        MyByte objMinByte = new MyByte (MyByte.B_MIN);			// Создаю экземпляр класса MyByte, на который будет ссылаться ссылочная переменная objMinByte, и передаю ему значение переменной b_min из класса MyByte

        MyShort objMaxShort = new MyShort (MyShort.S_MAX);		// Создаю экземпляр класса MyShort, на который будет ссылаться ссылочная переменная objMaxShort, и передаю ему значение переменной s_max из класса MyShort
        MyShort objMinShort = new MyShort (MyShort.S_MIN);		// Создаю экземпляр класса MyShort, на который будет ссылаться ссылочная переменная objMinShort, и передаю ему значение переменной s_min из класса MyShort

        MyLong objMaxLong = new MyLong (MyLong.L_MAX);			// Создаю экземпляр класса MyLong, на который будет ссылаться ссылочная переменная objMaxLong, и передаю ему значение переменной l_max из класса MyLong
        MyLong objMinLong = new MyLong (MyLong.L_MIN);			// Создаю экземпляр класса MyLong, на который будет ссылаться ссылочная переменная objMinLong, и передаю ему значение переменной l_min из класса MyLong

        System.out.println("\nВывод максимальных значений целочисленных переменных");						// Вывожу в консоль текст
        print(objMaxByte.getValue(), objMaxShort.getValue(), objMaxInt.getValue(), objMaxLong.getValue());	// Вывожу в консоль максимальные значения целочисленных переменных из экземпляров классов через метод print()

        System.out.println("\nВывод минимальных значений целочисленных переменных");						// Вывожу в консоль текст
        print(objMinByte.getValue(), objMinShort.getValue(), objMinInt.getValue(), objMinLong.getValue());	// Вывожу в консоль минимальные значения целочисленных переменных из экземпляров классов через метод print()	

        objMaxByte.addOne();	// Вызываю метод addOne из экземпляра класса MyByte, который прибавляет еденицу к максимальному значению данного типа переменной
        objMaxShort.addOne();	// Вызываю метод addOne из экземпляра класса MyShort, который прибавляет еденицу к максимальному значению данного типа переменной
        objMaxInt.addOne();		// Вызываю метод addOne из экземпляра класса MyInteger, который прибавляет еденицу к максимальному значению данного типа переменной
        objMaxLong.addOne();	// Вызываю метод addOne из экземпляра класса MyLong, который прибавляет еденицу к максимальному значению данного типа переменной

        objMinByte.decOne();	// Вызываю метод decOne из экземпляра класса MyByte, который вычитает еденицу от минимального значения данного типа переменной
        objMinShort.decOne();	// Вызываю метод decOne из экземпляра класса MyShort, который вычитает еденицу от минимального значения данного типа переменной
        objMinInt.decOne();		// Вызываю метод decOne из экземпляра класса MyInteger, который вычитает еденицу от минимального значения данного типа переменной
        objMinLong.decOne();	// Вызываю метод decOne из экземпляра класса MyLong, который вычитает еденицу от минимального значения данного типа переменной

        System.out.println("\nВывод максимальных значений целочисленных переменных после прибавления 1");	// Вывожу в консоль текст
        print(objMaxByte.getValue(), objMaxShort.getValue(), objMaxInt.getValue(), objMaxLong.getValue());	// Вывожу в консоль максимальные значения целочисленных переменных после добавления 1 к их значениям из экземпляров классов через метод print()

        System.out.println("\nВывод минимальных значений целочисленных переменных после вычитания 1");		// Вывожу в консоль текст
        print(objMinByte.getValue(), objMinShort.getValue(), objMinInt.getValue(), objMinLong.getValue());	// Вывожу в консоль минимальные значения целочисленных переменных после вычитания 1 из их значений из экземпляров классов через метод print()		

    }
}