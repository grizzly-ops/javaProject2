/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap07;

/**
 *
 * @author ndabenhle
 */
public class IncompatibleRef {

    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        Y y = new Y(5);

        x2 = x; // OK, both of same type 

        x2 = y; // Error, not of same type 
    }
}
