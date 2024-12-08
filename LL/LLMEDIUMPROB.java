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
       //leetcode 142 Tortoise and Hare
       public ListNode detectCycle2(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    //find length of loop
    public int countNodesinLoop(Node head) {
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
      
               if(slow==fast){
                   fast=fast.next;
                   while(slow!=fast){
                        fast=fast.next;
                        count++;
                   }
               
              return count+1;
            }
            
        }
        return 0;
    }
    //palindrome leetcode 234
    //remove nthnode from last linkedlist leetcode19
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if (fast == null)
            return head.next;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
             slow.next=slow.next.next;

    
        return head;
    }
    //delete middle leetcode 2095
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode fast = head.next.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    //reverse k gorup 
    class Solution {
        public ListNode reverse(ListNode temp){
            ListNode prev=null;
            while(temp!=null){
                ListNode help=temp.next;
                temp.next=prev;
                prev=temp;
                temp=help;
            }
            return prev;
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            if(head==null||k==1){
                return head;
            
            }
            ListNode temp=head;
            ListNode prev=null;
            while(temp!=null){
                ListNode kthNode=kthNode(temp,k);
                if(kthNode==null){
                    if(temp!=null){
                    prev.next=temp;
    
                    }
                    break;
                }
                ListNode nextNode=kthNode.next;
                kthNode.next=null;
                reverse(temp);
                if(temp==head){
                    head=kthNode;
                }else{
                    prev.next=kthNode;
                }
                prev=temp;
                temp=nextNode;
            }
            return head;
        }
        public ListNode kthNode(ListNode temp,int k){
       
            while(temp!=null&&k>1){
                k--;
                temp=temp.next;
            }
            return temp;
        }
    }
    //rotate list
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        if (k == 0) return head;

        ListNode cur = head;
        int n = 0;

        while (cur.next != null) {
            cur = cur.next;
            n++;
        }

        int a = k % (n + 1);
        if (a == 0) return head;

        ListNode cur1 = head;
        ListNode cur2 = new ListNode(-1);
        cur2.next = head;

        while (a > 1) {
            cur1 = cur1.next;
            a--;
        }

        while(cur1.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        ListNode ans = cur2.next;
        cur2.next = null;

        if (cur != head) {
            cur.next = head;
        }

        return ans;
    }
}


public class LLMEDIUMPROB {
    public static void main(String[] args) {
        
    }
    
}
