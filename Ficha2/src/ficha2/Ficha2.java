/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha2;



/**
 *
 * @author IPT
 */
public class Ficha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Limited Stack:  " + runXTimes(new LimitedStack(1000000),10));
        System.out.println("Ilimited Stack: " + runXTimes(new IlimitedStack(),10));
        System.out.println("Java Stack:     " + runXTimes(new java.util.Stack(),10));
    }

    private static long runXTimes(Stack p, int nTimes) {
        long sum=0;
        for(int i=0; i < nTimes; i++) {
            long start = System.nanoTime();
            for(int j=0; j<1000000; j++)
                p.push(Math.random());
            while(!p.isEmpty())
                p.pop();
            long end = System.nanoTime();
            sum+= end-start;
        }
        return sum/nTimes;
    }
    
        private static long runXTimes(java.util.Stack p, int nTimes) {
        long sum=0;
        for(int i=0; i < nTimes; i++) {
            long start = System.nanoTime();
            for(int j=0; j<1000000; j++)
                p.push(Math.random());
            while(!p.isEmpty())
                p.pop();
            long end = System.nanoTime();
            sum+= end-start;
        }
        return sum/nTimes;
    }

}
