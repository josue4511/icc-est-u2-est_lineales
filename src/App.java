import controllers.Queue;
import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) {
        Node<Person> nodeJ = new Node<Person>(new Person("Juan", 30));
        Node<Person> nodeM = new Node<Person>(new Person("Maria", 35));
        Node<Person> nodeP = new Node<Person>(new Person("Pepito", 31));
        Node<Person> nodeD = new Node<Person>(new Person("Diego", 25));

        nodeJ.setNext(nodeM);
        nodeM.setNext(nodeP);
        nodeP.setNext(nodeD);

        System.out.println(nodeJ.toString());
        System.out.println("");

        runStackExample();
        
    }

    public static void runStackExample(){
        Queue<Person> persons = new Queue<Person>();
        persons.enqueue(new Person("Juan", 30));
        persons.enqueue(new Person("Maria", 35));
        persons.enqueue(new Person("Pepito", 32));
        persons.enqueue(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.pritnAllNodes();
        System.out.println(persons.dequeue());
        System.out.println("Primera" + persons.getFirst());
        System.out.println("Ultima" + persons.getLast());
        System.out.println("Size=" + persons.size());
        persons.pritnAllNodes();
    }
}