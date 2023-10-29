package com.example.probni_demo.example;

import org.apache.commons.lang3.StringUtils;

import java.util.*;


public class HW {
    public static void main(String[] args) {

        System.out.println("task1");
        List<Integer> nums = new ArrayList<>(List.of(1, 6, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println();

        System.out.println("task2");
        Set<Integer> numsSet = new HashSet<>(List.of(1, 1, 16, 2, 3, 8, 4, 4, 5, 5, 6, 7));
        task2(numsSet);
        System.out.println();

        System.out.println("task3");
        List<String> stringSet = new ArrayList<>(List.of("ya", "mi", "bobo", "mi", "tt", "ya"));
        task3(stringSet);
        System.out.println();

        System.out.println("task4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        task4(strings);
        System.out.println();

        String letter = "ivanov Ivan";
        String emplyStr = "   ";

        System.out.println(StringUtils.capitalize(letter));
        System.out.println(StringUtils.deleteWhitespace(letter));
        System.out.println(StringUtils.substringAfterLast(letter, " "));

        System.out.println(StringUtils.isAllUpperCase(letter));
        System.out.println(StringUtils.isAlphanumericSpace(letter));
        System.out.println(StringUtils.isWhitespace(emplyStr));
    }

    public static void task1(List<Integer> nums) {

//        for (Integer i : nums) {
//            if (!((i % 2) == 0)) {
//                System.out.print( i + ",");
//            }
//        }
        nums.removeIf(e -> e % 2 == 0);
        System.out.println(nums);

    }

    public static void task2 (Set<Integer> numsSet) {

        numsSet.removeIf(e -> e % 2 == 1 );
        System.out.println(numsSet);
    }

    public static void task3(List<String> list) {
//        Stream.of(list)
//                .forEach(System.out::println);
        list.stream()
                .distinct()
                .forEach(System.out::println);

//       Set<String> uniqe = new HashSet<>(list);
//                System.out.print(uniqe);
    }
    public static void task4(List<String> stringsMap) {

//long optional = Optional.of(stringsMap).stream().count();
//        stringsMap.stream()
//                .map(e->e.toString())
//                .count();
//        System.out.println(optional);

        Map<String,Integer> map = new HashMap<>();

        for (String i : stringsMap) {
            if (map.containsKey(i)){
                map.put(i,map.get(i) +1);
            }else {
                map.put(i,1);
            }
        }
        for (Map.Entry<String,Integer> rMap : map.entrySet()) {

            System.out.println(rMap.getKey()+ ": " + rMap.getValue());
        }
    }



}
