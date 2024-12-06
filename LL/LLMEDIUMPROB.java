package LL;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head,tail;

    void middle(){

    }
    public ListNode middleNode(ListNode head) {
       
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            slow=slow.next;
        }
        return slow;
    }
    //reverse leetcode 206
    public Node reverseList(Node head) {
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node help=temp.next;
            temp.next=prev;
            prev=temp;
            head=temp;
            temp=help;
        }
        return head;

    }
}
public class LLMEDIUMPROB {
    public static void main(String[] args) {
        
    }
    
}
