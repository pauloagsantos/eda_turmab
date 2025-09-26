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
    
    public static long runXtimesI(int value, int x) {
        int sum=0;
        for(int i = 0; i < x; i++) {
             long ini = System.nanoTime();
             Matematica.factorialI(value);
             long fim = System.nanoTime();
             sum += fim-ini;
        }
        return sum/x;
    }
    
    public static long runXtimesR(int value, int x) {
        int sum=0;
        for(int i = 0; i < x; i++) {
             long ini = System.nanoTime();
             Matematica.factorialR(value);
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
        for(int i = 1000; i <=20000; i+=1000)
            System.out.println(i+
                               ":"+
                               runXtimesI(i, 10)+
                               ":"+
                               runXtimesR(i, 10));
    }
    
}
