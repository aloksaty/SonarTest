package com.alok.action;

public class DuplicateCode {
    private final static String CODE = "bounteous";
    public String calculateCode() {
        doSomeThing();
        return CODE;
    }
    public String getName() {  // Noncompliant
        doSomeThing();
        return CODE;
    }
    public void doSomeThing() {
        System.out.println("Do some thing");
    }
    public void doSomeTest() {
        System.out.println("Do Test");
    }
}