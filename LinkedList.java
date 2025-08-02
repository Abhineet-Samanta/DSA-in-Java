public class LinkedList {
     public static  class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data= data;
        }}
    public static int displayLength(Node head, int count){
        if(head==null){
            return count;}
      return  displayLength(head.next, count+1);
    }public static int displayLengthiteration(Node head, int count){
        while(head!= null){
            head= head.next;
            count++;
        }return  count;
    }public static void printLength(Node head ){
         System.out.println( displayLength(head, 0));
         System.out.println(displayLengthiteration(head, 0));
    }static void displayr(Node head){
        Node temp= head;
        if(temp ==null){return;}
        System.out.print(temp.data+"---->");
         displayr(temp.next);}
       public static void main(String[] args) {
        Node x= new Node(0);
        Node y= new Node(8);
        Node z= new Node (9);
        x.next= y; y.next=z;
        displayr(x);
        printLength(x);}}
