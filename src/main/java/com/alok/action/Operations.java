package com.alok.action;

public class Operations {
    public int  add(int a ,int b){
        return a+b;
    }
    public int  addition(int a ,int b){
        return a+b;
    }
    public int  sum(int x ,int y){
        int z=x+y;
        return x+y;
    }
    public int  total(int m ,int n){
        return m+n;
    }
    public int  multiply(int m ,int n){
        return m*n;
    }
    public int  substract(int m ,int n){
        return m-n;
    }
    public int  sub(int m ,int n){
        return m-n;
    }
    public static void main(String[] args) {
        System.out.println(new Operations().add(12,13));
        System.out.println(new Operations().multiply(12,13));
        System.out.println(new Operations().multiply(12,13));
        System.out.println(new Operations().multiply(12,13));

        System.out.println(new Operations().multiply(14,13));
        System.out.println(new Operations().multiply(16,13));
        System.out.println(new Operations().multiply(19,13));
        System.out.println(new Operations().multiply(29,13));
        System.out.println(new Operations().multiply(40,13));
        System.out.println(new Operations().multiply(29,13));
        System.out.println(new Operations().multiply(50,13));
    }
}
