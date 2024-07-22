
package course;

class linkedlist {
    
    private Node head;
    private Node tail;
    private int length;
     
    class Node {
        int value;
        Node next;
     
        Node(int value) {
            this.value = value;
        }
    }
    public linkedlist(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
     public void append(int value) {
        Node newnode = new Node(value);
       if (length==0){
           head = newnode;
           tail=newnode;
       }
       else {
           tail.next=newnode;
           tail=newnode;
       }
        length++;
     }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

}

// main
package course ;
import java.util.*;
import javafx.scene.Node;
public class Course{
    public static void main(String[] args) {
        linkedlist mylinkedlist = new linkedlist(1);
        mylinkedlist.append(2);
        mylinkedlist.append(3);
        mylinkedlist.append(4);
        mylinkedlist.append(5);
        mylinkedlist.printList();
        
    }
}