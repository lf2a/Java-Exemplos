package Exemplos.HashMapExemplo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,  "A");
        map.put(2,  "B");
        map.put(3,  "C");

        System.out.println(map);

        map.remove(3);
        System.out.println(map);

//        map.clear(); limpa o map

        System.out.println(map.containsKey(1));

        System.out.println(map.containsValue("D"));

        System.out.println(map.get(2));
    }
}
