/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha1;

/**
 *
 * @author IPT
 */
public class Ficha1 {
    
    public static long runXtimes(int value, int x) {
        int sum=0;
        for(int i = 0; i < x; i++) {
             long ini = System.nanoTime();
             Matematica.factorialI(value);
             long fim = System.nanoTime();
             sum += fim-ini;
        }
        return sum/x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(runXtimes(1000, 10));
    }
    
}
