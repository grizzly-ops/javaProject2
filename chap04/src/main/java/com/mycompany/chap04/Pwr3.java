/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap04;

/**
 *
 * @author ndabenhle
 */
public class Pwr3 {
  Pwr3(double b, int e) { 
  this.b = b; 
  this.e = e; 
 
  val = 1; 
  if(e==0) return; 
  for( ; e>0; e--) val = val * b; 
}
}
