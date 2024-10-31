/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author harshsolanki
 */
public class Node {
    private int idNode;
    private static int nodeCounter=0;
    
    public Node(){
    this.idNode = nodeCounter;
    nodeCounter++;
}
    @Override
    public String toString(){
        return ("" + this.idNode);
    }
    
}
