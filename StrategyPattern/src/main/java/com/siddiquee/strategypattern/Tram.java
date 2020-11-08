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
public class Tram implements Vehicle {
    
    String VEHICLE_NAME = "Tram";
    
    @Override
    public String vehicleInfo() {
        return this.VEHICLE_NAME;
    }
}