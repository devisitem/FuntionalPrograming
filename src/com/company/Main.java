package com.company;

import com.company.functional.FunctionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /**
         * Map Function Test
         */
        FunctionTest.mapFunctionTest();

        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person(1,"김철수"));
        map.put(2,new Person(1,"김철수"));
        map.put(3,new Person(1,"김철수"));
        map.put(4,new Person(1,"김철수"));
        map.put(5,new Person(1,"김철수"));

    }

    public static class Person{
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
