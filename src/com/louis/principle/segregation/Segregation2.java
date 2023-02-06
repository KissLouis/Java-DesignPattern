package com.louis.principle.segregation;

/**
 * 接口隔离原则案例2
 */
public class Segregation2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.depend1(new B2());
        a2.depend3(new B2());
        a2.depend4(new B2());
        a2.depend4(new D2());

        C2 c2 = new C2();
        c2.depend4(new D2());
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();
}

interface Interface4 {
    void operation4();
}

interface Interface5 {
    void operation5();
}


class B2 implements Interface1, Interface4 {
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
}

class D2 implements Interface4, Interface5 {
    @Override
    public void operation4() {
        System.out.println("D operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D operation5");
    }
}

class A2 {
    public void depend1(Interface1 i) {
        i.operation1();
    }


    public void depend3(Interface1 i) {
        i.operation3();
    }


    public void depend4(Interface4 i) {
        i.operation4();
    }
}

class C2 {
    public void depend4(Interface4 i) {
        i.operation4();
    }

    public void depend5(Interface5 i) {
        i.operation5();
    }

}