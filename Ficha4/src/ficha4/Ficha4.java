/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha4;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author IPT
 */
public class Ficha4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long ini, end;
        
                ini = System.nanoTime();
        BinarySearchTree t = new BinarySearchTree();
        for(int i = 0; i < 1000000; ) {
            double r = Math.random();
            if(!t.contains(r)) {
                t.add(r);
                i++;
            }
        }
        end = System.nanoTime();      
        System.out.println("Arvore      :" + (end-ini));
        
        
        ini = System.nanoTime();
        LinkedList l = new LinkedList();
        for(int i = 0; i < 1000000; ) {
            double r = Math.random();
            if(!l.contains(r)) {
                l.addFirst(r);
                i++;
            }
        }
        end = System.nanoTime();      
        System.out.println("Lista Ligada:" + (end-ini));
    }
    
}
