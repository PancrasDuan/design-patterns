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
 * https://www.yuque.com/docs/share/8b026e1f-af98-478d-8f9d-60e608d2403f?# 《策略模式》
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
