public class Deleting_the_Middle_of_Linked_List {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
        }}
    static class ll{
        Node head; Node tail;
        public  void insertAtend(int data){
            Node temp= new Node(data);
            if(head== null){
                head=temp;
                tail= temp;
            }else{
                tail.next=temp;
                tail= temp;
            }
        }public void printList(){
           Node  temp= head;
            while(temp!= null){
                System.out.print(temp.data+"--->");
                temp= temp.next;
            }System.out.print("NULL");
            System.out.println();
        } public void DeleteLeftmiddle() {
            if (head == null || head.next == null){return;} 
            Node slow = head, fast = head;
            int index = 0;
            while (fast != null && fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                index++;
            }if (index == 0) {
                head = head.next; 
                return;
            }Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }temp.next = temp.next.next;
        }  public void DeleteRightmiddle() {
            if (head == null || head.next == null) {return;}
            Node slow = head, fast = head;
            int index = 0;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                if (fast != null) {
                    slow = slow.next;
                    index++;}
            }if (index == 0) {
                head = head.next;
                return;
            }Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }temp.next = temp.next.next;}}
public static void main(String[] args) {
        ll a= new ll();
        a.insertAtend(1);
        a.insertAtend(2);
        a.insertAtend(3);
        a.insertAtend(4);
        a.printList();
        a.DeleteLeftmiddle();
        a.printList();
        a.DeleteRightmiddle();
        a.printList();
    }
}