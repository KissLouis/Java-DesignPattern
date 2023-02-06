package com.louis.principle.dependecyinversion;

/**
 * 依赖倒转原则案例
 */
public class DependecyInversion1 {

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new Email1());
    }

}

class Email1 {
    public void Send() {
        System.out.println("Hello World");
    }
}

class Person1 {
    public void receive(Email1 email1) {
        email1.Send();
    }
}