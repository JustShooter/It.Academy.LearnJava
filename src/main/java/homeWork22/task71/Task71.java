package homeWork22.task71;

import homeWork22.task71.model.HelloWorld;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) {
        Class aClass = HelloWorld.class;
        try {
            Method method = aClass.getDeclaredMethod("printHelloWorld");
            method.invoke(new HelloWorld());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
