package linklist;

public class Main {
    public static void main(String[] args) {
        LinkListImpl list = new LinkListImpl();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(46);
        list.insertFirst(44);
        list.insertFirst(33);
        list.insertLast(99);
        list.insert(100,2);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(3));
        list.display();
        list.insertRec(34,3);
        list.display();

        DoublyLinkList dlist = new DoublyLinkList();
        dlist.insertFirst(3);
        dlist.insertFirst(2);
        dlist.insertFirst(6);
        dlist.insertFirst(46);
        dlist.insertFirst(44);
        dlist.insertFirst(33);

        dlist.display();
        dlist.insertLast(100);
        dlist.display();
        dlist.insertAfterValue(46,47);
        dlist.display();

        CirculartLinkList clist = new CirculartLinkList();
        clist.inset(1);
        clist.inset(2);
        clist.inset(3);
        clist.inset(4);
        clist.display();
        clist.delete(3);
        clist.display();


    }
}
