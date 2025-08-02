public class Merge_two_sorted_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }static class Merged{
         Node head3= null; Node tail3= null;
        public  void CreateMergedadd(int data){
            Node temp3= new Node(data);
            if(head3==null && tail3==null){
                head3=  temp3;
                tail3= temp3;
            }else{
                tail3.next= temp3;
                tail3=temp3;
            }

        }public void display3(){
           
            Node tempD3= head3;
            while(tempD3 != null){
                System.out.print(tempD3.data+"--->");
                tempD3= tempD3.next;
            }System.out.print("NULL");
            System.out.println();
        }
        

    }
    static class List{
        Node head1= null; Node tail1= null; Node head2= null; Node tail2= null;
        public void add1(int data){
            Node temp1= new Node(data);
            if(head1== null){
                head1= temp1;
                tail1= temp1;
            }else{
                tail1.next= temp1;
                tail1= temp1;
            }
        }public void add2(int data){
            Node temp2= new Node(data);
            if(head2== null){
                head2= temp2;
                tail2= temp2;
            }else{
                tail2.next= temp2;
                tail2= temp2;
            }
        }public boolean isSorted1(){
            Node temp1= head1;
            while(temp1!= null && temp1.next!= null){
                if(temp1.data > temp1.next.data ){
                    return false;
                }temp1= temp1.next;
            }
            return  true;
        }public boolean isSorted2(){
            Node temp2= head2;
            while(temp2!= null && temp2.next!= null){
                if(temp2.data > temp2.next.data){
                    return  false;
                }temp2= temp2.next;
            }
            return  true;
        }public void display1(){
            Node tempD1= head1;
            while(tempD1 != null){
                System.out.print(tempD1.data+"--->");
                tempD1= tempD1.next;
            }System.out.print("NULL");
            System.out.println();
        }public void display2(){
            Node tempD2= head2;
            while(tempD2 != null){
                System.out.print(tempD2.data+"--->");
                tempD2= tempD2.next;
            }System.out.print("NULL");
            System.out.println();
        }
        
        public void Merged_Sorted_Lists_Extra_Space(){
            if(isSorted1() == false  || isSorted2()== false){
                throw  new IllegalArgumentException("Linked list not sorted error");
            }
            Node temp1= head1;
            Node temp2= head2;
            Merged m1= new Merged();
            while(temp1!= null && temp2!= null){
                if(temp1.data >= temp2.data){
                    m1.CreateMergedadd(temp2.data);
                    temp2= temp2.next;
                }else if(temp1.data< temp2.data){
                    m1.CreateMergedadd(temp1.data);
                    temp1 = temp1.next;
                }
            }while(temp2!=null){
                m1.CreateMergedadd(temp2.data);
                temp2= temp2.next;
            }while(temp1!= null){
                m1.CreateMergedadd(temp1.data);
                temp1= temp1.next;
            }m1.display3();
        }public void Merge_sorted_linked_lists_without_extra_space(){
            if(isSorted1() == false  || isSorted2()== false){
                throw  new IllegalArgumentException("Linked list not sorted error");
            }if(head1==null){
                head1= head2;
                head2= null;
                return;
            }if(head2== null){
                return;
            }if (head2.data < head1.data) {
             Node temp = head1;
             head1 = head2;
             head2 = temp;
            }
            Node temp1= head1;
            Node temp2= head2;
            while (temp1!= null && temp2!= null) { 
                if(temp1.next== null ||temp2.data<= temp1.next.data){
                     Node nextTemp2=temp2.next;
                     temp2.next=temp1.next;
                     temp1.next=temp2;
                     temp2=nextTemp2;
                }temp1= temp1.next;
            } display1();

        }
    }public static void main(String[] args) {
        List l1= new List();
        l1.add1(1);
        l1.add1(3);
        l1.add1(5);
        l1.add1(8);
        l1.add2(2);
        l1.add2(2);
        l1.add2(6);
        l1.add2(7);
        l1.display1();
        l1.display2();
        l1.Merged_Sorted_Lists_Extra_Space();
        l1.Merge_sorted_linked_lists_without_extra_space();
    }
    
}
