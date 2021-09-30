/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap04;

/**
 *
 * @author ndabenhle
 */
public class CompFuel_pg152 {
    public static void main(String args[]) {  
    Vehicle_pg152 minivan = new Vehicle_pg152();  
    Vehicle_pg152 sportscar = new Vehicle_pg152();  
    double gallons; 
    int dist = 252; 
 
     // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
 
    gallons = minivan.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles minivan needs " + 
                       gallons + " gallons of fuel."); 
     
    gallons = sportscar.fuelneeded(dist);  
  
    System.out.println("To go " + dist + " miles sportscar needs " + 
                       gallons + " gallons of fuel."); 
     
  }
}
