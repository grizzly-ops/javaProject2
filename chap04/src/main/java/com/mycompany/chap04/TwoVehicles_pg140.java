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
public class TwoVehicles_pg140 {
    public static void main(String args[]) {  
    Vehicle_pg140 minivan = new Vehicle_pg140();  
    Vehicle_pg140 sportscar = new Vehicle_pg140();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
    // compute the ranges assuming a full tank of gas 
    range1 = minivan.fuelcap * minivan.mpg; 
    range2 = sportscar.fuelcap * sportscar.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range1);  
 
    System.out.println("Sportscar can carry " + sportscar.passengers + 
                       " with a range of " + range2);  
  }
}
