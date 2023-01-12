package com.example;

import com.example.package1.ClassA;
import com.example.package2.ClassC;
public class MainApplication {

    private ClassA classA;
    private ClassC classC;

    public String toStringClassA(){
        return classA.toString();
    }

    public String toStringClassC(){
        return classC.toString();
    }

    public MainApplication(){
        this.classA = new ClassA();
        this.classC = new ClassC();
    }
    public static void main(String args[]){
        MainApplication application = new MainApplication();
        System.out.println(application.toStringClassA());
        System.out.println(application.toStringClassC());
    }

}