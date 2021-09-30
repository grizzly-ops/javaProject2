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
public class VehicleDemo_pg138 {
    public static void main(String args[]) {  
    Vehicle_pg138 minivan = new Vehicle_pg138();  
    int range;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // compute the range assuming a full tank of gas 
    range = minivan.fuelcap * minivan.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range);  
  }  
}
