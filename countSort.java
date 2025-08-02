public class countSort {
    private static  int max(int [] array){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }return max;
    }
    private  static int[] countarray(int [] array){
        int m=max(array);
        int [] countarray= new int[m+1];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]== i){
                    countarray[i]++;
                }
            }
           
        }return countarray;
    }private static void countSort(int [] array,int [] countarray){
       int index=0;
    for (int i = 0; i < countarray.length; i++) {
        while(countarray[i]>0){
        array[index++]=i;
        countarray[i]--;}
    } }
    private static void printarray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int [] array={0,2,0,3,4,2};
        System.out.println(max(array));
        int [] array2= countarray(array);
        printarray(array2);
        countSort(array, array2);
        printarray(array);
    }
}
