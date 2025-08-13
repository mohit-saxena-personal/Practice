package dsa.linkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtFirst(23);
        list.insertAtFirst(30);
        list.insertAtFirst(32);
        list.insertAtFirst(60);
        list.insertAtFirst(10);
        list.insertLast(50);
        list.insert(3,100);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        list.insertRec(3,3);
        list.display();

    }
}
