package main.java.GFG;

import java.util.HashMap;
import java.util.Map;

final class ImmutableCustom {

    private final String name;
    private final int age;
    private final Map<String, String> map;

    private ImmutableCustom(String name, int age, Map<String, String> map) {
        this.name = name;
        this.age = age;

        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.map = tempMap;
    }
}
