package DLL;
class Node{
    int data;
    Node next,prev;
    public Node(int data){
        this.data=data;

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
}
public class DLL {
    public static void main(String[] args) {
        
    }
    
}
