package com.alok.Demo;

import java.util.HashMap;

public class Map_Operations {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('a',1);
        hashMap.put('b',2);
        hashMap.put('a',hashMap.get('a')+10);
        System.out.println(hashMap);
    }
}
