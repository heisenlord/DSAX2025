package LL;
import java.util.*;
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
    //middle using The Tortoise and Hare
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
    //reverse iterative leetcode 206
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
    //reverse recursive leetcode 206
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newhead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
        
    }
    //leetcode 141
    public boolean hasCycle(ListNode head) {
        
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
        
          fast=fast.next.next;
          slow=slow.next;
           if (slow == fast) {
                  return true;  
              }
        }
        return false;
      }

      //leetcode 142
      public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            set.add(temp);
            temp=temp.next;
        }
        return null;
    }

}
public class LLMEDIUMPROB {
    public static void main(String[] args) {
        
    }
    
}
