package com.pancras.design.observer.subject;

import com.pancras.design.observer.Measurements;
import com.pancras.design.observer.observer.Observer;

import java.util.ArrayList;

/**
 * @Author: Pancras
 * @Date: 2022-09-20
 * @Time: 22:16
 * @Description:
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private Measurements measurements;
    
    public WeatherData() {
        this.observers = new ArrayList<>();
        this.measurements = new Measurements();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }
    
    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(measurements);
        }
    }
    
    @Override
    public void measurementsChanged() {
        notifyObserver();
    }
    
    @Override
    public void setMeasurements(float temp, float humidity, float pressure) {
        measurements.setTemperature(temp);
        measurements.setHumidity(humidity);
        measurements.setPressure(pressure);
        measurementsChanged();
    }
    
    
}
