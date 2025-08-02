public class Intersection_of_two_Linked_Lists {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data= data;}
    }static  class ListNode{
       Node head1= null;
       Node head2= null;
       Node tail1= null;
       Node tail2= null;
       public void insertatend1(int data){
           Node temp= new Node(data);
           if(head1==null){
               head1=temp;
               tail1= temp;
           }else{
            tail1.next=temp;
            tail1= temp;
           }
       }public void insertatend2(int data){
           Node temp= new Node(data);
           if(head2==null){
               head2=temp;
               tail2= temp;
           }else{
            tail2.next=temp;
            tail2= temp;
           }
       }public void createintersection(){
        if(tail2!= null && head1 != null){
           tail2.next= head1.next.next.next.next;
        }}public int getIntersection(){
           Node tempA= head1;
            Node tempB= head2;
            int lengthA=0;
            while (tempA!= null){
                 if (head1 == null || head2 == null) {
                return -1;}
                lengthA++;
                tempA=tempA.next;
            }int lengthB=0;
            while (tempB!= null){
                lengthB++;
                tempB=tempB.next;
            }tempA= head1;
            tempB= head2;
            if(lengthA>lengthB){
                int steps=lengthA-lengthB;
                for (int i = 0; i <steps; i++) {
                    tempA=tempA.next;
                    
                }
            }else{
                int steps=lengthB-lengthA;
                for (int i = 0; i <steps; i++) {
                    tempB=tempB.next;
                    
                }
            }while(tempA!=tempB){
                tempA=tempA.next;
                tempB=tempB.next;
            }return  tempA.data;
        }
       
    }
    public static void main(String[] args) {
        ListNode l1= new ListNode();
        l1.insertatend1(87);
        l1.insertatend1(100);
        l1.insertatend1(13);
        l1.insertatend1(14);
        l1.insertatend1(5);
         l1.insertatend1(12);
          l1.insertatend1(10);
        l1.insertatend2(90);
        l1.insertatend2(9);
       
        
        l1.createintersection();
        int intersection = l1.getIntersection();

        if (intersection != -1) {
            System.out.println("Intersection at node with value: " + intersection);
        } else {
            System.out.println("No intersection");
        }
        
    }
}
