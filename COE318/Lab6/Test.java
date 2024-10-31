/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author harshsolanki
 */
public class Test {
    public static void main(String[] args){
        Circuit c = Circuit.getInstance();
        
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        
        Resistor r1 = new Resistor(50.0, A, B);
        Resistor r2 = new Resistor(70.0, B, C);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        
        System.out.println("\nCircuit");
        
        c.add(r1);
        c.add(r2);
        System.out.println(c.toString());
    }
}
