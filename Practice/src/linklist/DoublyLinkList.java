package linklist;

public class DoublyLinkList {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head != null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next !=null)
        {
            last = last.next;
        }
        last.next=node;
        node.prev= last;
    }

    public void display()
    {
        Node node = head;
        Node last=null;
        while (node != null)
        {
            System.out.print(node.val +" -> ");
            last=node;
            node=node.next;

        }
        System.out.println("END");

        while (last != null)
        {
            System.out.print(last.val +" -> ");
            last= last.prev;
        }
        System.out.println("END");
    }

    public void insertAfterValue(int after, int val)
    {
        Node prev = find(after);
        if(prev == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.next= prev.next;
        prev.next=node;
        node.prev=prev;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }

    private Node find(int val) {
        Node node= head;
        while(node != null)
        {
            if(node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;

    }

    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
