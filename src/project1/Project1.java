/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Admin
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Bankaccount account= new Bankaccount ("Joan", 20,104556,100);
         
         account.deposit(15.0);
         account.deposit(10.0);
           
           System.out.println(account.getSummary());
     }
}
    
    
    

