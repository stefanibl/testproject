package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello Intellij IDEA!!!");
	sayHello("Stefani");
	sayGoodBye("Monday");
        System.out.println("Introduction");
        System.out.println("new commit");
        System.out.println("Stefani");
        System.out.println("new change");
        System.out.println("revert");
        System.out.println("Hello Ivana");
        System.out.println("Amend");
        System.out.println("Git Bash Here");
        System.out.println("Hi");
    }

    private int a = 27;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Main(int age) {
        this.age = age;
    }

    public static void sayHello(String name){
        System.out.println("hello" +name);
    }

    /*
    safe
    users
    bug
     */

    private int age = 7;

    public static void sayGoodBye(String name){
        System.out.println("Good Bye " +name);
        // TODO: Add customer support
        // da se proveri vtoriot metod

    }
}
