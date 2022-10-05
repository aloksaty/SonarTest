package com.alok.Demo;

import java.util.LinkedHashMap;

public class ReverseSpecialString {
    public static final String input = "LUL#ULE%MO&N";

    public static void main(String[] args) {
        System.out.println(reverseWithoutSpecialChar(input));
    }

    private static String reverseWithoutSpecialChar(String str) {
        LinkedHashMap<Integer,Character> position_map = new LinkedHashMap<>();
        String reverse="";
        for (int i = str.length()-1; i>=0; i--) {
            if (Character.isAlphabetic(str.charAt(i))){
                reverse=reverse+str.charAt(i);
            }else {
                position_map.put(i,str.charAt(i));
            }
        }
        for (int i = 0; i < reverse.length(); i++) {
            if(position_map.containsKey(i)){
                reverse=reverse.substring(0,i)+position_map.get(i)+reverse.substring(i,reverse.length());
            }
        }
        return reverse;
    }
}
