package com.example;

import com.example.MainApplication;
import com.example.package1.ClassA;
import com.example.package2.ClassC;

public class MainApplicationTests{

    private MainApplication mainApplicationUnderTest;
    private ClassA classA;
    private ClassC classC;

    public MainApplicationTests(){
        this.mainApplicationUnderTest = new MainApplication();
        this.classA = new ClassA();
        this.classC = new ClassC();
    }

    public void toStringClassATest() {
        try {
            if (this.mainApplicationUnderTest.toStringClassA()!=this.classA.toString())
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test toStringClassATest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void toStringClassCTest() {
        try {
            if (this.mainApplicationUnderTest.toStringClassC()!=this.classC.toString())
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test toStringClassCTest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String Args[]) {
        MainApplicationTests testClass = new MainApplicationTests();
        testClass.toStringClassATest();
        testClass.toStringClassCTest();
    }

}