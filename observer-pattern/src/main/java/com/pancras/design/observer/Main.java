package com.pancras.design.observer;

import com.pancras.design.observer.observer.CurrentConditionsDisplay;
import com.pancras.design.observer.observer.ForecastDisplay;
import com.pancras.design.observer.observer.GeneralDisplayImpl;
import com.pancras.design.observer.observer.Observer;
import com.pancras.design.observer.observer.StatisticsDisplay;
import com.pancras.design.observer.subject.Subject;
import com.pancras.design.observer.subject.WeatherData;
import com.pancras.design.observer.subject.WeatherDataExt;

import java.util.Observable;

/**
 * @author Pancras
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 21:41
 * @Description: 出版者 + 订阅者 = 观察者模式
 */
public class Main {
    
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
    
        Observer observer = new CurrentConditionsDisplay(weatherData);
        Observer observer1 = new StatisticsDisplay(weatherData);
        Observer observer2 = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(10.0f, 9.9f, 8.8f);
        weatherData.removeObserver(observer1);
        weatherData.setMeasurements(1.0f, 0.9f, 0.8f);
    
        WeatherDataExt observable = new WeatherDataExt();
        java.util.Observer display = new GeneralDisplayImpl(observable);
    
        observable.setMeasurements(10.0f, 9.9f, 8.8f);
    }
}
