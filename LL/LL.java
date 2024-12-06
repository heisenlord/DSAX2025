package LL;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;

    }
}
class LinkedList{
    Node head,tail;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //striver gfg insert
    // Node insertAtEnd(Node head, int x) {
    //     Node newNode=new Node(x);
    //   if(head==null){
    //       head=newNode;
    //       return head;
    //   }
    //   Node temp=head;
    //   while(temp.next!=null){
    //       temp=temp.next;
    //   }
    //   temp.next=newNode;
    //   return head;
    // }
    void delete(int num){
        if(head.data==num){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=head;
        while(temp!=null){
            if(temp.data==num){
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;


        }
    }
    //leetcode 237
    // public void deleteNode(ListNode node) {
    //     node.val=node.next.val;
    //     node.next=node.next.next;
    //  }
    //count GFG
    // public int getCount(Node head) {
    //     int count=0;
    //     while(head!=null){
    //         count++;
    //         head=head.next;
    //     }
    //     return count;
    // }
    //search key GFG
    // static boolean searchKey(int n, Node head, int key) {
    //     for(int i=0;i<n;i++){
    //         if(head.data==key){
    //             return true;
    //         }
    //         head=head.next;
    //     }
    //     return false;
    // }



    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
class LL{
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.display();
        list.delete(10);
        list.display();
        list.delete(50);
        list.display();

        
    }
}