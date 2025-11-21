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
        Node nodeToRemove = find(o);
        if (nodeToRemove == null)
            return false;
        else {
            Node parent = findParent(o);
            if (root.left == null && root.rigth == null) // árvore apenas com um elemento
                root = null;
            else if (root.data.equals(o) && root.left == null && root.rigth != null) 
                root = root.rigth;
            else if (root.data.equals(o) && root.left != null && root.rigth == null) 
                root = root.left;
            else if (nodeToRemove.left == null && nodeToRemove.rigth == null) // caso 1: Folha
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = null;
                else
                    parent.rigth = null;
            else if (nodeToRemove.left == null && nodeToRemove.rigth != null) // caso 2.1: Um descendente à direita
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.rigth;
                else
                    parent.rigth = nodeToRemove.rigth;
            else if (nodeToRemove.left != null && nodeToRemove.rigth == null) // caso 2.2: Um descendente à esquerda
                if (nodeToRemove.data.compareTo(parent.data)<0)
                    parent.left = nodeToRemove.left;
                else
                    parent.rigth = nodeToRemove.left;
            else { // caso 3: Dois descendentes
                Node majorNode = nodeToRemove.left;
                while (majorNode.rigth != null)
                    majorNode = majorNode.rigth;
                Node parentMajorNode = findParent(majorNode.data);
                if (parentMajorNode == nodeToRemove)
                    parentMajorNode.left = majorNode.left;
                else
                    parentMajorNode.rigth = majorNode.left;
                nodeToRemove.data = majorNode.data;
            }
            return true;
        }
    }
    
    private Node findParent(Comparable o) {
        return findParent(root, o);
    }
 
    private Node findParent(Node current, Comparable o) {
        if (o.equals(current.data))
            return null;
        else {
            if (o.compareTo(current.data)<0)
                if (current.left == null)
                    return null;
                else if (current.left.data.equals(o))
                    return current;
                else
                    return findParent(current.left, o);
            else if (current.rigth == null)
                return null;
            else if (current.rigth.data.equals(o))
                return current;
            else
                return findParent(current.rigth, o);
        }
    }
    
    private Node find(Comparable o) {
        return find(root, o);
    }
    
    private Node find(Node current, Comparable o) {
        if (current == null)
            return null;
        else if (current.data.equals(o))
            return current;
        else if (o.compareTo(current.data)<0)
            return find(current.left, o);
        else
            return find(current.rigth, o);
    }
    

    @Override
    public Comparable findMin() {
        if (root == null)
            return null;
        else
            return findMin(root);    
    }
    
    private Comparable findMin(Node current) {
        if (current.left == null)
            return current.data;
        else
            return findMin(current.left);
    }

    @Override
    public Comparable findMax() {
        if (root == null)
            return null;
        else
            return findMax(root);
    }
    
     private Comparable findMax(Node current) {
        if (current.left == null)
            return current.data;
        else
            return findMax(current.rigth);
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
    
    public boolean isLeaf(Comparable o) {
        return isLeaf(root, o);
    }
    
    private boolean isLeaf(Node current, Comparable o) {
        if (current == null)
            return false;
        else if (current.data.equals(o))
            return current.left == null && current.rigth == null;
        else if (o.compareTo(current.data)<0)
            return isLeaf(current.left, o);
        else
            return isLeaf(current.rigth, o);
    }
    
    public boolean isUnique(Comparable o) {
        return isUnique(root, o);
    }
    
    private boolean isUnique(Node current, Comparable o) {
        if (current == null)
            return false;
        else if (current.data.equals(o))
            return !contains(current.rigth, o);
        else if (o.compareTo(current.data)<0)
            return isUnique(current.left, o);
        else
            return isUnique(current.rigth, o);
    }
    
    
    private class Node {
        Comparable data;
        Node left;
        Node rigth;
    }
    
}
