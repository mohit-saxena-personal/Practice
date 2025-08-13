package dsa.linkedList;

public class CircularLinkedList {
    class Node {
        int value;
        Node next;
        Node(int value)
        {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value +" -> ");
                node = node.next;
            }while(node != head);
            System.out.print("HEAD");
        }
    }
    public void delete(int val){
        Node node = head;
        if(node.value == val){
            head = head.next;
            tail = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
}
