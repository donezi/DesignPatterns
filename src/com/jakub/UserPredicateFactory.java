package com.jakub;


import java.util.function.Predicate;

public class UserPredicateFactory {
    // lambda - anonimowa implmentacja interfajsu z jedną metodą
    public static Predicate<String> nameStartsWith(String prefix) {
//        return new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith(prefix);
//            }
//        };
//        OR
        return s -> s.startsWith(prefix);
    }
}
