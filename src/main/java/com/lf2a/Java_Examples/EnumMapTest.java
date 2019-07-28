package com.lf2a.Java_Examples;

import java.util.EnumMap;
import java.util.Map;

enum Action {TURN_LEFT, TURN_RIGHT, SHOOT}

public class EnumMapTest {
    public static void main(String[] args) {
        Map<Action, String> map = 
          new EnumMap<Action, String>(Action.class);
        
        map.put(Action.TURN_LEFT, "Luiz");
        map.put(Action.TURN_RIGHT, "Filipy");
        map.put(Action.SHOOT, "Brasil");
        
        for(Action action : Action.values( ) ) {
            System.out.println(map.get(action));
        }
    }
}