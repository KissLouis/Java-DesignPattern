package com.louis.principle.singleresponsibility;

/**
 * 单一职责原则案例2
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.roadRun("汽车");
        vehicle3.roadRun("公交");
        vehicle3.AirRun("飞机");
    }
}


//方式3的分析
//1. 这种修改方法没有对原来的类做大的修改，只是增加方法
//2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
class Vehicle3 {
    public void roadRun(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
    public void AirRun(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
    public void WaterRun(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
