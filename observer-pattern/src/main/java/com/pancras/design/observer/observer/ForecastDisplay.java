package com.pancras.design.observer.observer;

import com.pancras.design.observer.Measurements;
import com.pancras.design.observer.subject.Subject;

/**
 * @Author: Pancras
 * @Date: 2022-09-20
 * @Time: 22:53
 * @Description:
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    
    private float humidity;
    
    private float pressure;
    
    private Subject subject;
    
    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("ForecastDisplay#temperature is " + temperature + ", humidity is " + humidity + ", pressure is " + pressure);
    }
    
    @Override
    public void update(Measurements measurements) {
        this.temperature = measurements.getTemperature();
        this.humidity = measurements.getHumidity();
        this.pressure = measurements.getPressure();
        display();
    }
}
