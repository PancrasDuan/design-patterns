package com.pancras.design.strategy.entities;

import com.pancras.design.strategy.Impl.FlyWithWings;
import com.pancras.design.strategy.Impl.Quack;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 3:05
 * @Description:
 */
public class MallardDuck extends Duck {
    
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void display() {
        System.out.println("I am a MallardDuck");
    }
}
