/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha5;

import java.util.Random;

/**
 *
 * @author IPT
 */
public class Ficha5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeapMax h1 = new HeapMax(1000000);
        Random r = new Random();
        for(int i = 0; i < 1000000; i++)
            h1.add(r.nextInt(10000000));
        
        while(!h1.isEmpty()) {
            Comparable aux = h1.peek();
            System.out.print(aux + " ");
            h1.remove(aux);
        }
        System.out.println("");

        
    }
    
}
