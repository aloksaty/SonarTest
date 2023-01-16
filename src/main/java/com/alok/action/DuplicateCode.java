package com.alok.action;

public class DuplicateCode {
    private final static String CODE = "bounteous";
    public String calculateCode() {
        doSomeThing();
        return CODE;
    }
    public String getName() {  // Noncompliant
        doSomeThing();
        System.out.println("code from other branch");
        System.out.println("code from other branch");
        System.out.println("code from other branch");
        doSomeThing();
        System.out.println("code from master");
        return CODE;
    }
    public void doSomeThing() {
        System.out.println("Do some thing");
    }
    public void mergeBranchcode() {
        System.out.println("mergeBranchcode");
    }
}