import annotation.AnnotationUm;

import java.lang.reflect.Method;

public class Main {
    @AnnotationUm(valor = 5, nome = "Luiz", isAdmin = true)
    public void ola() {
        System.out.println("Olá Mundo!");
    }

    public static void main(String args[]) throws Exception {

        Main main = new Main();
        Method ola = main.getClass().getMethod("ola");

        AnnotationUm a = ola.getAnnotation(AnnotationUm.class);
        System.out.println("valor é: " + a.valor());
        System.out.println("nome é: " + a.nome());
        System.out.println("isAdmin é: " + a.isAdmin());
    }
}
