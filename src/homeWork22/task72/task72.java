package homeWork22.task72;

import homeWork22.task72.annotations.AcademyInfo;
import homeWork22.task72.model.UtilityAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class task72 {
    public static void main(String[] args) {
        Class aClass = UtilityAnnotation.class;
        UtilityAnnotation aTest = new UtilityAnnotation();
        Method[] fields = aClass.getDeclaredMethods();
        for (Method method : fields) {
            AcademyInfo academyInfo = method.getAnnotation(AcademyInfo.class);
            if (academyInfo != null) {
                System.out.printf("This method names \"%s\" is with annotation%n", method.getName());
                System.out.printf("Annotations is with value \"%d\"%n", academyInfo.year());
            } else {
                System.out.printf("This method names \"%s\" is without annotation%n", method.getName());
            }
            try {
                System.out.println("Lets invoke this method:");
                method.invoke(aTest);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
