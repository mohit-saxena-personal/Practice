package linklist;

public class LinkListImpl {

    private Node head;
    private Node tail;

    private int size;

    public LinkListImpl() {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail=head;
        }
        size ++;
    }
    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }
    public void insert(int val,int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index ;i++)
        {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index,Node node)
    {
        if(index==0)
        {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;

        if(head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast()
    {
        if(size <= 1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        size--;
        return val;

    }
    public int delete(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return  val;
    }
    public Node get(int index)
    {
        Node node = head;
        {
            for (int i=0 ; i < index; i++)
            {
                node = node.next;
            }
        }
        return node;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void removeDuplicates(){

        Node node = head;
        while (node.next != null)
        {
            if(node.value == node.next.value)
            {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LinkListImpl mergeTwoSortedLists(LinkListImpl first, LinkListImpl second)
    {
        Node head1 = first.head;
        Node head2 = second.head;

        LinkListImpl ans = new LinkListImpl();

        while(head1 != null && head2 != null)
        {
            if(head1.value < head2.value){
                ans.insertLast(head1.value);
                head1=head1.next;
            }
            else{
                ans.insertLast(head2.value);
                head2=head2.next;
            }

        }
        while(head2!=null)
        {
            ans.insertLast(head2.value);
            head2=head2.next;
        }
        while(head1!=null)
        {
            ans.insertLast(head1.value);
            head1=head2.next;
        }
        return ans;
    }

    public static boolean hasCycle(Node head){
        Node fast =head;
        Node slow =head;
        while(fast!= null && fast.next!= null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static int lenghtOfCycle(Node head){
        Node fast =head;
        Node slow =head;
        while(fast!= null && fast.next!= null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               //calculate the lenght
                Node temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

    public Node getMid(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private void reverseUsingRecursion(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        reverseUsingRecursion(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    private Node rotateLinkList(Node head,int k) {
        if(k<=0 || head == null || head.next==null){
            return head;
        }
        Node last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for(int i=0; i<skip-1;i++)
        {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
    public void reverse()
    {
        if(size<2)
        {
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present != null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null) {
                next = next.next;
            }
        }
        head=prev;
    }

    public static void main(String[] args) {
        LinkListImpl list = new LinkListImpl();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);

        list.display();

        list.removeDuplicates();

        list.display();

        LinkListImpl firstList = new LinkListImpl();
        LinkListImpl secondList = new LinkListImpl();

        firstList.insertLast(1);
        firstList.insertLast(3);
        firstList.insertLast(5);

        secondList.insertLast(1);
        secondList.insertLast(2);
        secondList.insertLast(9);
        secondList.insertLast(15);

        LinkListImpl ans=mergeTwoSortedLists(firstList,secondList);
        ans.display();
        ans.reverse();
        ans.display();
    }
}
