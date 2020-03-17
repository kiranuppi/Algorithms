package datastructures;

public class DoublyLinkedList {

    class Node{
        Node previous = null;
        Node next = null;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    Node head =null;
    Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);

        if(head == null){

            head=newNode;
            tail = newNode;
            head.next = null;
            head.previous = null;

        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void removeNode(int data){

    }

    public void display(){
        Node current =  head;
        if(current == null){
            System.out.println("Empty!!" );
        }
        while(current !=null){
            System.out.println("current.data = " + current.data);
            current = current.next;
        }
    }
}
