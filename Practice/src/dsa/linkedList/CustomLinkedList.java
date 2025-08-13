package dsa.linkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    CustomLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void insertLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int index,int val){
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index, Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    //ques
    public void duplicates(){
        Node node = head;
        while(node.next != null) {
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static CustomLinkedList merge(CustomLinkedList first,CustomLinkedList second){
        Node f = first.head;
        Node s = second.head;

        CustomLinkedList ans = new CustomLinkedList();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        return ans;
    }
    public boolean isHappy(int n)
    {
        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
        }
        return slow;
    }
    //recursion reverse
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //in-place reversal
    public void reverse(){
        if(head == null){
            return  ;
        }
        if(size<2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
    }
    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList list2 = new CustomLinkedList();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

        CustomLinkedList ans = CustomLinkedList.merge(list1,list2);
        ans.display();
        //System.out.println(ans.middleNode(list1.head).value);
        ans.reverse();
        ans.display();
    }
}
