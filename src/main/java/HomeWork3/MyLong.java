package main.java.HomeWork3;

public class MyLong {
    private long l;										// Создаём переменную класса типа long с закрытым доступом
    public final static long L_MIN = Long.MIN_VALUE;	// Создаём константу класса типа long и присваеваем её значение Long.MAX_VALUE
    public final static long L_MAX = Long.MAX_VALUE;	// Создаём константу класса типа long и присваеваем её значение Long.MIN_VALUE

    public MyLong(long l) {		// Создаём конструктор класса в который при создании будет передаваться значение типа long
        this.l = l;				// Тут мы присваиваем переданное на вход значение переменной класса типа long
    }

    public void addOne () {		// Создаём метод для добавления 1 к переменной класса типа long
        ++l;					// Добавляем еденицу к переменной
    }

    public void decOne () {		// Создаём метод для вычитания 1 из переменной класса типа long
        --l;					// Вычитаем еденицу от переменной
    }

    public long getValue () {	// Создаём метод для получения доступа к закрытой переменной типа long
        return l;				// Возвращяем значение переменной
    }

}