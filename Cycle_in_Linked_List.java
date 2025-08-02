


public class Cycle_in_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;}
    }static  class ListNode{
        Node head;
        Node tail;
        public void add(int data){
            Node temp= new Node(data);
            if(head== null){
                head= temp;
                tail= temp;
            }else{
               tail.next = temp;
               tail = temp;
            }
        }public  void form_cycle(){
            tail.next=head.next.next;
        }public boolean detectCycle(){
          Node slow= head; Node fast= head;
          while(fast!= null){
            slow= slow.next;
            fast= fast.next.next;
            if(fast==slow){
            return true;
          }
          }
            return false;
          
        }public void Find_Node_where_cycle_begins(){
            Node slow= head; Node fast= head;
            boolean CycleDetector= false;
            while(fast != null && fast.next != null){
                slow= slow.next;
                fast= fast.next.next;
                if(fast==slow){
                    CycleDetector=true;
                    break;
                }
            }if(CycleDetector==true){
                slow= head;
                while(slow!= fast){
                    slow= slow.next;
                    fast= fast.next;

                }System.out.println("Cycle starts :-"+" "+slow.data);
            }else{
                System.out.println("No cycle Detected");
            }
            
            
        }
    }public static void main(String[] args) {
        ListNode n= new ListNode();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        n.form_cycle();
        System.out.println(n.detectCycle());
        n.Find_Node_where_cycle_begins();

    }
    
}
