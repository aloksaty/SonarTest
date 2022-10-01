package com.alok.Demo;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};
        int rot_position = 3;
        int[] tmp_numbers= new int[numbers.length];
        for (int i = numbers.length; i>=0; i--) {
            if(i>rot_position) {
                tmp_numbers[numbers.length-i] = numbers[i-1];
            }else {
                continue;
            }
        }
        System.out.println(Arrays.toString(tmp_numbers));
    }
}
