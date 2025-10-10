/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha3;

/**
 *
 * @author IPT
 */
public class LinkedSingleList implements LinkedList{
    
    private Item head, tail;
    
    public LinkedSingleList() {
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
        if (head == null) {
            head = item;
            tail = item;
        } else {
            item.next = head;          
            head = item;
        }
    }

    @Override
    public void addLast(Object o) {
        Item item = new Item();
        item.data = o;
        item.next = null;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            tail.next = item;
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
            Item i = head;
            if (i.data.equals(o)) {
                if (head == tail) { // Situação 2: lista com um elemento
                    head = null;
                    tail = null;
                } else // Situação 3: apaga o primeiro elemento
                    head = head.next;
                return true;
            }
            while (i.next != null && !i.next.data.equals(o))
                i = i.next;
            if (i.next != null) {
                if (i.next == tail) // Situação 4: apaga o ultimo
                    tail = i;
                i.next = i.next.next; // Situação 5: apaga no meio
                return true;
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
    
    private class Item {
        Object data;
        Item next;
    }
    
}
