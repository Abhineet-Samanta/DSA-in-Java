public class array {
    private  static  void printarray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }System.out.println();
    }
    public static void main(String[] args) {
            int array[] ={1,2,3,4,5};
            for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }System.out.println("");
             int arr_2[]=array;
            printarray(arr_2);
            arr_2[1]=0;
            arr_2[2]=0;
            System.out.println("After changing:-");
            printarray(array);
            printarray(arr_2);


    }
    

    
}
