package dsa.linkedList;

public class MergeSort {
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

        public Node() {

        }
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
    Node merge(Node list1,Node list2){
        Node dummyHead = new Node();
        Node tail =  dummyHead;
        while(list1!=null && list2!=null){
            if(list1.value < list2.value){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1!=null) ? list1 : list2;
        return dummyHead.next;
    }
    public Node sortList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node middle = middleNode(head);
        Node left = sortList(head);
        Node right = sortList(middle);

        return merge(left,right);
    }
}
