/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap01;

/**
 *
 * @author ndabenhle
 */
public class GalToLitTable_pg46 {

    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters 
            System.out.println(gallons + " gallons is "
                    + liters + " liters.");

            counter++;
            // every 10th line, print a blank line        
            if (counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter 
            }
        }
    }
}
