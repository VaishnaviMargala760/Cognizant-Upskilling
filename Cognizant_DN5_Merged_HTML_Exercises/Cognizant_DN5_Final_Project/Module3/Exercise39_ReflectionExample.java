import java.lang.reflect.Method;

public class Exercise39_ReflectionExample {

    public static void main(String[] args) {

        try {

            Class<?> cls =
                    Class.forName("java.lang.String");

            Method methods[] =
                    cls.getDeclaredMethods();

            for(Method m : methods) {

                System.out.println(
                        m.getName());
            }

        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}