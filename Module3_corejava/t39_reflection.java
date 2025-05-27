
import java.lang.reflect.*;

public class t39_reflection {

    public void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("t39_reflection");
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Methods in class:");
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj = clazz.getDeclaredConstructor().newInstance();
        Method helloMethod = clazz.getMethod("hello", String.class);
        helloMethod.invoke(obj, "Reflection");
    }
}
