package com.pancras.design.strategy.entities;

import com.pancras.design.strategy.FlyBehavior;
import com.pancras.design.strategy.QuackBehavior;
import lombok.Data;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 2:21
 * @Description: Duck类
 */
@Data
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    /**
     * Duck display abstract method
     */
    public abstract void display();
    
    public void swim() {
        System.out.println("All Duck can Swim");
    }
    
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
}
