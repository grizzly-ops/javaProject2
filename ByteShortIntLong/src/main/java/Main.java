/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public class Main {
  public static void Main(String[] args){
      
      int myValue = 1000;
      
      int myMinIntValue = Integer.MIN_VALUE;
      int myMaxIntValue = Integer.MAX_VALUE;
      System.out.println("Integer Minimum Value = " + myMinIntValue);
      System.out.println("Integer Maximum Value = " + myMinIntValue);
      System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
      System.out.println("Busted MIN value = " + (myMinIntValue - 1));
      
      int myMaxIntTest = 2_147_483_647;
      
      byte myMinByteValue = Byte.MIN_VALUE;
      byte myMaxByteValue = Byte.MAX_VALUE;
      System.out.println("Byte Minimum Value = " + myMinByteValue);
      System.out.println("Byte Maximum Value = " + myMaxByteValue);
      
       
      short myMinShortValue = Short.MIN_VALUE;
      short myMaxShortValue = Short.MAX_VALUE;
      System.out.println("Short Minimum Value = " + myMinShortValue);
      System.out.println("Short Maximum Value = " + myMaxShortValue);
      
      long myLongValue = 100L;
      
      long myMinLongValue = Long.MIN_VALUE;
      long myMaxLongValue = Long.MAX_VALUE;
      System.out.println("Long Minimum Value = " + myMinLongValue);
      System.out.println("Long Maximum Value = " + myMaxLongValue);
  } 
}
