import java.lang.reflect.InvocationTargetException;

class TestExemploDois {
    private String msg;
    private int status;

    TestExemploDois(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    void message() {
        System.out.printf("%s %d\n", this.msg, this.status);
    }
}

public class ExemploDois {
    public static void main(String args[]) {
        try {
            Class c = Class.forName("TestExemploDois");
            TestExemploDois s = (TestExemploDois) c.getDeclaredConstructor(String.class, int.class).
                    newInstance("Olá Mundo", 99);
            s.message();

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }
}
