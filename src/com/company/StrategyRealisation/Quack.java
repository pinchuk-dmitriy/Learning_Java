package com.company.StrategyRealisation;

import com.company.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK!");
    }
}
