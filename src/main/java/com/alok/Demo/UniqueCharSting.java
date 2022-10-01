package com.alok.Demo;

public class UniqueCharSting {

    public static void main(String[] args) {
            int[] ascii = new int[256];
            boolean isDuplicateChar=false;
            String str = "abcdefqwrt";
            for (int i = 0; i < str.length(); i++) {
                if(ascii[(int)str.charAt(i)]==0){
                    ascii[(int)str.charAt(i)]++;
                }else {
                    isDuplicateChar = true;
                    break;
                }
            }
        if(!isDuplicateChar){
            System.out.println("String has unique char");
        }else {
            System.out.println("String has duplicate char");
        }
    }
}
