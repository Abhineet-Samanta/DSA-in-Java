import java.util.ArrayList;
import java.util.List;

public class FindMinAndMaxDistaceOfCritcalPoints{
    static class Node {
        int data;
        Node prev; Node next;
        public Node(int data) {
            this.data= data;
        }
    }static  class DLL{
        Node head= null; Node tail= null;
        public  void Insert(int data) {
            Node temp= new Node (data);
            if(head== null){
                head= temp; 
                tail= temp;
            }else{
                    temp.prev= tail;
                    tail.next= temp;
                    tail= temp;}
        }public void DistanceOfCriticalPoint(){
        ArrayList<Integer> positions = new ArrayList<>();
        int index = 1; 
        Node prev = head;
        Node curr = head.next;
    }
    }
    public static void main(String[] args) {
         DLL  l1= new DLL();
        l1.Insert(1);
        l1.Insert(2);
        l1.Insert(5);
        l1.Insert(3);
        l1.Insert(2);
        l1.Insert(7);
        l1.Insert(8);
        l1.Insert(9);
        l1.Insert(1);
        l1.Insert(10);
        
    }
}