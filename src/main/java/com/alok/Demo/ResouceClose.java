package com.alok.Demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ResouceClose {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\testout.txt");
        FileReader fr= null;
        try {
            fr = new FileReader(file);
            System.out.println(fr.read());
            System.out.println(fr);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fr.read());
    }
}
