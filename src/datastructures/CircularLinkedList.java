package datastructures;

public class CircularLinkedList {

    class Node{
        int data;
        Node previous = null;
        Node next = null;

        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data){

        Node newNode = new Node(data);

        if(head == null){
            head=newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next=newNode;
            tail= newNode;
            tail.next = head;
        }
    }

    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("Linked Listis Empty !!");

        }else{
            do{
                System.out.println(current.data + " ");
                current = current.next;
            }while(current !=head);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addNode(2);
        cll.addNode(5);
        cll.addNode(1);
        cll.addNode(7);

        System.out.printf("The Nodes of the linked list are.... \n");
        cll.display();
    }
}
