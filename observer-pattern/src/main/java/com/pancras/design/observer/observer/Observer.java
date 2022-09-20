package com.pancras.design.observer.observer;

import com.pancras.design.observer.Measurements;

/**
 * @author Pancras
 * @User: Pancras
 * @Date: 2022-09-20
 * @Time: 22:07
 * @Description:
 */
public interface Observer {
    
    /**
     * update
     * @param measurements
     */
    void update(Measurements measurements);
}
