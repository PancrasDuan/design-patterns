package com.pancras.design.strategy;

import com.pancras.design.strategy.Impl.FlyRocketPowered;
import com.pancras.design.strategy.entities.Duck;
import com.pancras.design.strategy.entities.MallardDuck;
import com.pancras.design.strategy.entities.ModelDuck;

/**
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 2:43
 * @Description: 主函数
 */
public class Main {
    
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
    
}
