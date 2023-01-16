package com.alok.action;

public class DuplicateCode {
    private final static String CODE = "bounteous";
    public String calculateCode() {
        doSomeThing();
        return CODE;
    }
    public String getName() {  // Noncompliant
        System.out.println("mergeBranchcode");
        System.out.println("mergeBranchcode");
        System.out.println("mergeBranchcode");
        doSomeThing();
        System.out.println("code from master");
        System.out.println("code from master branch");
        System.out.println("code from master");
        System.out.println("code from master");
        return CODE;
    }
    public void doSomeThing() {
        int i =0;
        while (i==20){
            System.out.println(i);
            i++;
        }
        System.out.println("Do some thing");
        System.out.println("code from master");
    }
    public void mergeBranchcode() {
        System.out.println("mergeBranchcode");
        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
    }
}