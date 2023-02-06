package com.louis.principle.dependecyinversion;

/**
 * 依赖倒转原则案例2
 */
public class DependecyInversion2 {

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new Weixin2());
    }

}

interface ISend {
    void Send();
}

class Email2 implements ISend {
    @Override
    public void Send() {
        System.out.println("email send");
    }
}

class Weixin2 implements ISend {
    @Override
    public void Send() {
        System.out.println("weixin send");
    }
}

class Person2 {
    public void receive(ISend iSend) {
        iSend.Send();
    }
}