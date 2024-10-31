/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author harshsolanki
 */
public class Account {
    private String name;
    private int number;
    private double initialBalance;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.initialBalance = initialBalance;
    }
    String getName(){
        return name;
    }
    
    double getBalance(){
        return initialBalance;
    }
    
    int getNumber(){
        return number;
    }
    
    boolean deposit(double amount){
        if (amount>0){
            initialBalance+=amount;
            return true;
        }
        else
            return false;
    }
    
    boolean withdraw(double amount){
        if (amount<=initialBalance && amount>=0){
            initialBalance=initialBalance-amount;
            return true;
        }
        else
            return false;      
    }
@Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";
}   
}