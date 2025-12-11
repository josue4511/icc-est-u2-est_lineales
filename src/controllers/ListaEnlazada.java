package controllers;

import models.Node;

public class ListaEnlazada<T> {
    private Node<T> head;
    private int size;

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public T deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        T value = head.getValue();
        head = head.getNext();
        size--;
        return value;
    }

    public T deleteLast() {
        if (isEmpty()) {
            return null;
        }

        if (head.getNext() == null) {
            T value = head.getValue();
            head = null;
            size--;
            return value;
        }

        Node<T> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }

        T value = current.getNext().getValue();
        current.setNext(null);
        size--;
        return value;
    }

    public boolean deleteNode(T data) {
        if (isEmpty()) {
            return false;
        }

        if (equals(head.getValue(), data)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.getNext() != null && !equals(current.getNext().getValue(), data)) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return false;
        }

        current.setNext(current.getNext().getNext());
        size--;
        return true;
    }

    private boolean equals(T a, T b) {
        if (a == null)
            return b == null;
        return a.toString().equals(b.toString());
    }

    public void printAllNodes() {
        if (isEmpty()) {
            System.out.println("Head -> (vacío)");
            return;
        }

        Node<T> current = head;
        System.out.print("Head -> " + current.getValue());
        current = current.getNext();

        while (current != null) {
            System.out.print(" -> " + current.getValue());
            current = current.getNext();
        }

        System.out.println();
    }
}