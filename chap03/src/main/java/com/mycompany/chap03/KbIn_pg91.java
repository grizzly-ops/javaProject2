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
public class KbIn_pg91 {

    public static void main(String args[])
            throws java.io.IOException {

        char ch;

        System.out.print("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a char 

        System.out.println("Your key is: " + ch);
    }
}
