package com.alok.Demo;

public class StringOperations {
    static final int ASCII_SIZE = 256;
    public static final String STRING_INPUT_TO_MAP = "geeksforgeeks";

    public static void main(String[] args) {

        splitStringToMap(STRING_INPUT_TO_MAP);
        mapToAscciArry();
        String full_name = "satyaditya";
        String[] full_name_Array = full_name.split(" ");
        String updated_name = "";
        for (String name_ : full_name_Array) {
            String name_caps = Character.toUpperCase(name_.charAt(0)) + name_.substring(1, name_.length() - 1) + Character.toUpperCase(name_.charAt(name_.length() - 1));
            updated_name = updated_name + " " + name_caps;
        }
        System.out.println(updated_name);

    }

    private static void splitStringToMap(String str) {
        String tmp = "";
        for (char ch : str.toCharArray()) {
            if (tmp.indexOf(ch) == -1) {
                tmp = tmp + String.valueOf(ch);
            }
        }
    }

    private static void mapToAscciArry() {
        String name = "Satyaditya alok";
        int[] count = new int[ASCII_SIZE];
        for (int i = 0; i < name.length(); i++) {
            count[(int) name.charAt(i)]++;
        }
    }

}
