public class IsPalindrome_Linked_List {
    static  class Node{
        int data; Node next;
        Node(int data){
            this.data=data;
        }
    }static class List{
        Node head= null; Node tail= null;
        public void add(int data){
             Node temp= new Node(data);
             if(head== null){
                head= temp;
                tail= temp;
             }else{
                tail.next= temp;
                tail= temp;
             }
        }public void display(){
            Node temp= head;
            while(temp!= null){
                System.out.print(temp.data+"--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();
        }public Node leftmiddle(){
            Node slow= head;
            Node fast= head;
            while(fast!= null && fast.next!=null && fast.next.next!= null){
                fast= fast.next.next;
                slow= slow.next;
            }return slow;
        }public Node reverseaftermid(Node node){
            Node prev=null; Node after;
            Node curr=node;
            while(curr!= null){
                after= curr.next; curr.next= prev; prev= curr; curr= after;
            }return prev;
        }public boolean isPalindrome(){
            if(head==null && head.next== null){
                return true;
            }Node mid=leftmiddle();
            Node secondStart=reverseaftermid(mid.next);
            Node p1= head;
            Node p2=secondStart;
            while(p2!= null){
                if(p2.data != p1.data){
                    return  false ;
                    
                }else{
                    p1= p1.next;
                    p2= p2.next;
                }
            }
            mid.next=reverseaftermid(secondStart);
            return  true;

        }
    }public static void main(String [] args){
        List a=new List();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(1);
        a.display();
        System.out.println(a.isPalindrome());
    }
}
