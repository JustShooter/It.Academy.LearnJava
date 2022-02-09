package homeWork22.task70;

import homeWork22.task70.model.Man;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class task70 {
    public static void main(String[] args) {
        Class manClass = Man.class;
        Man man = getMan();
        Field[] fields = manClass.getDeclaredFields();
        System.out.println("Printing fields:");
        printFields(manClass, man, fields);


        Method[] methods = manClass.getDeclaredMethods();
        System.out.println("Printing methods:");
        printMethods(methods);
        System.out.println("Trying to call method from class Man by reflection");
        callMethodFromClass(manClass, man, methods);

    }

    private static void callMethodFromClass(Class manClass, Man man, Method[] methods) {
        try {
            Method method = manClass.getDeclaredMethod(methods[2].getName());
            System.out.println(method.invoke(man));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void printMethods(Method[] methods) {
        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }

    private static Man getMan() {
        return new Man("John", "Smith", 24);
    }

    private static void printFields(Class manClass, Man man, Field[] fields) {
        for (Field field : fields) {
            String str = field.getName();
            System.out.println(str);
            getSecretInfo(manClass, man, field, str);
        }
    }

    private static void getSecretInfo(Class manClass, Man man, Field field, String str) {
        if (!field.getName().isBlank()) {
            try {
                Field field1 = manClass.getDeclaredField(str);
                field1.setAccessible(true);
                System.out.println(field1.get(man));
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
