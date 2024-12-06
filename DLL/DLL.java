package DLL;
class Node{
    int data;
    Node next,prev;
    public Node(int data){
        this.data=data;

    }
}
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
class DoublyLL{
    Node head,tail;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    //insert at any pos in GFG
    Node addNode(Node head, int p, int x) {
        Node node=new Node(x);
        Node temp=head;
        for(int i=0;i<p;i++){
            temp=temp.next;
        }   
        node.prev=temp;
        node.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=node;
        }
        temp.next=node;
        return head;
    }



    // Delete pos GFG pos start=1
    public Node deleteNode(Node head, int x) {
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        Node temp=head;
       for(int i=1;i<x-1;i++){
           temp=temp.next;
       } 
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
        return head;       
    }


   //reverse DLL
   public DLLNode reverseDLL(DLLNode head) {
    DLLNode temp=head;
    while(temp!=null){
        DLLNode help=temp.next;
        temp.next=temp.prev;
        temp.prev=help;
                    head=temp;

        temp=help;
    }
    return head;
    
}

}
public class DLL {
    public static void main(String[] args) {
        
    }
    
}
