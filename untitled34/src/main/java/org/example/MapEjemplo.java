package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapEjemplo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("2", "T");

        map.get("3");
        System.out.println(map);
        System.out.println(map.size());
    }
}
