package com.alok.Demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class MainClass {
    public static final double INDEX_NOT_FOUND = -1;

    public static void main(String[] args) throws IllegalAccessException,
            InvocationTargetException, InstantiationException {

        System.out.println(testAnagram("Amry t", "amry t"));
        String name = "this is String";
        String[] splitStr = name.split(" ");
        System.out.println(Arrays.toString(splitStr));
        String input = "this is python programing in python";
        String substring = "python";
        String tmp = "";

        if (input.indexOf("python") != INDEX_NOT_FOUND) {
            System.out.println("******" + true);
        }
        for (int i = 0; i <= input.length() - substring.length(); i++) {
            for (int j = i; j < substring.length() + i; j++) {
                tmp = tmp + input.charAt(j);
            }
            if (tmp.equals(substring)) {
                System.out.println("String presents");
                break;
            }
            tmp = "";
        }


       /* Class classObj;
        Scanner scanner = new Scanner(System.in);
        String inputClass=scanner.next();
        if(inputClass.equalsIgnoreCase("super")){

            classObj = SuperClass.class;

        }else{
            classObj = SubClass.class;
        }

        SuperClass obj =(SuperClass) classObj.getConstructors()[0].newInstance();
        obj.display();
    }
     */
    }

    public static String testAnagram(String str, String str_is) {
        for (char c : str_is.toLowerCase().toCharArray()) {
            str = str.toLowerCase().replaceFirst(String.valueOf(c), "");
        }
        return str;
    }
}
