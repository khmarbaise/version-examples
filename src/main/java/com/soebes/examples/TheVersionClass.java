package com.soebes.examples;

public class TheVersionClass
{

    public TheVersionClass()
    {
        System.out.println("Implementation Version:" + this.getClass().getPackage().getImplementationVersion());
        System.out.println(" Specification Version:" + this.getClass().getPackage().getSpecificationVersion());
    }
 
    public static void main(String[] args) {
        TheVersionClass tvc = new TheVersionClass();
    }
}
