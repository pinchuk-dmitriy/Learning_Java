package com.company.AbstractClasses;

import com.company.Interfaces.FlyBehavior;
import com.company.Interfaces.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void performFly()
    {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyClass){
        flyBehavior = flyClass;
    }
    public void setQuackBehavior(QuackBehavior quackClass){
        quackBehavior = quackClass;
    }
    public abstract void display();
}
