package com.louis.principle.segregation;

/**
 * 接口隔离原则案例
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new D());
    }
}


interface Interface {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}


class B implements Interface {

    @Override
    public void operation1() {
        System.out.println("B operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B operation5");
    }
}


class D implements Interface {

    @Override
    public void operation1() {
        System.out.println("D operation1你好");
    }

    @Override
    public void operation2() {
        System.out.println("D operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D operation5");
    }
}


class A {
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend2(Interface i) {
        i.operation2();
    }

    public void depend3(Interface i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface i) {
        i.operation1();
    }

    public void depend4(Interface i) {
        i.operation4();
    }

    public void depend5(Interface i) {
        i.operation5();
    }
}