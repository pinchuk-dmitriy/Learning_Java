package com.company.StrategyRealisation;

import com.company.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
