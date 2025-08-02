public class ListReversal {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
        }}
    static class List{
        Node head= null; Node tail= null;
        public void add(int data){
            Node temp= new Node(data);
            if(head==null){
                head= temp; tail= temp;
            }else{
                tail.next= temp; tail= temp;
            }
        }public void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data+"--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();
        }public Node reverse(Node head){
            if(head.next==null){ return head;}
            Node newHead=reverse(head.next);
            head.next.next=head;
            head.next = null; 
            return  newHead;
        }public void reverseDisplay(){
            head=reverse(head);
           Node temp= head;
           while(temp!= null){
                System.out.print(temp.data+"--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();
        }public Node reverseListIteration(){
            Node curr=head;
            Node prev= null;
            Node after= null;
            while(curr!= null){
                after= curr.next;
                curr.next=prev;
                prev= curr;
                curr= after;
            }
            head= prev;
            display();
            return head;
            
        }
    }public static void main(String[] args) {
        List l1= new List();
        l1.add(3);
        l1.add(5);
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.display();
        l1.reverseDisplay();
        l1.reverseListIteration();
       
    }
}
