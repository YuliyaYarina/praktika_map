package com.example.probni_demo.example;

import org.apache.commons.lang3.StringUtils;

public class Biblioteka {
    public static void main(String[] args) {


        String letter = "ivanov Ivan";
        String emplyStr = "   ";

        System.out.println(StringUtils.capitalize(letter));
        System.out.println(StringUtils.deleteWhitespace(letter));
        System.out.println(StringUtils.substringAfterLast(letter, " "));

        System.out.println(StringUtils.isAllUpperCase(letter));
        System.out.println(StringUtils.isAlphanumericSpace(letter));
        System.out.println(StringUtils.isWhitespace(emplyStr));
    }


}
