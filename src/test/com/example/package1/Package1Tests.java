package com.example.package1;

import com.example.package1.ClassA;
import com.example.package1.ClassB;

public class Package1Tests{

    private ClassA classAUnderTest;
    private ClassB classBUnderTest;

    public Package1Tests(){
        this.classAUnderTest = new ClassA();
        this.classBUnderTest = new ClassB();
    }

    public void classATest() {
        try {
            if (this.classATest().toString()!="ClassA, package1")
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test package1 classATest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void classBTest() {
        try {
            if (this.classBTest().toString()!="ClassB, package1")
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test package1 classBTest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String Args[]) {
        Package1Tests testClass = new Package1Tests();
        testClass.classATest();
        testClass.classBTest();
    }

}