package com.alok.action;

public class Operations {
    public int  add(int a ,int b){
        return a+b;
    }
    public int  addition(int a ,int b){
        return a+b;
    }
    public int  sum(int x ,int y){
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

    public static void main(String[] args) {
        System.out.println(new Operations().add(12,13));
        System.out.println(new Operations().multiply(12,13));
    }
}
