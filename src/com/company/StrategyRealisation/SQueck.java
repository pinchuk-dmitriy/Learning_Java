package com.company.StrategyRealisation;

import com.company.Interfaces.QuackBehavior;

public class SQueck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("SQUECK!");
    }
}
