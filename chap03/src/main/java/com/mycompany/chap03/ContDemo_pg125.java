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
public class ContDemo_pg125 {
    public static void main(String args[]) { 
    int i; 
 
    // print even number between 0 and 100 
    for(i = 0; i<=100; i++) {  
      if((i%2) != 0) continue; // iterate 
      System.out.println(i); 
    } 
  } 
}
