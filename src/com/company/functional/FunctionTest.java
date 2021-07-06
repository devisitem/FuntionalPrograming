package com.company.functional;

import java.util.HashMap;
import java.util.Map;


public class FunctionTest {

    public static void mapFunctionTest(){

        Map<String, Integer> map = new HashMap<>();
        map.put("John",25);
        map.put("Mike",55);
        map.put("John Jain",62);
        map.put("Gen",57);
        // 해당 맵에서 존재하는 "John"을 key로 가지고 있는 객체가 있다면 value 를 리턴하고 없으면 넣고 결과값을 리턴
        Integer computeIfAbsent = map.computeIfAbsent("John", s -> s.length());
        /**
         * map = {Gen=57, Mike=55, John=25, John Jain=62}
         * value = 25
         */
        System.out.println("map = " + map);
        System.out.println("computeIfAbsent = " + computeIfAbsent);
        System.out.println("----------------");

        // 존재한다면 연산 수행 후 리턴되는 결과 값으로 변경 (존재하지 않는다면 연산을 수행하지도,넣지도 않음)
        Integer computeIfPresentValue = map.computeIfPresent("John", (k, v) -> {
            System.out.println("{ " + k + " : " + v + " }");
            return k.length();
        });

        System.out.println("map = " + map);
        System.out.println("computeIfPresentValue = " + computeIfPresentValue);
        System.out.println("----------------");

        // 순회
        map.forEach((k,v) -> {
            System.out.println("{ " + k + " : " + v + " }");
        });

        //결과 값이 존재한다면 해당값으로 Key와 value로 넣어주고 리턴한다.(존재하지 않고 기존 value값이 null이라면 해당 key의 map을 제거 후 null리턴)
        Integer computeValue = map.compute("John", (k, v) ->
                k.length() + v
        );

        System.out.println("map = " + map);
        System.out.println("computeValue = " + computeValue);
        System.out.println("----------------");

    }
}
