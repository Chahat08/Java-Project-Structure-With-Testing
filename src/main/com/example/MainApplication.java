package com.example;

import com.example.package1.ClassA;
import com.example.package2.ClassC;
public class MainApplication {

    private ClassA classA;
    private ClassC classC;

    public MainApplication(){
        this.classA = new ClassA();
        this.classC = new ClassC();
    }
    public static void main(String args[]){
        MainApplication application = new MainApplication();
        System.out.println(application.classA);
        System.out.println(application.classC);
    }

}