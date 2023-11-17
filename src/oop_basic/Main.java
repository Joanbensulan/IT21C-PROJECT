/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_basic;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cake cake1 = new Cake("Banana Cake",500.00);
       
        cake1.showCakePrice();
        cake1.showCakeName();       
    }
    
}