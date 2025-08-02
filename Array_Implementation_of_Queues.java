public class Array_Implementation_of_Queues {
    public static  class QueueArray{
        int f=-1; int r=-1; int size=0; int [] array= new int[100];
        public void add(int val){
            if (r==array.length-1)
            {throw  new IllegalArgumentException("Queue is full");}
            if(f==-1){ f=0; r=0;array[0]=val;}
            else{array[++r]=val;}size++;}
        public int remove(){
            if(size==0)
            {throw  new IllegalArgumentException("Queue is empty");}
            f++;size--; return  array[f-1];
        }public  int peek(){
             if(size==0)
            {throw  new IllegalArgumentException("Queue is empty");}
            return  array[f];
        }public  boolean  isEmpty(){
            if(size==0){return  true;}
            else{ return  false;}
        }public void display(){
            if(size==0)
            {throw  new IllegalArgumentException("Queue is empty");}
            else {
                for (int i = f; i <= r; i++) {
                    System.out.print(array[i]+" ");
                }
            }System.out.println();}
    }public static void main(String[] args) {
        QueueArray qa1= new QueueArray();
        qa1.add(1);qa1.add(2);qa1.add(3);qa1.add(4);qa1.add(5);
        qa1.display();
        qa1.remove(); qa1.display();
        System.out.println(qa1.peek());
        System.out.println(qa1.size);
    }
}
