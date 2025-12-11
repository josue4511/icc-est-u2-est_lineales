package models;

public class Node<T> {
    private T value;
    public Node<T> next;
    private Node<T> prev;
    public Object data;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Node [value="+ value + ", next="+ next + "]";
    }
}