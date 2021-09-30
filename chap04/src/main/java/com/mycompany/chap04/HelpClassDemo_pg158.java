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
public class HelpClassDemo_pg158 {
     public static void main(String args[])
    throws java.io.IOException {
    char choice, ignore;
    Help_pg157 hlpobj = new Help_pg157();

    for(;;) {
      do {
        hlpobj.showMenu();

        choice = (char) System.in.read(); 

        do { 
           ignore = (char) System.in.read(); 
         } while(ignore != '\n'); 
 
      } while( !hlpobj.isValid(choice) );

      if(choice == 'q') break;

      System.out.println("\n");


      hlpobj.helpOn(choice);
    }
  }
}
