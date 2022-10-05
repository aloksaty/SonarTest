
package com.alok.Demo;

import java.util.Scanner;

class SuperClass {
    public void method(){
        System.out.println("Super class method");
    }
}

class SubCls extends SuperClass{

    public void method(){

        System.out.println("Super class method");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class class_ = Class.forName(className);
        SuperClass superClass = (SuperClass) class_.newInstance();// object creation ,if we pass SuperClass ,will call super method and by passing SubClass will call Subclass method
        superClass.method();

    }
}

