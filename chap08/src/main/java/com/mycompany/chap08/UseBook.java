/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap08;

/**
 *
 * @author ndabenhle
 */
public class UseBook {
    public static void main(String args[]) {
        Chapter8.bookpack.Book books[] = new Chapter8.bookpack.Book[5];

        books[0] = new Chapter8.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2019);
        books[1] = new Chapter8.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2019);
        books[2] = new Chapter8.bookpack.Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015);
        books[3] = new Chapter8.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Chapter8.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
