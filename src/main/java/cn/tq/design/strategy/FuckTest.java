package cn.tq.design.strategy;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class FuckTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        Duck mobel = new ModelDuck();
        mobel.fly();
        mobel.setFlyBehavior(new FlyWithWings());
        mobel.fly();
    }
}
