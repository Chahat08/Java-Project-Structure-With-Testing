package com.example.package2;

import com.example.package2.ClassA;
import com.example.package2.ClassC;

public class Package2Tests{

    private ClassA classAUnderTest;
    private ClassC classCUnderTest;

    public Package2Tests(){
        this.classAUnderTest = new ClassA();
        this.classCUnderTest = new ClassC();
    }

    public void classCTest() {
        try {
            if (this.classCUnderTest.toString()!="ClassC, package2")
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test package2 classCTest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void classATest() {
        try {
            if (this.classAUnderTest.toString()!="ClassA, package2")
                throw new Exception("TEST FAILED");
            else
                System.out.println("Test package2 classATest passed successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String Args[]) {
        Package2Tests testClass = new Package2Tests();
        testClass.classATest();
        testClass.classCTest();
    }

}