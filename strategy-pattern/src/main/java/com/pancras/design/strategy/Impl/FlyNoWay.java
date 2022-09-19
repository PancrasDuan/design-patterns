package com.pancras.design.strategy.Impl;

import com.pancras.design.strategy.FlyBehavior;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 2:57
 * @Description:
 */
public class FlyNoWay implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("Duck FlyNoWay!!!");
    }
}
