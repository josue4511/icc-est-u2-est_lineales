package controllers;

import models.Node;

public class ListaEnlazada <T> {
    public Node<T> head;
    private int size = 0;


    public void append(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public void deleteFirst() {
        if (head == null) return; 

        head = head.next;
        size--;
    }


    public void deleteLast() {
        if (head == null) return; 

        if (head.next == null) { 
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) { 
                current = current.next;
            }
            current.next = null; 
        }
        size--;
    }

    public void deleteNode(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public int getSize() {
        return size;
    }
}