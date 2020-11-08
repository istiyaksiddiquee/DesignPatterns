/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.strategypattern;

/**
 * This is a demonstration for strategy pattern.
 * @author Istiyak
 */
public class MainClass {
    
    public static void main(String[] args) {
        TravelInfo travelInfo = new TravelInfo();
        
        travelInfo.setVehicle(new Bus());
        travelInfo.getTravelInformation();
        
        travelInfo.setVehicle(new Tram());
        travelInfo.getTravelInformation();
        
        travelInfo.setVehicle(new UBahn());
        travelInfo.getTravelInformation();
        
        travelInfo.setVehicle(new Plane());
        travelInfo.getTravelInformation();                
    }    
}