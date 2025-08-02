public class Linked_List_Implementation_of_Queue {
    public static class Node{
        int data; Node next;
        public Node(int data) {
            this.data= data;
        }
    }public static class QueueLL{
        Node head= null; Node tail= null;int size=0;
        public void add(int data){
            Node temp=new Node (data);
            if(head== null){
                head= temp; tail= temp;
            }else{
                tail.next= temp;
                tail= temp;
            } size++;}
        public int peek(){
            if(size==0){
                throw new IllegalArgumentException("Queue empty error");
            }else{return  head.data;}
        }public int remove(){
            if(size==0){
                throw new IllegalArgumentException("Queue empty error");
            }else
            {int x= head.data; head= head.next;
            size--;
            return  x;}
        }public void display(){
            if(size==0){
                throw new IllegalArgumentException("Queue empty error");
            }Node temp= head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }System.out.println("");
        }public boolean isEmpty(){
            if(size==0){
                return  true;
            }return  false;}
    }public static void main(String[] args) {
        QueueLL ql1= new QueueLL();
        ql1.add(1);ql1.add(2);ql1.add(3);ql1.add(4);ql1.add(5);
        ql1.display();
        System.out.println(ql1.peek());
        System.out.println(ql1.size);
        ql1.remove();ql1.display();}}
