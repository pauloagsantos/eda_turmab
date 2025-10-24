/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha4;

/**
 *
 * @author IPT
 */
public class BinarySearchTree implements Tree {
    
    private Node root;
    
    public BinarySearchTree() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void add(Comparable o) {
        Node node = new Node();
        node.data = o;
        node.left = null;
        node.rigth = null;
        if (root == null)
            root = node;
        else
            add(root, node);    
    }
    
    private void add(Node current, Node node) {
        if (node.data.compareTo(current.data)<0)
            if (current.left == null)
                current.left = node;
            else
                add(current.left, node);
        else if (current.rigth == null)
            current.rigth = node;
        else
            add(current.rigth, node);
    }

    @Override
    public boolean contains(Comparable o) {
        return contains(root, o);
    }
    
    private boolean contains(Node current, Comparable o) {
        if (current == null)
            return false;
        else if (current.data.equals(o))
            return true;
        else if (o.compareTo(current.data)<0)
            return contains(current.left, o);
        else
            return contains(current.rigth, o);
    }

    @Override
    public boolean remove(Comparable o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comparable findMin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Comparable findMax() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void show() { 
        show(root, 0, 0); 
    } 
    
    private void show(Node current, int level, int dir) { 
        if (current!=null) { 
            show(current.rigth, level+1, 1); 
            for(int i=0; i < level; i++) 
                System.out.print("   "); 
            if (dir > 0) System.out.print("/"); 
            if (dir < 0) System.out.print("\\"); 
            System.out.println(current.data); 
            show(current.left, level+1, -1); 
        } 
    }
    
    
    private class Node {
        Comparable data;
        Node left;
        Node rigth;
    }
    
}
