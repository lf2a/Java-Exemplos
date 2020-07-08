class TestExemploUm {
}

interface My {
}

public class ExemploUm {
    void printName(Object obj) {
        Class c = obj.getClass(); // retorna a instancia de Class
        // ver http://tutorials.jenkov.com/java-reflection/classes.html
        System.out.printf("%s %s %s %s", c.getName(), c.getModifiers(), c.getPackage(), c.getSuperclass());
    }

    public static void main(String[] args) {
        try {
            Class c = Class.forName("TestExemploUm");
            System.out.println(c.getName()); // mostrando o nome da classe

            new ExemploUm().printName(new TestExemploUm());

            Class c2 = TestExemploUm.class;
            System.out.println(c2.getName());

            Class c3 = Class.forName("My");
            System.out.println(c3.isInterface());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
