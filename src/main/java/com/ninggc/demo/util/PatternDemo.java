package com.ninggc.demo.util;

import java.util.regex.Pattern;

public class PatternDemo {
    private static String regex = "1";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher("123/456%789=0").matches());
    }
}
