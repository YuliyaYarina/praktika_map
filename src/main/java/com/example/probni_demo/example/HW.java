package com.example.probni_demo.example;

import java.util.*;

public class HW {
    public static void main(String[] args){

        System.out.println("task1");
        List<Integer> nums = new ArrayList<>(List.of(1, 6,1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println();

        System.out.println("task2");
        Set<Integer> numsSet = new HashSet<>(List.of(1, 1,16, 2, 3,8, 4, 4, 5, 5, 6, 7));
        task2(numsSet);
        System.out.println();

        System.out.println("task3");
        Set<String> stringSet = new HashSet<>(List.of("ya", "mi", "bobo","mi","tt"));
        task3(stringSet);
        System.out.println();

        System.out.println("task4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task4(strings);
        System.out.println();
    }
    public static void task1(List<Integer> nums) {
        for (Integer i : nums) {
            if (!((i % 2) == 0)) {
                System.out.print( i + ",");
            }
        }
    }

    public static void task2 (Set<Integer> numsSet) {
        for (Integer i : numsSet) {
            if (((i % 2) == 0)) {
                System.out.print( i + ",");
            }
        }
    }
    public static void task3(Set<String> list) {
       Set<String> uniqe = new HashSet<>(list);
                System.out.print(uniqe);
    }
    public static void task4(List<String> stringsMap) {
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
