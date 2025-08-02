public class Linked_List_creation_of_function {
    static class Node {
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data= data;}
    }static class DoubleLinkedList{
        Node head= null; Node tail= null;
        public void Insertion_At_Head(int data){
              Node temp= new Node (data);
              if(head==null){
                head=temp;
                tail= temp;
              }else{
               temp.next= head;
               head.prev=temp;
               head= temp;
              }
        }public void Insertion_At_Tail(int data){
            Node temp= new Node (data);
              if(head==null){
                head=temp;
                tail= temp;
              }else{
                temp.prev= tail;
                tail.next=temp;
                tail= temp;}
        }public void Insert_At_tail(int data){
            Node temp= head;
            while(temp.next!= null){
                temp= temp.next;
            }Node t= new Node(data);
            temp.next=t;
            t.prev=temp;
        }public void Insert_At_Index(int data, int index){
          Node t= head;
          if(index==0){
            Insertion_At_Head(data);
            return;
          }for (int i = 0; i < index-1; i++) {
            if(t!= null){
            t= t.next;}
            else{break;}
          } if(t == null || t.next==null){
            Insertion_At_Tail(data);
            return;
          }Node temp= new Node(data);
          t.next.prev= temp;
           temp.prev= t;
           temp.next=t.next;
           t.next= temp;
        }public  void DeleteHead(){
          if(head == null){
            throw  new IllegalArgumentException("NOT POSSIBLE");
          }if (head.next == null) {
            head = tail = null;
          }else{
          head= head.next;
          head.prev= null;}
        }public void DeleteTailUpgrade(){
          if(head == null){
            throw  new IllegalArgumentException("NOT POSSIBLE");
          }if (tail.prev == null) {
          head = tail = null;
          }tail= tail.prev;
          tail.next=null;
        }public void DeleteTail(){
          if(head == null){
            throw  new IllegalArgumentException("NOT POSSIBLE");
          }if(head.next==null){
            head= tail= null; return;
          }Node temp= head;
           while(temp.next!= null){
             temp= temp.next;
           }temp.prev.next = null;
            tail = temp.prev;
        }public void Display(){
          Node temp= head;
            System.out.print("NULL"+"<--->");
            while(temp!=null){
                System.out.print(temp.data+"<--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();}
    }public static void main(String[] args) {
        DoubleLinkedList l1= new DoubleLinkedList();
        l1.Insertion_At_Head(0);
        l1.Insertion_At_Head(8);
        l1.Insertion_At_Tail(8);
        l1.Insert_At_tail(8);
        l1.Insertion_At_Tail(16);
        l1.Insert_At_tail(8);
        l1.Insert_At_Index(9, 3);
        l1.Insert_At_Index(888, 4);
        l1.DeleteTail();
        l1.DeleteHead();
        l1.DeleteTailUpgrade();
        l1.Display();}}
