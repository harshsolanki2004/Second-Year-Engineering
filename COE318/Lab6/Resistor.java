/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author harshsolanki
 */
public class Resistor {
    private double resistance;
    private  Node node1;
    private Node node2;
    private int idResistor;
    private static int resistorCounter = 0;
    
    public Resistor(double resistance, Node node1, Node node2){
        if (resistance<0){
            throw new IllegalArgumentException("Resistance must be positive.");
        }
        
        if (node1 == null || node2 == null){
            throw new IllegalArgumentException ("Both nodes must exist.");
        }
        
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        
        this.idResistor = resistorCounter;
        resistorCounter++;
    }
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    @Override
    public String toString(){
        return ("R" + idResistor + " " + node2 + " " + resistance);
    }
}
