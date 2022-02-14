package main.java.HomeWork3;

public class MyInteger {
    private int i;		// Создаём переменную класса типа int с закрытым доступом
    public final static int I_MIN = Integer.MIN_VALUE;		// Создаём константу класса типа int и присваеваем её значение Integer.MAX_VALUE
    public final static int I_MAX = Integer.MAX_VALUE;		// Создаём константу класса типа int и присваеваем её значение Integer.MIN_VALUE

    public MyInteger(int i) {	// Создаём конструктор класса в который при создании будет передаваться значение типа int
        this.i = i;				// Тут мы присваиваем переданное на вход значение переменной класса типа int
    }

    public void addOne () {		// Создаём метод для добавления 1 к переменной класса типа int
        ++i;					// Добавляем еденицу к переменной
    }

    public void decOne () {		// Создаём метод для вычитания 1 из переменной класса типа int
        --i;					// Вычитаем еденицу от переменной
    }

    public int getValue () {	// Создаём метод для получения доступа к закрытой переменной типа Int
        return i;				// Возвращяем значение переменной
    }

}