public class LinkedListQuestions {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
        }
        
    } static class ll{
       
        Node head=null;
        Node tail= null;
          void addFromLast(int data){
            Node temp= new Node(data);
            if(head== null){
                head= temp;
                tail= temp;
            }else{
                tail.next=temp;
                tail= temp;
            }
        }int NthNodefromEnd( int n){
                int size=0;
                Node temp1= head;
                while(temp1!= null){
                    size++;
                    temp1= temp1.next;
                }int m= size-n+1;
                temp1= head;
                for (int i = 1; i <= m-1; i++) {
                    temp1= temp1.next;
                    
                }return temp1.data;

            }public int nthNode2( int n){
                Node slow = head;
                Node fast = head;
                for (int i = 0; i < n; i++) {
                    fast= fast.next;

                }while (fast!=null) {
                    slow=slow.next;
                    fast= fast.next;
                }return slow.data;
            }public  void  deleteNthNodeFromEnd(int n){
                Node fast= head;
                Node slow= head;
            
                for (int i = 0; i <n; i++) {
                     if(fast== null){
                
                    return;
                }
                    fast= fast.next;
                }if(fast== null){
                    head= head.next;
                    return;
                }
                while(fast.next != null){
                    slow= slow.next;
                    fast = fast.next;
                }slow.next= slow.next.next;
               
            }
        public int  size(){
           Node temp= head;
           int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }return  count;
        }
        public void display(){
            Node temp= head;
           while( temp!= null){
            System.out.print(temp.data+"--->");
            temp= temp.next;
           }
            
        }
    }
    public static void main(String[] args) {
        ll a= new ll();
        a.addFromLast(3);
        a.addFromLast(4);
        a.addFromLast(8);
        a.display();System.out.println();
        System.out.println(a.size());
        System.out.println(a.NthNodefromEnd( 2));
        System.out.println(a.nthNode2(2));
        a.deleteNthNodeFromEnd(3);
        a.display();
    }
    
}
