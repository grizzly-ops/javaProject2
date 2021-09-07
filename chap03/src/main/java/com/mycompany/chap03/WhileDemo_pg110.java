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
public class WhileDemo_pg110 {

    public static void main(String args[]) {
        char ch;

        // print the alphabet using a while loop 
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}
