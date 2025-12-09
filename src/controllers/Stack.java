package controllers;

import models.Node;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
    }

    
    public T pop() {
        if (isEmpty()) {
            return null;  
        }
        T data = top.getValue();
        top = top.getNext();
        return data;
    }

    
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return top.getValue();
    }

    
    public boolean isEmpty() {
        return top == null;
    }

   
    public int size() {
        int count = 0;
        Node<T> aux = top;
        while (aux != null) {
            count++;
            aux = aux.getNext();
        }
        return count;
    }

    
    public void printAllNodes() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        Node<T> current = top;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
