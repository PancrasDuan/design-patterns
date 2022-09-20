package com.pancras.design.observer.subject;

import com.pancras.design.observer.Measurements;

import java.util.Observable;

/**
 * @Author: Pancras
 * @Date: 2022-09-21
 * @Time: 0:02
 * @Description: 继承了java自带Observable类
 */
public class WeatherDataExt extends Observable {

    private Measurements measurements;
    
    public WeatherDataExt() {
        measurements = new Measurements();
    }
    
    public void measurementsChanged() {
        setChanged();
        // push
        notifyObservers(measurements);
        setChanged();
        // pull
        notifyObservers();
    }
    public void setMeasurements(float temp, float humidity, float pressure) {
        measurements.setTemperature(temp);
        measurements.setHumidity(humidity);
        measurements.setPressure(pressure);
        measurementsChanged();
    }
}
