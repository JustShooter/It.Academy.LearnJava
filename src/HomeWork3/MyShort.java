public class MyShort {
    private short s;									// Создаём переменную класса типа short с закрытым доступом
    public final static short S_MIN = Short.MIN_VALUE;	// Создаём константу класса типа short и присваеваем её значение Short.MAX_VALUE
    public final static short S_MAX = Short.MAX_VALUE;	// Создаём константу класса типа short и присваеваем её значение Short.MIN_VALUE

    public MyShort(short s) {	// Создаём конструктор класса в который при создании будет передаваться значение типа short
        this.s = s;				// Тут мы присваиваем переданное на вход значение переменной класса типа short
    }

    public void addOne () {		// Создаём метод для добавления 1 к переменной класса типа short
        ++s;					// Добавляем еденицу к переменной
    }

    public void decOne () {		// Создаём метод для вычитания 1 из переменной класса типа short
        --s;					// Вычитаем еденицу от переменной
    }

    public short getValue () {	// Создаём метод для получения доступа к закрытой переменной типа short
        return s;				// Возвращяем значение переменной
    }

}