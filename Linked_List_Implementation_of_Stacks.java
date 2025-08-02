public class Linked_List_Implementation_of_Stacks {
    static class  Node {
        int data; Node next;
        public Node(int data) {
            this.data=data;
        }   
    }public static class Implementation_of_Stack{
        Node head= null;
        int size=0;
        void push(int x){
            Node temp= new Node(x);
            temp.next= head;
            head= temp;
            size++;
        }void display(){
            Node temp=head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }System.out.println();
        }int size(){
            return size;
        }int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }int x= head.data;
            head= head.next;
            return x;
        }int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }return head.data;
        }
    }public static void main(String[] args) {
    Implementation_of_Stack st= new Implementation_of_Stack ();
        st.push(8);
        st.display();
        st.push(16);
        st.display();
        st.push(8);
        st.display();
        System.out.println(st.peek());
        System.out.println("size is ="+" "+st.size());
        st.pop();
        st.display();
    
    }
}
