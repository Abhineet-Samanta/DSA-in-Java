public class Deep_copy_Linked_List_using_pointer {
      static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data= data;
        }}private static  void display(Node head){
            Node temp= head;
            System.out.print("NULL"+"<--->");
            while(temp!=null){
                System.out.print(temp.data+"<--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();
        }public static void main(String[] args) {
          Node a= new Node(4);
          Node b= new Node(10);
          Node c= new Node(2);
          Node d= new Node(99);
          Node e= new Node(13);
          a.prev= null;
          a.next=b;
          b.prev=a;
          b.next=c;
          c.prev=b;
          c.next=d;
          d.prev=c;
          d.next=e;
          e.prev=d;
          e.next=null;
          display(a);
      }
}
