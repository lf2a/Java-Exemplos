package Exemplos.HashSetExemplo;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");

        System.out.println(hashSet);

        boolean found = hashSet.contains("A"); // true
        System.out.println(found);

        hashSet.remove("D");

        Iterator<String> itr = hashSet.iterator();

        while (itr.hasNext()) {
            String value = itr.next();

            System.out.println("Valor: " + value);
        }
    }
}
