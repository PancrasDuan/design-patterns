package com.pancras.design.strategy.Impl;

import com.pancras.design.strategy.FlyBehavior;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 3:20
 * @Description:
 */
public class FlyRocketPowered implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("Duck FlyRocketPowered");
    }
}
