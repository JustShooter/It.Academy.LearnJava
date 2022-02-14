package main.java.HomeWork3;

public class MyByte {
    private byte b;										// Создаём переменную класса типа byte с закрытым доступом
    public final static byte B_MIN = Byte.MIN_VALUE;	// Создаём константу класса типа byte и присваеваем её значение Byte.MAX_VALUE
    public final static byte B_MAX = Byte.MAX_VALUE;	// Создаём константу класса типа byte и присваеваем её значение Byte.MIN_VALUE

    public MyByte(byte b) {		// Создаём конструктор класса в который при создании будет передаваться значение типа byte
        this.b = b;				// Тут мы присваиваем переданное на вход значение переменной класса типа byte
    }

    public void addOne () {		// Создаём метод для добавления 1 к переменной класса типа byte
        ++b;					// Добавляем еденицу к переменной
    }

    public void decOne () {		// Создаём метод для вычитания 1 из переменной класса типа byte
        --b;					// Вычитаем еденицу от переменной
    }

    public byte getValue () {	// Создаём метод для получения доступа к закрытой переменной типа byte
        return b;				// Возвращяем значение переменной
    }

}