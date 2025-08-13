package dsa.linkedList;

public class MainCL {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(33);
        list.insert(43);
        list.insert(53);
        list.insert(63);
        list.display();
        list.delete(43);
        list.display();
    }
}
