package com.pancras.design.strategy.Impl;

import com.pancras.design.strategy.FlyBehavior;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 2:56
 * @Description:
 */
public class FlyWithWings implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("Duck FlyWithWings");
    }
}
