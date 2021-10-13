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
public class PassObjRef {

    public static void main(String args[]) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b before call: "
                + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: "
                + ob.a + " " + ob.b);
    }
}
