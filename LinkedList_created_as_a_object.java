public class LinkedList_created_as_a_object {
    public static  class Node{

        int data;
        Node next;

        public Node(int data) {
            this.data= data;
        }

        
    }
    public static class linkedlist{
        Node head= null;
        Node tail= null;
        void insertAtEnd(int data){
            Node temp= new Node(data);
            if(head==null){
                head= temp;
                tail= temp;
            }else{
                tail.next=temp;
                tail= temp;
            }
        }void insertAtBeggining(int data){
           
            Node temp= new Node(data);
            if(head==null){
                head= temp;
                tail= temp;
            }else{
               temp.next=head;
                head= temp;
            }
        }void insert(int index, int data){
            if(index==size()){
                insertAtEnd(data);
                return;
            }else if (index==0){
                insertAtBeggining(data);
                return;
            } else if(index<0 || index>size()){
                throw new IllegalArgumentException("wrong input error");
            }
            Node temp= head;
            Node  t= new Node(data);
           for (int i = 1; i <=index-1 ; i++) {
               temp= temp.next;
           }t.next=temp.next;
           temp.next=t;


        }int GetElementAtIndex(int index){
         if(index<0 || index>size()){
                throw new IllegalArgumentException("wrong input error");
            }
          Node temp= head;
          if(index==0){
            return head.data;
          }
          for (int i = 0; i <=index; i++) {
              temp= temp.next;
          }return temp.data;
        }
    void display(){
        Node temp= head;
        while (temp != null){
            System.out.print(temp.data+"--->");
            temp= temp.next;
        }System.out.println();

    }int size(){
        Node temp= head;
        int count=0;
        while(temp!= null){
            count++;
            temp= temp.next;
        }return count;
    }void deleteAt(int index){
        Node temp=head;
        for (int i = 1; i < index-1; i++) {
            temp= temp.next;
        }temp.next=temp.next.next;
        
        if(index==0){
            head= head.next;
        }else if(index==size()){
            tail=temp;
        }
       
        
    }
    } public static void main(String[] args) {
        linkedlist list= new linkedlist();
        list.insertAtEnd(9);
        list.insertAtEnd(8);
        list.display();
        System.out.println(list.size());
        list.insertAtEnd(12);
        list.insertAtBeggining(10);
        list.display();
        list.insert(1, 8);
        list.insert(0, 8);
        System.out.println( list.size());
        list.insert(6, 8);
        list.display();
        System.out.println(list.GetElementAtIndex(0));
        list.deleteAt(0);
        list.display();
        System.out.println(list.tail.data);
        System.out.println(list.head.data);
        System.out.println(list.size());
        
    }
    
}
