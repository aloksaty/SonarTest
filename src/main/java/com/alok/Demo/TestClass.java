package com.alok.Demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class TestClass {
    String message;

    public TestClass(String message) {
        this.message = message;

    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Class classTest = TestClass.class;
        TestClass tc = null;
        if (input.equalsIgnoreCase("test")) {
            tc = (TestClass) classTest.newInstance();
        } else {
            tc = (TestClass) classTest.getConstructors()[0].newInstance("Hi I am from Constructor "+input);
        }
        try {
            tc.display();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        if (message.isEmpty()) {
            System.out.println("My test class");
        } else {
            System.out.println(message);
        }
    }
}
