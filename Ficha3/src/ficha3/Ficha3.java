/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author IPT
 */
public class Ficha3 {

    private static long runxtimes(LinkedList ll, int ntimes) {
        long sum = 0;
        for(int j=0; j<ntimes; j++) {
            long ini = System.nanoTime();
            Random r = new Random();
            for(int i = 0; i < 1000000; i++)
                ll.addFirst(r.nextInt(100)+1);
            for(int i = 1; i<=100; i++) {
                ll.countOcorrences(i);
            }
            long fim = System.nanoTime();
            sum+=fim-ini;
        }
        return sum/ntimes;
    }
    
    private static long runxtimes(java.util.LinkedList ll, int ntimes) {
        long sum = 0;
        for(int j=0; j<ntimes; j++) {
            long ini = System.nanoTime();
            Random r = new Random();
            for(int i = 0; i < 1000000; i++)
                ll.addFirst(r.nextInt(100)+1);
            for(int i = 1; i<=100; i++) {
                ListIterator it = ll.listIterator();
                int c=0;
                while (it.hasNext())
                    if (it.next().equals(i))
                        c++;
            }
            long fim = System.nanoTime();
            sum+=fim-ini;
        }
        return sum/ntimes;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LinkedSingleList: " + runxtimes(new LinkedSingleList(),10));
        System.out.println("LinkedDupleList : " + runxtimes(new LinkedDupleList(),10));
        System.out.println("Java LinkedList : " + runxtimes(new java.util.LinkedList(),10));
    
    }
    
}
