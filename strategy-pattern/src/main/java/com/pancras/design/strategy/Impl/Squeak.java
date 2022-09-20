package com.pancras.design.strategy.Impl;

import com.pancras.design.strategy.QuackBehavior;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 2:58
 * @Description:
 */
public class Squeak implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Duck Squeak Squeak Squeak");
    }
}
