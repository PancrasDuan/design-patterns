package com.pancras.design.strategy.entities;

import com.pancras.design.strategy.Impl.FlyNoWay;
import com.pancras.design.strategy.Impl.Quack;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 3:19
 * @Description:
 */
public class ModelDuck extends Duck{
    
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a ModelDuck");
    }
}
