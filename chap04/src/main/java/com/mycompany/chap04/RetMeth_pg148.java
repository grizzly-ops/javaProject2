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
public class RetMeth_pg148 {
    public static void main(String args[]) {  
    Vehicle_pg148 minivan = new Vehicle_pg148 ();  
    Vehicle_pg148  sportscar = new Vehicle_pg148 ();  
 
    int range1, range2;  
  
    // assign values to fields in minivan 
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    // assign values to fields in sportscar 
    sportscar.passengers = 2; 
    sportscar.fuelcap = 14; 
    sportscar.mpg = 12; 
  
    // get the ranges 
    range1 = minivan.range(); 
    range2 = sportscar.range(); 
 
 
    System.out.println("Minivan can carry " + minivan.passengers + 
                     " with range of " + range1 + " Miles"); 
 
 
    System.out.println("Sportscar can carry " + sportscar.passengers + 
                     " with range of " + range2 + " miles"); 
     
  } 
}
