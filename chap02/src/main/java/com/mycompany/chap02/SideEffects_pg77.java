/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap02;

/**
 *
 * @author ndabenhle
 */
public class SideEffects_pg77 {
    public static void main(String args[]) {    
    int i; 
 
    i = 0; 
 
    /* Here, i is still incremented even though 
       the if statement fails. */ 
    if(false & (++i < 100)) 
       System.out.println("this won't be displayed"); 
    System.out.println("if statements executed: " + i); // displays 1 
 
    /* In this case, i is not incremented because 
       the short-circuit operator skips the increment. */ 
    if(false && (++i < 100)) 
      System.out.println("this won't be displayed"); 
    System.out.println("if statements executed: " + i); // still 1 !! 
  }
}
