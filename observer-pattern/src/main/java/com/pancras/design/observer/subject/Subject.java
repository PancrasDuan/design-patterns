package com.pancras.design.observer.subject;

import com.pancras.design.observer.observer.Observer;

/**
 * @author Pancras
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 22:04
 * @Description: myself subject
 */
public interface Subject {
    
    /**
     * register
     * @param o
     */
    void registerObserver(Observer o);
    
    /**
     * remove
     * @param o
     */
    void removeObserver(Observer o);
    
    /**
     * notify
     */
    void notifyObserver();
    
    /**
     * measurementsChanged
     */
    void measurementsChanged();
    
    /**
     * setMeasurements
     * @param temp
     * @param humidity
     * @param pressure
     */
    void setMeasurements(float temp, float humidity, float pressure);
}
