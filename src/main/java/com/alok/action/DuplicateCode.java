package com.alok.action;

public class DuplicateCode {
    private final static String CODE = "bounteous";
    int name =10;
    int x =10;
    
    public String calculateCode() {
        doSomeThing();
        return CODE;
    }
    public String getName() {  // Noncompliant
        System.out.println("mergeBranchcode");
        System.out.println("mergeBranchcode");
        System.out.println("mergeBranchcode");
        doSomeThing();
        System.out.println("code from other branch");
        System.out.println("code from other");
        System.out.println("code from other branch");

        doSomeThing();
        System.out.println("code from master");
        System.out.println("code from master branch");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");
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
        for (int j = 0; j < 120; j++) {
            System.out.println(j);
        }
        System.out.println("code from other branch");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");
        System.out.println("code from master");

    }
    public void mergeBranchcode() {
        System.out.println("mergeBranchcode");

        int j =0;
        while (j==20) {
            System.out.println(j);
            j++;
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
    }
}