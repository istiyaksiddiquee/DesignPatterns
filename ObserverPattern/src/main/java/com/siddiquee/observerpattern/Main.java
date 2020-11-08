/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.observerpattern;

import com.siddiquee.observerpattern.interfaces.Subscriber;
import com.siddiquee.observerpattern.models.EmailTopic;
import com.siddiquee.observerpattern.models.TopicSubscriber;

/**
 *
 * @author Istiyak
 */
public class Main {
    
    public static void main(String[] args) {
        EmailTopic emailTopic = new EmailTopic();
        Subscriber firstSubscriber = new TopicSubscriber("First Subscriber"); 
        Subscriber secondSubscriber = new TopicSubscriber("Second Subscriber"); 
        Subscriber thirdSubscriber = new TopicSubscriber("Third Subscriber"); 
     
        emailTopic.register(firstSubscriber);               
        emailTopic.register(secondSubscriber);
        emailTopic.register(thirdSubscriber);
                
        firstSubscriber.setTopic(emailTopic);
        secondSubscriber.setTopic(emailTopic);
        thirdSubscriber.setTopic(emailTopic);
        
        emailTopic.postMessage("First Message");
        
        emailTopic.unregister(secondSubscriber);
        
        emailTopic.postMessage("Second Message");
    }
}