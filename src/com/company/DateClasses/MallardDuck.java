package com.company.DateClasses;

import com.company.AbstractClasses.Duck;
import com.company.StrategyRealisation.FlyWithWings;
import com.company.StrategyRealisation.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm mallardDuck!");
    }
}
