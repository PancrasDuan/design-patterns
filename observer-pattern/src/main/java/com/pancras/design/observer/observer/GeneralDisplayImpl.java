package com.pancras.design.observer.observer;

import com.pancras.design.observer.Measurements;
import com.pancras.design.observer.subject.WeatherDataExt;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Pancras
 * @Date: 2022-09-21
 * @Time: 0:26
 * @Description: 实现了java自带Observer接口
 */
public class GeneralDisplayImpl implements Observer, DisplayElement {
    private Observable observable;
    private Measurements measurements;
    
    public GeneralDisplayImpl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("GeneralDisplayImpl");
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Measurements) {
            System.out.println(arg);
            display();
        } else {
            System.out.println(o);
            display();
        }
    }
}
