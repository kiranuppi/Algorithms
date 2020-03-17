package datastructures;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    int count = 0;

    public void addNode(int data) {

        Node newNode = new Node(data);

        //check if the list is empty

        if (head == null) {
            //System.out.println(" List is Empty !!");

            head = newNode;
            tail = newNode;
            count++;
        } else {
            tail.next = newNode;
            tail = newNode;
            count++;
        }


    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty !!");
            return;
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public void reverseList(Node current) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (current.next == null) {
            System.out.println(current.data + " ");
            return;
        }
        reverseList(current.next);
        System.out.println(current.data + " ");
    }


    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head != tail) {
            head = head.next;
        } else {
            head = tail = null;
        }
    }

    public void deleteFromEnd(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head != tail) {
            Node current = head;
            while(current.next != tail){
                current = current.next;

            }
            tail = current;
            tail.next = null;
        }
        else{
            head=tail=null;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(5);
        sList.addNode(4);
        sList.addNode(8);
        sList.display();
        System.out.println(" Number of nodes: " + sList.count);
        sList.reverseList(sList.head);
        sList.deleteFromBeginning();
        sList.deleteFromEnd();
        sList.display();
    }
}
