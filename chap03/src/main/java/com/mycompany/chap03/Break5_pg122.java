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
public class Break5_pg122 {
    public static void main(String args[]) {  
 
done: 
    for(int i=0; i<10; i++) { 
      for(int j=0; j<10; j++) { 
        for(int k=0; k<10; k++) { 
          System.out.println(k + " "); 
          if(k == 5) break done; // jump to done 
        } 
        System.out.println("After k loop"); // won't execute 
      } 
      System.out.println("After j loop"); // won't execute 
    } 
    System.out.println("After i loop");  
  }  
}
