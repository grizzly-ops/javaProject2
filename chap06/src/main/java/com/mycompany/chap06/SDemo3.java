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
public class SDemo3 {

    public static void main(String args[]) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        System.out.println("Square root of 2 is "
                + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is "
                + StaticBlock.rootOf3);

    }
}
