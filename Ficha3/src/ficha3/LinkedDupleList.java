/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;

/**
 *
 * @author IPT
 */
public class LinkedDupleList implements LinkedList{
    
    private Item head, tail;
    
    public LinkedDupleList() {
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            item.next = head;    
             head.previous = item;
            head = item;
        }
    }

    @Override
    public void addLast(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        item.previous = null;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            tail.next = item;
            item.previous = item;
            tail = item;
        }
    }

    @Override
    public boolean contains(Object o) {
        Item i = head;
        while ( i!=null && !i.data.equals(o) )
            i = i.next;
        return i != null;   
    }

    @Override
    public boolean remove(Object o) {
        if (head == null)  // Situação 1: lista vazia
            return false;
        else {
            if (head.data.equals(o)) {
                if (head == tail) { // Situação 2: lista com um elemento
                    head = null;
                    tail = null;
                } else { // Situação 3: apaga o primeiro elemento
                    head = head.next;
                    head.previous = null;
                }
                return true;
            }
            Item i = head.next;
            while (i != null && !i.data.equals(o))
                i = i.next;
            if (i == tail) { // Situação 4: apaga o ultimo
                tail = tail.previous;
                tail.next = null;
                return true;
            } else {
                if (i != null) { // Situação 5: apaga no meio
                    i.previous.next = i.next;
                    i.next.previous = i.previous;
                    return true;
                }
            }    
            return false; // Situação 6: Não existe
        }
    }

    @Override
    public Object peekFirst() {
        if (isEmpty())
            return null;
        return head.data;
    }

    @Override
    public Object peekLast() {
        if (isEmpty())
            return null;
        return tail.data;
    }
    
    @Override
    public String toString() {
        Item aux = head;
        StringBuilder sb = new StringBuilder();
        if (isEmpty())
            sb.append("null");
        else {
            while (aux != null) {
                sb.append(aux.data);
                sb.append(" ");
                aux = aux.next;
            }         
        }   
        return sb.toString().trim();
    }
    
    public int countOcorrences(Object o) {
        int c=0;
        Item aux = head;
        while(aux!=null) {
            if (o.equals(aux.data))
                c++;
            aux = aux.next;
        }
        return c;
        
    }
    
    private class Item {
        Object data;
        Item next;
        Item previous;
    }
    
}
