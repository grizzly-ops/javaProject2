/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap09;

/**
 *
 * @author ndabenhle
 */
public class ExcDemo2 {

    public static void main(String args[]) {

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception  
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
