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
public class Bankaccount {
    private String name;
    private int age;
    private long accountnumber;
    private double balance;
    
    public Bankaccount (String name,int age, int accountnumber,double balance){
        this.name= name;
        this.age= age;
        this.accountnumber= accountnumber;
        this.balance= balance;
        
    }
    
    public void setName(String name){this.name=name;}
    public int getAge(){
        return age;}
    public void setAge (int age){ this.age=age;}
    public void deposit (double amount) {balance += amount;}
    public double getBalance(){return balance;}
    public String getSummary(){return "\nName:" + name + "\nAge:" + age + "\nAccount Number:" + accountnumber + "\nBalance:" + balance;}
    
    }

