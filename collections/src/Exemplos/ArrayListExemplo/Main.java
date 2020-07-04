package Exemplos.ArrayListExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        List<Integer> num2 = new ArrayList<>(6);
        num2.add(99);

        List<Integer> num3 = new ArrayList<>(Arrays.asList(1, 25, 3, 4, 5));
        System.out.println(num3.toString());

        num3.add(12);
        System.out.println(num3.toString());

        num3.addAll(num2);
        System.out.println(num3.toString());

//        num3.clear(); limpa a lista
//        num3.clone(); shallow copy

        System.out.println(num3.contains(99) ? "99 existe": "99 não existe");
        System.out.println(num3.indexOf(99)); // retorna o indice do valor 99

        num3.forEach(n -> System.out.println(n));
        Consumer<Integer> lambda = n -> System.out.println(n); // outra forma
        num3.forEach(lambda);

        System.out.println(num3.get(0)); // pegando o elemento no indice 0

        System.out.println(num3.indexOf(99)); // retorna o indice do elemento 99

        num3.remove(0); // remove o elemento do indice 0
        System.out.println(num3.toString());

        num3.sort(Integer::compareTo);
//        num3.sort((o1, o2) -> o1.compareTo(o2)); ou
        System.out.println(num3.toString());
    }
}
