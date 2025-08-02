
import java.util.Arrays;

public class Creating_ArrayList {
    public static  class ArrayList{
        int [] arr= new int[2];
        int size=0;
        public void add(int element){
           if(size==arr.length){
            arr= Arrays.copyOf(arr, arr.length*2);
           }arr[size++]=element;
           
            
        }public void print(){
           for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");               
           }System.out.println("");
        }  }
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add(8);
        a1.add(7);
        a1.add(6);
        a1.add(5);
        a1.add(4);
        a1.add(3);
        a1.add(2);
        a1.add(1);
        a1.print();
        
    }
}
