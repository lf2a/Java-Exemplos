package Exemplos.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <h1>Main.java</h1>
 * ---
 *
 * @author Luiz Filipy
 * @version 1.0
 * @since 06/02/2021
 */
public class Main {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Luiz");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); // pool() - retorna o elemento e o remove da fila
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

        for (String c : filaBanco) {
            System.out.println(c);
        }

        Iterator<String> stringIterator = filaBanco.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
