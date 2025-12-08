import java.util.ArrayList;
import java.util.List;

import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) {
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pepito", 25));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 30));

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println(node1.toString());
    }
}