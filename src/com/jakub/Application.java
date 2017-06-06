package com.jakub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {


        List<List<String>> nameList = Arrays.asList(Arrays.asList("Jakub", "Marcin", "Andrzej"),
                Arrays.asList("Anna", "Antonina", "Małgorzata"));

        nameList.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.startsWith("A"))
                .forEach(e -> System.out.println(e));

        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Jakub", "Marcin", "Andrzej"));
        map.put("women", Arrays.asList("Anna", "Antonina", "Małgorzata"));

        map.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
//                .map(e-> e.getValue())
//                .flatMap(e-> e.stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .forEach(e -> System.out.println(e));


        List<String> names = Arrays.asList("Szymon", "Jakub", "Anna", "Kasia");
//        System.out.println("Hello World");
    }
}
