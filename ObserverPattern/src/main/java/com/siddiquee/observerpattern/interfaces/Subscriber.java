/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.observerpattern.interfaces;

/**
 *
 * @author Istiyak
 */
public interface Subscriber {
    
    void update();
    void setTopic(Topic topic);    
}