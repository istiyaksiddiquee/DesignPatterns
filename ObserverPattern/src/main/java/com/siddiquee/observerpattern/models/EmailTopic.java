/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.observerpattern.models;

import com.siddiquee.observerpattern.interfaces.Subscriber;
import com.siddiquee.observerpattern.interfaces.Topic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Istiyak
 */
public class EmailTopic implements Topic {

    private String messageToBroadcast; 
    private List<Subscriber> subscriberList; 

    public EmailTopic() {
        this.subscriberList = new ArrayList<Subscriber>();
    }        
    
    @Override
    public void register(Subscriber subscriber) {
        if (subscriber == null) {
            throw new NullPointerException("Null object/subscriber");
        }
        if (!this.subscriberList.contains(subscriber)) {
            this.subscriberList.add(subscriber);
        }        
    }

    @Override
    public void unregister(Subscriber subscriber) {
        if (subscriber != null) {
            this.subscriberList.remove(subscriber);           
        }
    }

    @Override
    public Object getUpdate(Subscriber subscriber) {
        return this.messageToBroadcast;
    }

    @Override
    public void notifyObservers() {
        if (!this.subscriberList.isEmpty()) {
            for (Subscriber subscriber : this.subscriberList) {
                subscriber.update();
            }
        }
    }

    public void postMessage(String message) {
        System.out.println("broadcasting new message : " + message);
        this.messageToBroadcast = message; 
        this.notifyObservers();
    }
}
