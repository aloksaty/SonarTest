package com.alok.Demo;

public class InnerClassMethod {
    InnerClass innerClass = new InnerClass();
    protected class InnerClass{

        public void method(){

        }
    }

    public static void main(String[] args) {
        InnerClassMethod innerClassMethod = new InnerClassMethod();
        innerClassMethod.innerClass.method();
    }
}
