/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap03;

/**
 *
 * @author ndabenhle
 */
public class ForVar_pg109 {

    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5  
        for (int i = 1; i <= 5; i++) {
            sum += i;  // i is known throughout the loop 
            fact *= i;
        }

        // but, i is not known here. 
        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
