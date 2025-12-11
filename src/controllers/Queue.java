package controllers;

import java.util.NoSuchElementException;

import models.Node;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        T data = first.getValue();
        first = first.getNext();
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public void pritnAllNodes() {
        Node<T> current = first;
        System.out.print("Cima -> ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

}