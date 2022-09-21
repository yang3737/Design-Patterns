package cn.tq.design.strategy;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i can not fly");
    }
}
