/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap08;

/**
 *
 * @author ndabenhle
 */
public class MyIFImp2 implements MyIF {

    // Here, implementations for both getUserID( ) and getAdminID( ) are 
    // provided. 
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}
