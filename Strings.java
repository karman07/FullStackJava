package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){
        String name = new String("Karman Singh Arora" );
        int value = name.length();
        String UpperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();
        String trim = name.trim();
        System.out.println(name);
        System.out.println(value);
        System.out.println(UpperCase);
        System.out.println(lowerCase);
        System.out.println(trim);
        System.out.println(name.substring(7));
        System.out.println(name.substring(0,6));
        System.out.println(name.replace('k','A'));
        System.out.println(name.startsWith("K"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a" , 13));
    }
}
