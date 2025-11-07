/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficha6;

/**
 *
 * @author IPT
 */
public class Ficha6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AVLTree t = new AVLTree();
        t.add(9);
        t.add(15);
        t.add(21);
        t.add(25);
        t.add(27);
        
        t.add(4);
        t.add(6);
        t.add(8);
        t.add(10);
        t.add(12);
        
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(5);
        t.add(7);
        

        
        t.remove(3); 
        t.remove(6);
        t.remove(9);
    
        t.show();
    }
    
}
