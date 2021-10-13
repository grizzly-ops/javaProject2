/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap06;

/**
 *
 * @author ndabenhle
 */
public class VarArgs4 {
    // Use an int vararg parameter.  

    static void vaTest(int... v) {
        // ... 
    }

    // Use a boolean vararg parameter.  
    static void vaTest(boolean... v) {
        // ... 
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);  // OK  
        vaTest(true, false, false); // OK  

        //vaTest(); // Error: Ambiguous! 
// Varargs, overloading, and ambiguity.  
//  
// This program contains an error and will  
// not compile! 
    }
}
