/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siddiquee.strategypattern;

/**
 *
 * @author Istiyak
 */
public class TravelInfo {
    
    private Vehicle vehicle; 

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
        
    public void getTravelInformation() {
        String information = this.vehicle.vehicleInfo();
        System.out.println("The person travelled in: " + information);
    }
}
