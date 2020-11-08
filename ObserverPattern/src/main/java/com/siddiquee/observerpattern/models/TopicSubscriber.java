/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.observerpattern.models;

import com.siddiquee.observerpattern.interfaces.Subscriber;
import com.siddiquee.observerpattern.interfaces.Topic;

/**
 *
 * @author Istiyak
 */
public class TopicSubscriber implements Subscriber {

    private String name;     
    private Topic topic; 

    public TopicSubscriber(String name) {
        this.name = name;
    }        
    
    @Override
    public void update() {
        String msg = (String) this.topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " No new message on this topic!");
        }
        else {
            System.out.println(name + " Retrieving message: " + msg);
        }
    }

    @Override
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
}
